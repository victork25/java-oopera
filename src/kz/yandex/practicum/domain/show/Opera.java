package kz.yandex.practicum.domain.show;

import kz.yandex.practicum.domain.people.*;

import java.util.ArrayList;
import java.util.List;

public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director, List<Actor> listOfActors, Person musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);

        this.choirSize = choirSize;
    }

    public Opera(String title, int duration, Director director, Person musicAuthor, String librettoText,
                 int choirSize) {
        this(title, duration, director, new ArrayList<>(), musicAuthor, librettoText, choirSize);
    }

    public int getChoirSize() {
        return choirSize;
    }
}
