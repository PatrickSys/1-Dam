package Cinema;

public class Spectator {

    private double money;
    private int age;

    public double getMoney() {
        return money;
    }



    public int getAge() {
        return age;
    }






    public Spectator(){
        this.money=Math.random()*100;

        this.age=(int)(Math.random()*100);


    }
    @Override
    public String toString() {
        return  "money: " + money +  ", age : " + age;
    }


}
