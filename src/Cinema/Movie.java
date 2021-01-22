package Cinema;

public class Movie {

    private String name;
    private int duration;
    private int minAge;
    private String directorName;


    public Movie(String name, int duration, int minAge, String directorName) {
        this.name = name;
        this.duration = duration;
        this.minAge = minAge;
        this.directorName = directorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getMovieInfo(){

        return "Movie title is: " + this.getName() + ", duration is: " +this.duration+ " min, minimum age is: " +this.minAge+ "yo, director name is: "  +this.directorName;
    }
}
