package LaMevaEstanteria;
//************************************************************************
//  Made by        PatrickSys
//  Date           04/02/2021
//  Package        LaMevaEstanteria
//
// Description 
//************************************************************************


import java.util.ArrayList;

public class Rack {


    //New books ArrayList, rackCapacity Attribute
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

        //counter to manage "top" books
        int counter=1;

            System.out.println("\n--- Top 10 de llibres segons qualificació: ---\n");


        //loops from 10 points and for each point gets the books that belong that mark. Then prints it
        for(int i=books.size(); i>-1; i--){

            for (Book book : books) {
                if (book != null) {

                    if (book.getRating() == i) {
                        System.out.println(counter + ". " + book.getTitle() + ", nota: " + book.getRating());
                        counter++;
                    }

                }
            }
        }

            System.out.println("\t");

        }

        //prints all the rack books
        public void showRack(){

            System.out.println("\n--- Llibres a l'estanteria ---\n");
              for(int i=0; i<rackCapacity; i++){

            if(books.get(i)!=null) {
                System.out.println(books.get(i).getTitle());
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



