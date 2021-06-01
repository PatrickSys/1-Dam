package Parking;

/************************************************************************
 Made by        PatrickSys
 Date           09/02/2021
 Package        Parking
 Version        3.0
 Description: Final review of the parking.
 ************************************************************************/

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;


public class Parkingv3_Patrick_Rossello {


    /**
     * Atributs de classe
     */

    public enum TipusPlacesParking {Discapacitat, No_Discapacitat}
    private int places_no_discapacitats;
    private int places_discapacitats;
    private int places_discapacitats_lliures;
    private int places_no_discapacitats_lliures;
    ArrayList<String> matriculesNoDiscapacitats = new ArrayList<>(); //Arraylist  les matricules de ND del parking
    ArrayList<String> matriculesDiscapacitats = new ArrayList<>();
    Pattern p = Pattern.compile("[0-9]{4}[A-Z]{3}");   //Instanciam patró a seguir



    /**
     *Constructor
     */
    public Parkingv3_Patrick_Rossello(int places_no_discapacitats, int places_discapacitats) {


        this.places_discapacitats = places_discapacitats;
        this.places_no_discapacitats = places_no_discapacitats;
        this.places_discapacitats_lliures = this.places_discapacitats;
        this.places_no_discapacitats_lliures = this.places_no_discapacitats;

    }


