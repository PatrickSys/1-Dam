import java.nio.file.Path;
import java.nio.file.Paths;

/************************************************************************
 Made by        PatrickSys
 Date           05/02/2021
 Package        PACKAGE_NAME
 Description:
 ************************************************************************/


public class Testing {


    public static void main(String[] args) {
        String thisReport = "src/out/reports/eyo.xml";
        Path pathAbsolute = Paths.get(thisReport);
        Path pathRelative = pathAbsolute.toAbsolutePath();
        System.out.println(pathRelative);
    }


}
