package Cinema;
//************************************************************************
//  Made by        PatrickSys
//  Date           21/01/2021
//  Package        Cinema
//
// Class of the spectator, which we want to know it's age and money to
// know if it can enter the cinema. Those will be random
//************************************************************************



public class Spectator {

    //variables
    private final double money;
    private final int age;

    //Constructor will randomly generate age and money
    public Spectator(){
        this.money=Math.random()*50;
        this.age=(int)(Math.random()*100);
    }

    /**
     * Methods
     */

    //Spectator info we want to know
    public String getSpectatorInfo() {
        return  "Doblers: " + money +  ", edat : " + age;
    }

    public double getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }

}
