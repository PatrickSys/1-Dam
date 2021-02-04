package LaMevaEstanteria;
//************************************************************************
//  Made by        PatrickSys
//  Date           04/02/2021
//  Package        LaMevaEstanteria
//
// Description 
//************************************************************************


import java.util.ArrayList;
import java.util.Collections;

public class Rack {


    //New books ArrayList
    ArrayList<Book> books = new ArrayList<>();
    private final int rackCapacity;



    //constructor uses setRackCapacity method and also sets variable rack Capacity of the object
    public Rack(int rackCapacity){

        this.rackCapacity=rackCapacity;
        setRackCapacity();
    }





    //adds a book if it's not already on the rack and it's not full
    public void addBook(Book book){

        //flag algorithm boolean
        boolean added=false;

        //checks
        if(!(books.contains(book))){


                //checks the spot available then adds the book
                int count=0;
                while(!added && count < books.size()) {

                    if(books.get(count)==null){
                        books.set(count,book);
                        System.out.println("Afegit el llibre: " + book.getTitle());
                        added=true;
                    }

                    count++;
                }
        }

        else{
            System.out.println("No hi ha espai a l'estanteria o el llibre ja hi és");
        }


    }



    //Identifier is either title or author
    public void removeBook(String identifier){

        boolean removed=false;

        //loop through the array
        int counter=0;

        while(!removed && counter < books.size()) {

                //checks if position is not null and if it equals to any title or author name of the books ArrayList
                if (books.get(counter) != null && (books.get(counter).getTitle().equalsIgnoreCase(identifier) || books.get(counter).getAuthor().equalsIgnoreCase(identifier))) {
                    System.out.println("Tret el llibre: " + books.get(counter).getTitle());
                    books.set(counter,null);
                    removed = true;
                }

                counter++;
            }

        //If the book wasn't removed it means it's not on the rack
        if(!removed){
            System.out.println("El llibre no és a l'estanteria");
        }

        }


        public void showTopTen(){

            System.out.println("Top 10 de llibres segons qualificació: ");


            //sort




        //loops through the array and show titles with it's marks

            //de 10 a 0
        for(int i=books.size()-1; i>-1; i--){


                if(books.get(i)!=null) {


                }
        }

        for(int i = 0; i<books.size()-1; i++){

            if(books.get(i)!=null) {


                System.out.println(i+1 + ". : " + books.get(i).getTitle() + " nota: " + books.get(i).getRating());
            }
        }



        }

    //Sets 10 array positions to null
    private void setRackCapacity(){

        for (int i=0; i<rackCapacity; i++){

            books.add(null);
        }
    }

    public int getRackCapacity() {
        return rackCapacity;
    }

    }



