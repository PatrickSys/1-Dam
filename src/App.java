
public class App {

    private String name;

    private String version;

    private double spaceRequirement;

    private double memoryRequirement;

    public App(String name, String version, double spaceRequirement, double memoryRequirement) {
        this.name = name;
        this.version = version;
        this.spaceRequirement = spaceRequirement;
        this.memoryRequirement = memoryRequirement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getSpaceRequirement() {
        return spaceRequirement;
    }

    public void setSpaceRequirement(double spaceRequirement) {
        this.spaceRequirement = spaceRequirement;
    }

    public double getMemoryRequirement() {
        return memoryRequirement;
    }

    public void setMemoryRequirement(double memoryRequirement) {
        this.memoryRequirement = memoryRequirement;
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", spaceRequirement=" + spaceRequirement +
                ", memoryRequirement=" + memoryRequirement +
                '}';
    }
}



