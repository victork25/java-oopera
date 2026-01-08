package kz.yandex.practicum;

import java.util.ArrayList;
import java.util.List;

public class MusicalShow extends Show {
    private final Person musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors, Person musicAuthor,
                       String librettoText) {
        super(title, duration, director, listOfActors);

        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        this(title, duration, director, new ArrayList<>(), musicAuthor, librettoText);
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
