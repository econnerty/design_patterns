package adapter;

import java.util.HashMap;

/**
 * @author Erik Connerty
 * Juke Box Class
 */
public class JukeBox {
    private HashMap<String, Song> songs;
    private int currentSong;

    /**
     * Creates a jukebox
     */
    public JukeBox() {
        songs = new HashMap<>();
    }

    /**
     * Adds a song
     * @param song
     */
    public void addSong(Song song) {
        songs.put(song.getTitle().toLowerCase(), song);
    }

    public void play(String songName) {
        Song song = songs.get(songName.toLowerCase());

        if(song != null)
            System.out.println(song.toString());
        else
            System.out.println("Sorry! That song isn't in the juke box!");
    }
}
