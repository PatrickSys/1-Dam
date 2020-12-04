package CompSim;


public class operatingSystem { //OS class with attributes, also array of software

    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequirement;
    private double osRamMemoryRequirement;
    private operatingSystem[] osSoftware;   //we create an object array of osSoftware to enter there the software we install
    private String installedOS;

    static void installOS( operatingSystem e ) {   //method to install an OS

    }



    static operatingSystem Windows = new operatingSystem("Windows", "Seven", "x64", false, 15, 2);  //OS instance about Windows
    static operatingSystem Ubuntu= new operatingSystem("Ubuntu", "Server 20.04", "x86",true, 10, 1  );
    public operatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, double osRamMemoryRequirement) {
        this.osName = osName;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osOnlyCommand = osOnlyCommand;
        this.osSpaceRequirement = osSpaceRequirement;
        this.osRamMemoryRequirement = osRamMemoryRequirement;
        this.osSoftware = null;
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
        this.osRamMemoryRequirement = osRamMemoryRequirement; }

    public operatingSystem[] getOsSoftware() {
        return osSoftware;
    }

    public void setOsSoftware(operatingSystem[] osSoftware) {
        this.osSoftware = osSoftware;
    }


}
