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
        System.out.println(dacia.getMarxaManual());
        dacia.CanviaMarxaManual('-');
        System.out.println(dacia.getMarxaManual());
        dacia.CanviaMarxaManual('-');
        System.out.println(dacia.getMarxaManual());
        dacia.CanviaMarxaManual('-');
        System.out.println(dacia.getMarxaManual());
        dacia.CanviaMarxaManual('-');
        System.out.println(dacia.getMarxaManual());
        dacia.CanviaMarxaManual('-');
        System.out.println(dacia.getMarxaManual());
        dacia.CanviaMarxaManual('-');
        System.out.println(dacia.getMarxaManual());
        dacia.CanviaMarxaManual('-');
        System.out.println(dacia.getMarxaManual());
        dacia.CanviaMarxaManual('-');
        System.out.println(dacia.getMarxaManual());


        } catch (Exception e) {
         System.out.println(e.getMessage());
         System.out.println("wat");

        }


    }
}
