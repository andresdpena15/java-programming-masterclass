package playlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        boolean response = album.addSong("Stormbringer", 4.6);

        System.out.print(response);
    }
}