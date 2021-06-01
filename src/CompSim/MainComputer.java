package CompSim;



public class MainComputer {


    public static void main(String[] args) {


        // Instances about  computer1, Windows, and Chrome
        Computer computer1 = new Computer("Computer 1", 8, 512);   //computer1 without an OS installed
        operatingSystem windows = new operatingSystem("Windows", "Seven", "x64", false, 20, 2);
        Software chrome = new Software("Chrome", "8.4", 1, 0.5); //Instance about Chrome
        Software minecraft = new Software("Minecraft", "Premium", 2, 1); //Instance of Minecraft


        //InstallOS and only does following as installing software if OS gets set up
        if (computer1.installos(windows)) {

            //Install Chrome if there's room enough
            if(windows.installsoftware(computer1, chrome)) {
            }else{
                System.out.println(chrome.getSoftwareName()+ "couldn't be installed on " +computer1.getName());
            }


            //Install Minecraft if there's room enough
            if(windows.installsoftware(computer1, minecraft)){

            }
            else{
                    System.out.println(minecraft.getSoftwareName()+ "couldn't be installed on " +computer1.getName());
                }


            //Show a list of installed software right now
            windows.showinstalledsoft();

            //Uninstall Chrome
            windows.uninstallSoftware(chrome, computer1);

            //Show a list of installed software after uninstalling Chrome
            windows.showinstalledsoft();

            //format Computer1
            computer1.format();

        }
        else{ //print error if there's no space to install any SO then doesn't install any software
            System.out.println("Error installing " + windows.getOsName() + ", no storage available!!");
           }



        }


    }




