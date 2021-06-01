package Cinema;

//************************************************************************
//  Made by        PatrickSys
//  Date           21/01/2021
//  Package        Cinema
//
// Movie class, nothing much to say
//************************************************************************

public class Movie {

    //Movie attributes we want to know
    private final String name;
    private final int duration;
    private final int minAge;
    private final String directorName;


    //Constructor
    public Movie(String name, int duration, int minAge, String directorName) {
        this.name = name;
        this.duration = duration;
        this.minAge = minAge;
        this.directorName = directorName;
    }

    /**
     * Methods
     */

    //Info we want to know about the Movie
    public String getMovieInfo() {

        return "El títol de la pel·lícula és: " + this.getName() + ", la seva duració és de: " + this.duration +
                " min,\n l'edat mínima és de: " + this.minAge + "anys, i el nom del director és: " + this.directorName;
    }

    public String getName() {
        return name;
    }

    public int getMinAge() {
        return minAge;
    }

}
