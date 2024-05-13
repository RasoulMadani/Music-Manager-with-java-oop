package baseClasses;

import java.util.Arrays;

public class Artist {
    private  String name;
    Song[] singleSongs;
    int indexSingleSongs=0;
    Album[] albums;
    int indexAlbums=0;

    public Artist(String name) {
        this.name = name;
        this.singleSongs = new Song[10];
        albums= new Album[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSingleSongs(Song singleSong) {
        this.singleSongs[indexSingleSongs++] = singleSong;
    }
    public Song[] getSingleSongs(){
        return singleSongs;
    }

    public Album[] getAlbums() {
        return albums;
    }
    public void getAlbumsSongs() {
        for (int i = 0; i < albums.length; i++) {
            if (albums[i] != null){
                System.out.println(albums[i].getName() + Arrays.toString(albums[i].getAlbumSongs()));
            }
        }
    }
    public Album getAlbum(String name){
        for (int i = 0; i < albums.length; i++) {
            if (albums[i]!=null && albums[i].getName().equals(name)){
                return albums[i];
            }
        }
        return null;
    }

    public void setAlbums(Album album) {
        this.albums[indexAlbums] = album;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +

                ", indexSingleSongs=" + indexSingleSongs +

                ", indexAlbums=" + indexAlbums +
                '}';
    }
}
