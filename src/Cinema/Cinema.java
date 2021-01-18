package Cinema;

public class Cinema {

    private final double TicketPrice;
    private Movie RunningMovie;

    public Cinema(int TicketPrice){
        this.TicketPrice=TicketPrice;

    }



    private void setRunningMovie(Movie movie){
        this.RunningMovie=movie;
    }

    private String getRunningMovie(Cinema cinema){
        return this.RunningMovie.get
    }

}


