package Cinema;

import java.util.ArrayList;

public class MainCinema {


    public static void main(String[] args) {
        Movie Frankstein = new Movie("Frankstein", 189, 12, "Jéremy Lacroix");
        Cinema cine1= new Cinema(8.5);

        int i=0;
        ArrayList<Spectator> spectatorList = new ArrayList<>();
        cine1.setCurrentMovie(Frankstein);

        System.out.println(cine1.getCinema());
        System.out.println(Frankstein.getMovieInfo());



        do{

            spectatorList.add(new Spectator()); //every loop creates a new object Spectator with random data

            i++;
            String[] seats= new String[]{"O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O", };
            for(int j=1; j<= seats.length; j++){ //for loop to start printin the seats

                System.out.print(seats[j-1]); //prints seats

                if(j%8==0){

                    System.out.println("\t");

                }
            }
            System.out.println("\n");


            //if (SpectatorList.get(i); //.getMoney()>=cine1.getTicketPrice());

        }while((!cine1.getIsfull()) && i<10);


    }


}
