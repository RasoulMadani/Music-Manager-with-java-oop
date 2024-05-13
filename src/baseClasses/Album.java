package baseClasses;

import java.util.Arrays;

public class Album {
    private Song[] albumSongs;
    private int indexAlbumSongs = 0;
    private String name;
    private Artist artist;
    private String genre;

    public Album(String name, Artist artist, String genre) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        albumSongs = new Song[10];
    }
    public void addAlbumSongs(Song song){
        albumSongs[indexAlbumSongs++] = song;
    }
    public void removeAlbumSongs(Song song){
        for (int i = 0; i < albumSongs.length; i++) {

        }
    }
    public Song[] getAlbumSongs(){
        return albumSongs;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;

    }

    @Override
    public String toString() {
        return "Album{" +
                "albumSongs=" + Arrays.toString(albumSongs) +
                ", indexAlbumSongs=" + indexAlbumSongs +
                ", name='" + name + '\'' +
                ", artist=" + artist +
                ", genre='" + genre + '\'' +
                '}';
    }
}
