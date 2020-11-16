package POO;

public class test {

    public static void main(String[] args) {
    //cream instància alonso de classe objecte PiloDeFormula1
    PilotDeFormula1 alonso= new PilotDeFormula1("Fernando", "mucha", "ferrari", 43);
        //imprimim getters-return valors
        System.out.println(alonso.getNombre());
        System.out.println(alonso.getEdad());
        alonso.setEdad(49);
        System.out.println(alonso.getEdad());


    }
}
