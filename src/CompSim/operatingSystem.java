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

    int i=0;
    public void installsoftware(Computer e, Software s, operatingSystem o) {

                if ((s.getSoftwareSpaceRequirement() <= e.getAvailableDisk()) && (s.getSoftwareMemoryRequirement() <= e.getAvailableRAM()) && (osSoftware[i] == null) && (i<osSoftware.length)) {
                    osSoftware[i]=s;
                    e.setAvailableDisk(e.getAvailableDisk() - s.getSoftwareSpaceRequirement());
                    e.setAvailableRAM(e.getAvailableRAM() - s.getSoftwareMemoryRequirement());
                    System.out.print(s.getSoftwareName() + " was succesfully installed on " + e.getName() + ", ");
                    System.out.println(e.getAvailableDisk() + " GB of HDD and " +e.getAvailableRAM() + " GB of RAM free after installation ");

                }else{
                    System.out.println(s.getSoftwareName()+ " could not be installed");
                }
                i++;
    }


    public void showinstalledsoft(operatingSystem o, Computer c){

        System.out.print("Installed software right now is: " );
        for (int i = 0; i<osSoftware.length; i++){
            if(osSoftware[i] !=null){
                System.out.print(osSoftware[i].getSoftwareName() + ", ");
            }

        }


    }

    public void uninstallSoftware(Software b, Computer c) {

        c.setAvailableDisk((c.getAvailableDisk() + b.getSoftwareSpaceRequirement()));
        c.setAvailableRAM((c.getAvailableRAM()) + b.getSoftwareMemoryRequirement());
        System.out.print( "\n" + b.getSoftwareName() + "  was succesfully uninstalled, ");
        System.out.println(c.getAvailableDisk() + " GB of HDD" + " and " +  c.getAvailableRAM() + " GB of RAM free after uninstalling");
    }


}



