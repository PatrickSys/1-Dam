package CompSim;

public class Software {

    private String softwareName;
    private String softwareVersion;
    private int softwareSpaceRequirement;
    private int softwareMemoryRequirement;

    public Software(String softwareName, String softwareVersion, int softwareMemoryRequirement, int softwareSpaceRequirement){  //constructor of software
        this.softwareName=softwareName;
        this.softwareVersion=softwareVersion;
        this.softwareSpaceRequirement=softwareSpaceRequirement;
        this.softwareMemoryRequirement=softwareMemoryRequirement;
    }

    //getters and setters


    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public int getSoftwareSpaceRequirement() {
        return softwareSpaceRequirement;
    }

    public void setSoftwareSpaceRequirement(int softwareSpaceRequirement) {
        this.softwareSpaceRequirement = softwareSpaceRequirement;
    }

    public int getSoftwareMemoryRequirement() {
        return softwareMemoryRequirement;
    }

    public void setSoftwareMemoryRequirement(int softwareMemoryRequirement) {
        this.softwareMemoryRequirement = softwareMemoryRequirement;
    }
}
