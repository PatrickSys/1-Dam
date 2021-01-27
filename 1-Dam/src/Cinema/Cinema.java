package Cinema;

public class Cinema {

    private final double TicketPrice;
    private Movie CurrentMovie;
    private boolean isfull=false;


    public Cinema(double TicketPrice){
        this.TicketPrice=TicketPrice;

    }

    public double getTicketPrice() {
        return TicketPrice;
    }

    public boolean getIsfull() {
        return isfull;
    }

    public void setIsfull(boolean isfull) {
        this.isfull = isfull;
    }

    protected void setCurrentMovie(Movie movie){
        this.CurrentMovie=movie;
    }

    protected String getCurrentMovie() {
        return CurrentMovie.getName();
    }

    protected String getCinema(){
        return "Current movie is: " +CurrentMovie.getName()+ ", ticket price is: " +TicketPrice + "$";
    }

}


