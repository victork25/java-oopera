package kz.yandex.practicum;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public Show(String title, int duration, Director director) {
        this(title, duration, director, new ArrayList<>());
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printDirectorInformation() {
        System.out.println(director);
    }

    public void printActors() {
        System.out.println("Список актеров " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Этот актер уже участвует в спектакле.");
            return;
        }

        listOfActors.add(actor);
    }

    public void replaceActor(String targetActorSurname, Actor substitute) {
        boolean wasReplaced = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(targetActorSurname)) {
                listOfActors.set(i, substitute);
                wasReplaced = true;
                break;
            }
        }

        if (!wasReplaced) {
            System.out.println("Актер с такой фамилией не найден.");
        }
    }
}
