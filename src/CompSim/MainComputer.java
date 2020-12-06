package CompSim;



public class MainComputer {


    public static void main(String[] args) {


        // Instances about Windows, computer1 and Chrome
        operatingSystem Windows = new operatingSystem("Windows", "Seven", "x64", false, 20, 2);
        Computer computer1= new Computer("Computer 1", 8, 512);   //computer1 without an OS installed
        Software Chrome= new Software ("Chrome", "8.4", 1, 0.5); //Instance about Chrome
        Software Minecraft = new Software("Minecraft", "Premium", 2, 10); //Instance of Minecraft


           if (computer1.installOS(Windows)) {
               
               //We install Windows on computer1, after checking if there's space available
               System.out.print(computer1.getOperatingSystem().getOsName() + " was succesfully installed, ");
               System.out.println((computer1.getAvailableDisk() + " GB of HDD") + " and " +  computer1.getAvailableRAM() + " GB of RAM free after installation");

               //Install Chrome if there's room enough
               if((Chrome.getSoftwareSpaceRequirement() < computer1.getAvailableDisk() )  && (Chrome.getSoftwareMemoryRequirement() < computer1.getAvailableRAM())){
                   Windows.installsoftware(Chrome, computer1);
                   System.out.print(Chrome.getSoftwareName() + " was succesfully installed, ");
                   System.out.println(computer1.getAvailableDisk() + " GB of HDD" + " and " +  computer1.getAvailableRAM() + " GB of RAM free after installation");
               }
               else{
                   System.out.println("Error installing " + Chrome.getSoftwareName() + ", no storage available!!"); //print error if installation not possible because we're trying to exceed computer's capabilities
               }

               //Install Minecraft if there's room enough
               if((Minecraft.getSoftwareSpaceRequirement()  <computer1.getAvailableDisk())&& (Minecraft.getSoftwareMemoryRequirement() < computer1.getAvailableRAM()) ){
                   Windows.installsoftware(Minecraft, computer1);
                   System.out.print(Minecraft.getSoftwareName()+ " was succesfully installed, ");
                   System.out.println(computer1.getAvailableDisk()+ " GB of HDD and " + computer1.getAvailableRAM()+ " GB of RAM free after installation ");
                   Windows.showInstalledSoft(Windows, computer1);

                   //Uninstall Chrome
                   Windows.uninstallSoftware(Chrome, computer1);
                   System.out.print( "\n" + Chrome.getSoftwareName() + "  was succesfully Uninstalled, ");
                   System.out.println(computer1.getAvailableDisk() + " GB of HDD" + " and " +  computer1.getAvailableRAM() + " GB of RAM free after Uninstalling");

                   //format Computer1
                   Computer.format(computer1);
                   System.out.print(computer1.getName() + " was succesfully formated, available storage and RAM updated to: ");
                   System.out.println(computer1.getAvailableDisk() + " GB of HDD and " + computer1.getAvailableRAM() + " GB of RAM ");

               }
               else{
                   System.out.println("Error installing " + Minecraft.getSoftwareName() + ", no storage available!! ");
               }

           }
           else{
               System.out.println("Error installing " + Windows.getOsName() + ", no storage available!!");
           }





       }


    }



