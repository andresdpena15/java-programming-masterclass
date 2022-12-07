package playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        ArrayList<Song> songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        Song song = findSong(title);
        if (song.equals(null)) {
            songs.add(song);
            return true;
        }

        return false;
    }

    private Song findSong(String title) {
        for (Song song: songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        ListIterator<Song> listIterator = songs.listIterator();
        return false;

    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        return false;
    }
}
