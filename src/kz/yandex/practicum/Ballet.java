package kz.yandex.practicum;

import java.util.ArrayList;
import java.util.List;

public class Ballet extends MusicalShow {
    private final Person choreographer;

    public Ballet(String title, int duration, Director director, List<Actor> listOfActors, Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);

        this.choreographer = choreographer;
    }

    public Ballet(String title, int duration, Director director, Person musicAuthor, String librettoText,
                  Person choreographer) {
        this(title, duration, director, new ArrayList<>(), musicAuthor, librettoText, choreographer);
    }

    public Person getChoreographer() {
        return choreographer;
    }
}
