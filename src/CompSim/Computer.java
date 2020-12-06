package CompSim;


public class Computer {



    private String name;                                                //computer class attributes
    private double ramMemory;
    private double availableRAM;
    private int hardDisk;
    private operatingSystem operatingsystem;
    private double availableDisk;


    public Computer(String name, int ramMemory, int hardDisk) {     //constructor
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
        setAvailableDisk(hardDisk);
        setAvailableRAM(ramMemory);
    }

    public String getName() {                       //setters and getters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(double ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public double getAvailableDisk() {
        return availableDisk;
    }

    public void setAvailableDisk(double availableDisk) {
        this.availableDisk = availableDisk;
    }
    public operatingSystem getOperatingSystem(){
        return operatingsystem;
    }

    public double getAvailableRAM() {
        return availableRAM;
    }

    public void setAvailableRAM(double availableRAM) {
        this.availableRAM = availableRAM;
    }

    public boolean installOS(operatingSystem OperatingSystem  ){    //Method to Install OS
        if ((OperatingSystem.getOsSpaceRequirement() < availableDisk) && (OperatingSystem.getOsRamMemoryRequirement() <availableRAM)) { //Checks if there's storage free
            this.operatingsystem = OperatingSystem;     //Sets OS name
            setAvailableDisk((getAvailableDisk()) - OperatingSystem.getOsSpaceRequirement());    //Update computer1 disk free space
            setAvailableRAM((getRamMemory()) - OperatingSystem.getOsRamMemoryRequirement());  // and RAM


        return true;
        }

        return false;
    }

    public static void format(Computer a) {
        a.setAvailableDisk(a.getHardDisk());
        a.setAvailableRAM(a.getRamMemory());

    }

}



