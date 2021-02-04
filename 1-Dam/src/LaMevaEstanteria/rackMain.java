package LaMevaEstanteria;
//************************************************************************
//  Made by        PatrickSys
//  Date           04/02/2021
//  Package        LaMevaEstanteria
//
// Description 
//************************************************************************


public class rackMain {


    public static void main(String[] args) {


        Rack e = new Rack(10);
        Book l1 = new Book("Theo va al Parc", "Robbinson", 6);
        Book l2 = new Book("Tasmania", "J.K Namie", 7);

        e.addBook(l1);
        e.addBook(l2);



        Book l3 = new Book("E.T", "J.K Rowling", 3);
        Book l4 = new Book("Theo va a l'escola", "Robbinson", 9);
        Book l5 = new Book("Theo va al zoo", "Robbinson", 10);

        e.addBook(l3);
        e.addBook(l4);
        e.addBook(l5);

        //e.removeBook("tasmania");
        e.showTopTen();



    }

}
