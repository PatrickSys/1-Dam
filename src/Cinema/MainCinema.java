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



            spectatorList.add(new Spectator());

            i++;

            String[] seats= new String[]{"O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O","O", "O", "O", "O", };
            for(int j=0; j< seats.length; j++){

                System.out.print(seats[(j)]);
                if(j%8==0&&j!=0){
                    System.out.println("\t");
                }

            }
            System.out.println("\n");

        }while((!cine1.getIsfull()) && i<10);


    }


}
