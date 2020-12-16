package ClasseCotxe;


public class TestCotxe_Patrick {


    public static void main(String[] args) {
    Cotxe_Patrick Dacia= new Cotxe_Patrick("Dacia", "Sandero", TipusCanvi.CanviManual, EstatMotorCotxe.Arrancat);


        try {
            Dacia.aturarMotor();
            Dacia.aturarMotor();
            System.out.println(Dacia.comprovarmotor());
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }


    }

}
