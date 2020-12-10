package ClasseCotxe;


public class TestCotxe_Patrick {


    public static void main(String[] args) {
    Cotxe_Patrick Dacia= new Cotxe_Patrick("Dacia", "Sandero", TipusCanvi.CanviManual, EstatMotorCotxe.Arrancat);

        try {
            Dacia.aturarMotor();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
