package adapter;

/**
 * @author Erik Connerty
 * Base Class for Song
 */
public abstract class Song {

    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();
    
    /**
     * Returns formatted string of the song
     */
    public String toString() {
        return this.getTitle() + "\n" + "Album: " + this.getAlbum() + "\n" + "By: " + this.getArtistFirstName() + " " + this.getArtistLastName() + "\n" + "Genre: " + this.getGenre() + "\n";
    }
}
