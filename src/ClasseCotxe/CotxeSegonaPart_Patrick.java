package ClasseCotxe;


enum marxesManual{R, N, Primera, Segona, Tercera, Quarta, Quinta, Sisena}

enum marxesAutomatic{ F,N,R}


public class CotxeSegonaPart_Patrick extends Cotxe_Patrick implements InterfaceCotxe {


    protected marxesManual marxaManual=marxesManual.N; //Cream i inicialitzam la variable de la marxaManual
    protected marxesAutomatic marxaAutomatica=marxesAutomatic.N;
    protected int marxaManualActual=1; //Amb aquesta variable podrem anar canviant de marxa i equiparar-la a l'enum
    protected int marxaAutomaticaActual=1;

    public CotxeSegonaPart_Patrick(String marca, String model, TipusCanvi tipuscanvi, EstatMotorCotxe estatcotxe) {
        super(marca, model, tipuscanvi, estatcotxe);

    }

    //per pujar i baixar marxes als cotxes manuals
    public void CanviaMarxaManual(char a) throws Exception { //mètode per Canviar marxa manual


        if (a == '+' ) {  //si inserim '+' per pujar una marxa
            if(this.marxaManual==marxesManual.Sisena){
                throw new Exception("Ja estàs a la marxa més alta"); //excepció si volem pujar quan ja esteim a sisena
            }
            marxesManual[] marxaManual = {marxesManual.R, marxesManual.N, marxesManual.Primera, marxesManual.Segona, marxesManual.Tercera, marxesManual.Quarta, marxesManual.Quinta, marxesManual.Sisena};
        marxaManualActual++;
            this.marxaManual=marxaManual[this.marxaManualActual];

        }
        if(a=='-'){ //per a baixar marxa
            if(this.marxaManual==marxesManual.R){
                throw new Exception("Ja estàs a la marxa més baixa (R)"); //excepció si volem baixar quan ja esteim a R
            }
            marxesManual[] marxaManual = {marxesManual.R, marxesManual.N, marxesManual.Primera, marxesManual.Segona, marxesManual.Tercera, marxesManual.Quarta, marxesManual.Quinta, marxesManual.Sisena};
            marxaManualActual--;
            this.marxaManual=marxaManual[this.marxaManualActual];

        }

    }

    public marxesManual getMarxaManual(){
        return this.marxaManual;
    }

    //Getter de la marrxa automatica a la que estem
    public marxesAutomatic getMarxaAutomatic(){
        return this.marxaAutomatica;
    }


}

