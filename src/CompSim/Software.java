package CompSim;

public class Software {

    private String softwareName;
    private String softwareVersion;
    private double softwareSpaceRequirement;
    private double softwareMemoryRequirement;


    public Software(String softwareName, String softwareVersion, double softwareMemoryRequirement, double softwareSpaceRequirement){  //constructor of software
        this.softwareName=softwareName;
        this.softwareVersion=softwareVersion;
        this.softwareSpaceRequirement=softwareSpaceRequirement;
        this.softwareMemoryRequirement=softwareMemoryRequirement;
    }




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

    public double getSoftwareSpaceRequirement() {
        return softwareSpaceRequirement;
    }

    public void setSoftwareSpaceRequirement(double softwareSpaceRequirement) {
        this.softwareSpaceRequirement = softwareSpaceRequirement;
    }

    public double getSoftwareMemoryRequirement() {
        return softwareMemoryRequirement;
    }

    public void setSoftwareMemoryRequirement(int softwareMemoryRequirement) {
        this.softwareMemoryRequirement = softwareMemoryRequirement;
    }
}
