package baseClasses;

import java.util.Arrays;

public class PlayList {
    private String name;
    private static int counter = 1;
    private Song[] songs = new Song[100];
    private int indexSongs = 0;

    public PlayList(String name) {
        this.name = name;
    }

    public PlayList() {
        this.name = "playlist" + counter;
        counter++;
    }

    public void addSong(Song song) {
        songs[indexSongs++] = song;
    }

    public void addAlbum(Album album) {
        Song[] songs = album.getAlbumSongs();
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] != null) {
                this.songs[indexSongs++] = songs[i];
            }
        }
    }

    public void removeSong(Song song) {
        for (int i = 0; i < indexSongs; i++) {
            if (this.songs[i] != null &&
                    this.songs[i].getName().equals(song.getName())
            ) {
                this.songs[i] = null;
            }
        }
    }

    private Song active_song = null;
    private int index_active_song = 0;

    public Song getCurrentSong() {
        return active_song;
    }

    public PlayList goNext() {
        if(index_active_song < indexSongs){
            active_song = songs[++index_active_song];
        }else {
            stop();
        }
        return this;

    }

    public PlayList goPrevious() {
        if(index_active_song >0 ){
            active_song = songs[--index_active_song];
        }else {
            stop();
        }
        return this;
    }

    public PlayList play() {
        active_song = songs[index_active_song];
        return this;
    }

    public PlayList stop() {
        active_song = null;
        return this;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "name='" + name + '\'' +
                ", songs=" + Arrays.toString(songs) +
                ", indexSongs=" + indexSongs +
                ", active_song=" + active_song +
                ", index_active_song=" + index_active_song +
                '}';
    }
}
