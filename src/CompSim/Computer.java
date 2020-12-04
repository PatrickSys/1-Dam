package CompSim;

/*
Parent class


 */



public class Computer {

    public static void main(String[] args) {

        Computer.computer1.setOperatingSystem(operatingSystem.Windows); //We install Windows on computer1
        System.out.println("Installed OS on computer1 is " + Computer.computer1.OperatingSystem.getOsName() + " " +Computer.computer1.OperatingSystem.getOsVersion()); //Check Installed OS
        computer1.setHardDisk((computer1.hardDisk) -  operatingSystem.Windows.getOsSpaceRequirement());    //Update computer1 disk free space
        System.out.println(computer1.hardDisk+ " GB of HDD free after installation");
        computer1.setRamMemory((computer1.ramMemory)- operatingSystem.Windows.getOsRamMemoryRequirement());  // and RAM
        System.out.println((int)computer1.ramMemory+ " GB of RAM free after installation");



    }

    private String name;                                                //computer class attributes
    private double ramMemory;
    private int hardDisk;
    public operatingSystem OperatingSystem;

    public Computer(String name, int ramMemory, int hardDisk) {     //constructor
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
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

    public void setOperatingSystem(operatingSystem OperatingSystem  ){
        this.OperatingSystem= OperatingSystem;
    }
    public operatingSystem getOperatingSystem(){
        return OperatingSystem;
    }


    static Computer computer1= new Computer("computer 1", 4, 512);   //computer1 without an OS installed



}
