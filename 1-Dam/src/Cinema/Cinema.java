package Cinema;

//************************************************************************
//  Made by        PatrickSys
//  Date           21/01/2021
//  Package        Cinema
//
// This is the Cinema class, it allocates it's variables, such as
// the current movie, or the boolean variable isFull to manage when it's full
//************************************************************************

import java.util.ArrayList;

public class Cinema {


    //Cinema variables
    private final double ticketPrice;
    private Movie currentMovie;
    private boolean isFull =false;
    private int cinemaCapacity;
    private int seatColumns;
    private double earnedMoney;

    //Constructor
    public Cinema(double TicketPrice){
        this.ticketPrice =TicketPrice;

    }

    /**
     * Methods
     */


    //Get Cinema required info
    public String getCinemaInfo(){
        return "La pel·lícula actual és : " + currentMovie.getName()+ ", el preu del ticket és de " + ticketPrice + " €";
    }


    /**
     * Sets the number of seats of the cinema to it's array.
     * Gives a value of 0 to each seat, so that seat is not occupied
     * @param rows rows of cinema
     * @param columns columns of cinema
     * @param seats the seats arraylist to settle
     */
    public void setCinemaCapacity(int rows, int columns, ArrayList<Integer> seats){

        //Sets Cinema rows and columns, later used by printSeats method
        this.seatColumns=columns;
        this.cinemaCapacity=rows*columns;

        //sets the ArrayList
        for(int i=0; i<cinemaCapacity; i++){
            seats.add(0);
        }
    }



    /**
     * This method prints the seats
     * @param seats the ArrayList of seats to print
     */
    public void printSeats(ArrayList<Integer> seats){

        //for loop will print each position of the array
        System.out.println("\n");
        for(int j=1; j<=cinemaCapacity; j++){

            System.out.print(seats.get(j-1)+ " ");

            if(j%seatColumns==0){
                System.out.println("\t");
            }
        }
    }

    /**
     * This method will fulfill the cinema with spectators with enough money and age
     * @param spectator the spectator to sit
     * @param cinema the cinema where the spectator has to be sitted
     * @param movie to get it's minimum age
     * @param seats the array to fill
     */
    public void sitSpectator(Spectator spectator,Cinema cinema, Movie movie, ArrayList<Integer> seats){
        //Boolean used as a flag
        boolean sit =false;

        //if none seat is free make isFull true and end the program
        if(!seats.contains(0)){
            this.isFull=true;
        }

         //if spectator meets requirements
         else if (spectator.getMoney() >= cinema.getTicketPrice() && spectator.getAge() >= movie.getMinAge()) {

             while(!sit){

                    //looks for an empty spot randomly then sits on it
                    for (int i = (int)(Math.random()*cinemaCapacity); i < cinemaCapacity && !sit; i++) {

                        if (seats.get(i) == 0) {
                            seats.set(i, 1);
                            sit = true;
                            earnedMoney+=8.5;
                        }
                    }
                }
        }
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setCurrentMovie(Movie movie){
        this.currentMovie =movie;
    }

    public double getEarnedMoney() {
        return earnedMoney;
    }

}


