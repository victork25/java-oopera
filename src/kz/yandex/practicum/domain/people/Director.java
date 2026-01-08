package kz.yandex.practicum.domain.people;

public class Director extends Person {
    private final int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);

        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
