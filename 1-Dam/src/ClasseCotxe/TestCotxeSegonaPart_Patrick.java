package ClasseCotxe;

public class TestCotxeSegonaPart_Patrick {
    public static void main(String[] args) {

        CotxeSegonaPart_Patrick dacia= new CotxeSegonaPart_Patrick("dacia", "sandero", TipusCanvi.CanviManual, EstatMotorCotxe.Arrancat );


        try {

        dacia.CanviaMarxaManual('+');

        dacia.CanviaMarxaManual('+');
        dacia.CanviaMarxaManual('+');
        dacia.CanviaMarxaManual('+');
        dacia.CanviaMarxaManual('+');
        System.out.println(dacia.getMarxaManual());
        dacia.CanviaMarxaManual('-');
        dacia.CanviaMarxaManual('-');
        dacia.CanviaMarxaManual('-');
        dacia.CanviaMarxaManual('-');
        dacia.CanviaMarxaManual('-');
        System.out.println(dacia.getMarxaManual());
        dacia.CanviaMarxaManual('-');
        System.out.println(dacia.getMarxaManual());


        CotxeSegonaPart_Patrick renault= new CotxeSegonaPart_Patrick("Renault", "Laguna", TipusCanvi.CanviAutomatic, EstatMotorCotxe.Aturat);

        renault.comprovarmotor();
        renault.arrancarMotor();
        System.out.println(renault.getMarxaAutomatic());
        renault.CanviarMarxaAutomatic('+');
        System.out.println(renault.getMarxaAutomatic());
        renault.CanviarMarxaAutomatic('+');
        System.out.println(renault.getMarxaAutomatic());


        } catch (Exception e) {
         System.out.println(e.getMessage());

        }





    }
}
