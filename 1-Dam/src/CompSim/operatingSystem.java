package CompSim;

public class operatingSystem { //OS class with attributes, also array of software

    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequirement;
    private double osRamMemoryRequirement;
    private Software[] osSoftware = new Software[3];


    public operatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, double osRamMemoryRequirement) {
        this.osName = osName;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osOnlyCommand = osOnlyCommand;
        this.osSpaceRequirement = osSpaceRequirement;
        this.osRamMemoryRequirement = osRamMemoryRequirement;

    }

  public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsArchitecture() {
        return osArchitecture;
    }

    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public boolean isOsOnlyCommand() {
        return osOnlyCommand;
    }

    public void setOsOnlyCommand(boolean osOnlyCommand) {
        this.osOnlyCommand = osOnlyCommand;
    }

    public int getOsSpaceRequirement() {
        return osSpaceRequirement;
    }

    public void setOsSpaceRequirement(int osSpaceRequirement) {
        this.osSpaceRequirement = osSpaceRequirement;
    }

    public double getOsRamMemoryRequirement() {
        return osRamMemoryRequirement;
    }

    public void setOsRamMemoryRequirement(int osRamMemoryRequirement) {
        this.osRamMemoryRequirement = osRamMemoryRequirement;
    }

    public Software[] getOsSoftware() {
        return osSoftware;
    }

    //method to install Software


    public boolean installsoftware(Computer e, Software s) {  // installsoft method which installs if there's room enough and then updates available ram and hdd
        if ((s.getSoftwareSpaceRequirement() <= e.getAvailableDisk()) && (s.getSoftwareMemoryRequirement() <= e.getAvailableRAM())) {
            for (int i = 0; i < osSoftware.length; i++) {
                if (osSoftware[i] == null) {
                    osSoftware[i] = s;
                    e.setAvailableDisk(e.getAvailableDisk() - s.getSoftwareSpaceRequirement());
                    e.setAvailableRAM(e.getAvailableRAM() - s.getSoftwareMemoryRequirement());
                    System.out.print(s.getSoftwareName() + " was succesfully installed on " + e.getName() + ", ");
                    System.out.println(e.getAvailableDisk() + " GB of HDD and " + e.getAvailableRAM() + " GB of RAM free after installation ");
                    return true;
                }
            }
        }return false;
    }

    public void uninstallSoftware(Software b, Computer c) { //method to uninstall any software, updates ram and hdd

        c.setAvailableDisk((c.getAvailableDisk() + b.getSoftwareSpaceRequirement()));
        c.setAvailableRAM((c.getAvailableRAM()) + b.getSoftwareMemoryRequirement());
        System.out.print( "\n" + b.getSoftwareName() + "  was succesfully uninstalled, ");
        System.out.println(c.getAvailableDisk() + " GB of HDD" + " and " +  c.getAvailableRAM() + " GB of RAM free after uninstalling");


        for(int i=0; i<osSoftware.length; i++){
            if (osSoftware[i]==b){
                osSoftware[i]=null;
            }

        }

    }


    public void showinstalledsoft(){ //for loop to print installed software array

        System.out.print("Installed software right now is: " );
        for (Software software : osSoftware) {
            if (software != null) {
                System.out.print(software.getSoftwareName() + ", " );
            }

        }


    }




}



