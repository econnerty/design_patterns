package adapter;

/**
 * @author Erik Connerty
 * Track class
 */
public class Track extends Song{

    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    /**
     * Constructor for track
     * @param title
     * @param album
     * @param firstName
     * @param lastName
     * @param genre
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAlbum(){
        return this.album;
    }
    public String getArtistFirstName(){
        return this.firstName;
    }
    public String getArtistLastName(){
        return this.lastName;
    }

    /**
     * Converts Enum to readable genre
     */
    public String getGenre(){
        switch (this.genre) {
            case ROCK:
                return "Rock";
            case POP:
                return "Pop";
            case HIPHOP:
                return "Hip Hop";
            case JAZZ:
                return "Jazz";
            case COUNTRY:
                return "Country";
            default:
                return "Other";
        }
    }
}
