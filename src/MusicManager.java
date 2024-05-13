
import baseClasses.Artist;

import java.util.Arrays;

public class MusicManager {
    private Artist[] artists = new Artist[10];
    private int indexArtist = 0;

    public void addArtist(Artist artist) {
        artists[indexArtist++] = artist;
    }

    @Override
    public String toString() {
        return "MusicManager{" +
                "artists=" + Arrays.toString(artists) +
                ", indexArtist=" + indexArtist +
                '}';
    }
}