    /**
     * Llegeix matrícules per a omplir el parking a partir d'un arxiu
     * Comprova que el fitxer existeixi, i que les matrícules estiguin en el format correcte
     * @param path ruta del fitxer a llegir
     */
    public void llegirMatricules(String path) throws Exception {

        //atributs de mètode
        StringBuilder matriculesLlegides = new StringBuilder();
        String matricula;
        String linea;

        //Crea instància fitxer per a verificar que existeixi i que sigui llegible
        File fitxer = new File(path);

        if (!fitxer.exists() || !fitxer.canRead()) {
            throw new Exception("ALERTA =====> Fitxer incorrecte o inexistent.");  //Si la ruta no es pot accedir, llença la excepció
        }





            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            linea=br.readLine(); //assignam a linea la proxima linea de l'arxiu

            //Llegeix l'arxiu especificat i el converteix a un String
            while (linea != null) {


                Matcher m = p.matcher(linea);

                //Si a l'hora de llegir alguna linea no compleix el patró, llança excepció i ignora la linea
                try {

                    if (!m.matches()) { //si la matricula llegida no compleix el patró, llença excepció i seguim llegint

                        throw new Exception("ALERTA =====> Matricula incorrecte.");
                    }

                    matricula = linea;
                    matriculesLlegides.append(matricula.replace("null", "").replace(" ", "")); //agrupam totes les linies llegides a un string, reemplaçant valors null i linees buides
                    linea=br.readLine();

                }catch(Exception e){ //Si una matricula és incorrecte, agafam l'excepció i passam a la seguent linea
                    e.printStackTrace();
                    linea=br.readLine();
                }

            }
            //Separa totes les matricules una a una
            for (int i = 0; i < (matriculesLlegides.length() / 7); i++) {

                int a = i * 7;
                matricula = matriculesLlegides.substring(a, a + 7);

                //S'omplirà el parking aleatòriament
                if(Math.random()*10>6){
                    try {
                        entraCotxeDiscapacitat(matricula);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                else{
                    try {
                        entraCotxe(matricula);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }

        }



    /**
     *Mètode entraCotxe. Controla diverses excepcions,
     *finalment afegeix un cotxe al parking si no s'ha llençat cap excepció
     *@param matricula matricula del cotxe a entrar
     *@return plaça ocupada al parking de no discapacitats
     */
    public int entraCotxe(String matricula) throws Exception {

        //Cream "matcher" per al patró a seguir, com a paràmetre la matrícula
        Matcher m = p.matcher(matricula);
        if (!m.matches())  {  //si el patró no es segueix, llança excepció i el cotxe no entra
            throw new Exception("ALERTA =====> Matrícula incorrecte.");
        }

        //Excepció: Si el cotxe ja és al parking, no entra
        if (matriculesNoDiscapacitats.contains(matricula)||matriculesDiscapacitats.contains(matricula))  {
            throw new Exception("El cotxe ja està al parking. No pot entrar.");
        }


        if (places_no_discapacitats_lliures == 0){ //Si no hi ha places lliures de no discapacitats, no entra al parking, ni encara que sigui un "garrulo"
            throw new Exception("ALERTA =====> Parking per no discapacitats ple.");
        }

        if (Math.random() * 10 > 7 && this.places_discapacitats_lliures > 0) {  //probabilitat de que un cotxe no discapacitat sigui un garrulo
            matriculesDiscapacitats.add(matricula);
            this.places_discapacitats_lliures--;
            throw new Exception("ALERTA =====> Garrulo detected!!! Ha aparcat a la plaça: " + matriculesDiscapacitats.indexOf(matricula));

        }


        //Si no s'ha llençat cap excepció el cotxe de no discapacitat entra al parking
        //el cotxe mira si primer hi ha una plaça "buida" d'un cotxe que hagi partit
        else if(comprovarbuit(TipusPlacesParking.No_Discapacitat)>=0){
            matriculesNoDiscapacitats.set(comprovarbuit(TipusPlacesParking.No_Discapacitat),matricula );
            this.places_no_discapacitats_lliures--;
        }

        //si no en troba, entra a la primera lliure
        else {
            matriculesNoDiscapacitats.add(matricula);
            this.places_no_discapacitats_lliures--;
        }
        //si la ocupació supera el 85%, avisa
        if (getPlacesOcupades(TipusPlacesParking.No_Discapacitat) > places_no_discapacitats * 85 / 100) {
            throw new Exception("ALERTA =====> Ocupació de places per no discapacitats supera el 85%.");

        }

        return matriculesNoDiscapacitats.indexOf(matricula);

    }


    /**
     *Mètode per entrar un Cotxe de discapacitat.Controla diverses excepcions,
     *finalment afegeix un cotxe al parking corresponent si no s'ha llençat cap excepció
     *Si no hi ha lloc al seu parking, intentarà entrar al parking de no discapacitats
     *@param matricula matricula del cotxe a entrar
     *@return plaça ocupada al parking, sigui el seu o no
     */
    public int entraCotxeDiscapacitat(String matricula) throws Exception {


        Matcher m = p.matcher(matricula); // Si la matrícula no respecta el pattern, llençam l'excepció
        if (!m.matches()) {
            throw new Exception("ALERTA =====> Matrícula incorrecte.");
        }

        //si ja esta al parking, no pot entrar
        else if (matriculesDiscapacitats.contains(matricula)||matriculesNoDiscapacitats.contains(matricula))  {
            throw new Exception("El cotxe ja està al parking. No pot entrar.");
        }


        //Si ambdós parkings estan plens, directament no pot entrar
        else if (this.places_discapacitats_lliures == 0 && this.places_no_discapacitats_lliures==0) {
            throw new Exception("ALERTA =====> Parking per discapacitats ple.");
        }

        //Intentam primer que un cotxe discapacitat entri al parking de discapacitats
        else if (places_discapacitats_lliures>0) {


            //Si hi ha algun buit de un cotxe que ha partit, el cotxe s'hi fica
            if(comprovarbuit(TipusPlacesParking.Discapacitat)>=0 ) {
                matriculesDiscapacitats.set(comprovarbuit(TipusPlacesParking.Discapacitat), matricula);
            }

            //Si no es compleix cap condició d'excepció, entra al parking de discapacitats
            else {
                matriculesDiscapacitats.add(matricula);
            }
            this.places_discapacitats_lliures--;


            //Si l'ocupació excedeix el 85% s'avisarà però el cotxe discapacitat entrarà igualment
            if (getPlacesOcupades(TipusPlacesParking.Discapacitat) > places_discapacitats * 85 / 100) {

                throw new Exception("ALERTA =====> Ocupació de places per discapacitats supera el 85%.");
            }
            return matriculesDiscapacitats.indexOf(matricula);

        }


        //bloc de codi que intenta que un cotxe discapacitat entri al parking de no discapacitats si s'han exclòs les altres opcions
        else {

            //comprova buit d'una plaça lliure
            if (comprovarbuit(TipusPlacesParking.No_Discapacitat) >= 0) {
                this.places_no_discapacitats_lliures--;
                matriculesNoDiscapacitats.set(comprovarbuit(TipusPlacesParking.No_Discapacitat), matricula);

            }

            //Si simplement hi ha una plaça lliure, s'hi suma a la primera posició buida
            else{
                this.places_no_discapacitats_lliures--;
                matriculesNoDiscapacitats.add(matricula);

            }
            throw new Exception("ALERTA =====> Parking per discapacitats ple. Ha ocupat la plaça normal num: " +matriculesNoDiscapacitats.indexOf(matricula));

        }

    }



    /**
     * Si el cotxe està al parking, elimina la matricula i augmenta les places lliures
     * @param matricula la matricula a comprovar si està al parking i eliminar si hi és
     */

    public void surtCotxe(String matricula) throws Exception {

        if (matriculesNoDiscapacitats.contains(matricula)) {
            this.matriculesNoDiscapacitats.set(matriculesNoDiscapacitats.indexOf(matricula)," ");
            this.places_no_discapacitats_lliures++;
        }
        else throw new Exception("El cotxe no és al parking ");
    }


    /**
     * Si el cotxe està al parking de discapacitats, elimina la matricula i augmenta les places lliures
     * @param matricula la matricula a comprovar si està al parking i eliminar si hi és
     */
    public void surtCotxeDiscapacitats(String matricula) throws Exception {
        if (matriculesDiscapacitats.contains(matricula)) {
            this.matriculesDiscapacitats.set(matriculesDiscapacitats.indexOf(matricula)," ");
            this.places_discapacitats_lliures++;
        }
        else throw new Exception("El cotxe no és al parking.");
    }


    public int getPlacesOcupades(TipusPlacesParking tipus) {

        if (tipus.equals(TipusPlacesParking.No_Discapacitat)) {
            return places_no_discapacitats - places_no_discapacitats_lliures;

        }else {
            return places_discapacitats - places_discapacitats_lliures;
        }
    }


    public int getPlacesLliures(TipusPlacesParking tipus) {

        if (tipus.equals(TipusPlacesParking.No_Discapacitat)) {
            return places_no_discapacitats_lliures;

        } else {
            return places_discapacitats_lliures;
        }
    }


    /**
     * Guarda les matricules recollides a un Fitxer, sempre controlant excepcions
     * @param path ruta on guardar l'arxiu
     * @throws Exception si el path està en blanc
     */
    public void guardarMatricules(String path) throws Exception {

        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            ArrayList<String> totalMatricules = new ArrayList<>();


            //Suma totes les matrícules a un únic ArrayList
            totalMatricules.addAll(matriculesDiscapacitats);
            totalMatricules.addAll(matriculesNoDiscapacitats);
            totalMatricules.remove(" ");
            System.out.println(totalMatricules.toString());

            for (int i = 0; i<totalMatricules.size(); i++){


                bw.write(totalMatricules.get(i));
            }


            bw.close();

        }catch (Exception e){
            throw new Exception("ALERTA =====> Fitxer incorrecte o inexistent.");
        }
    }


    /**
     * Comprova si a un parking hi ha alguna plaça buida que hagi deixat un cotxe que ha surtit del parking
     * @param tipus per a comprovar el buit d'un tipus de parking o un altre
     * @return plaça buida al parking corresponent
     */
    private int comprovarbuit(TipusPlacesParking tipus) {

        int buit=-1;
        if (tipus.equals(TipusPlacesParking.Discapacitat)) {

            for (int i = 0; i < matriculesDiscapacitats.size(); i++) {

                if (matriculesDiscapacitats.get(i).isBlank()) {
                    buit=i;
                }
            }
        }
        else if(tipus.equals(TipusPlacesParking.No_Discapacitat)){

            for (int j = 0; j < matriculesNoDiscapacitats.size(); j++) {

                if (matriculesNoDiscapacitats.get(j).isBlank()) {
                    buit=j;
                }
            }
        }
        return buit;

    }


}


