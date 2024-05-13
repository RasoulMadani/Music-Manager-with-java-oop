import baseClasses.Album;
import baseClasses.Artist;
import baseClasses.PlayList;
import baseClasses.Song;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MusicManager musicManager = new MusicManager();

        Artist artist = new Artist("allah");
        Album album = new Album("allah1",artist,"dram");
        Album album2 = new Album("allah2",artist,"dram");

        artist.setAlbums(album);
        musicManager.addArtist(artist);

        Song song = new Song("allah");
        album.addAlbumSongs(song);

        Song song2 = new Song("allah2");
        album2.addAlbumSongs(song2);

        Song songSingle = new Song("single song");
        artist.setSingleSongs(songSingle);
        artist.getAlbumsSongs();
        System.out.println(Arrays.toString(artist.getSingleSongs()));
        PlayList playList = new PlayList();
        System.out.println(playList);
        playList.addSong(songSingle);
        System.out.println(playList);
        playList.addAlbum(album);
        System.out.println(playList);
        playList.addAlbum(album2);
        System.out.println(playList);
        playList.removeSong(songSingle);
        System.out.println(playList);
        System.out.println(playList.play().goNext().goPrevious().getCurrentSong());
    }
}
