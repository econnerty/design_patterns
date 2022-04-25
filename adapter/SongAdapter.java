package adapter;

/**
 * @author Erik Connerty
 * Implements Adapter design pattern for Song
 */
public class SongAdapter extends Song {
    private Tune tune;

    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    @Override
    public String getAlbum() {
        return tune.getDisplayTitle().split(" : ")[1];
    }

    @Override
    public String getArtistFirstName() {
        return tune.getArtistName().split(" ")[0];
    }

    @Override
    public String getArtistLastName() {
        return tune.getArtistName().split(" ")[1];
    }

    @Override
    public String getGenre() {
        return tune.getCategory();
    }

    @Override
    public String getTitle() {
        return tune.getDisplayTitle().split(" : ")[0];
    }

    
}
