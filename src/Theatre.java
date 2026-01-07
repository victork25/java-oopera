import kz.yandex.practicum.*;

import java.util.List;

public class Theatre {

    public static void main(String[] args) {
        final var actors = List.of(
                new Actor("Актер", "0", Gender.MALE, 182),
                new Actor("Актер", "1", Gender.FEMALE, 178),
                new Actor("Актер", "2", Gender.MALE, 181)
        );

        final var directors = List.of(
                new Director("Режиссер", "0", Gender.MALE, 3),
                new Director("Режиссер", "1", Gender.FEMALE, 5)
        );

        final var musicAuthor = new Person("Автор музыки", "0", Gender.MALE);
        final var choreograph = new Person("Хореограф", "0", Gender.FEMALE);

        final var show = new Show("Обычный спектакль 0", 60, directors.get(0));
        show.addActor(actors.get(0));
        show.addActor(actors.get(1));

        final var opera = new Opera("Опера 0", 60, directors.get(1), musicAuthor, "Либретто Опера 0", 3);
        for (Actor actor : actors) {
            opera.addActor(actor);
        }

        final var ballet = new Ballet("Балет 0", 60, directors.get(0), musicAuthor, "Либретто Балет 0", choreograph);
        ballet.addActor(actors.get(0));
        ballet.addActor(actors.get(1));


        show.printActors();
        opera.printActors();
        ballet.printActors();

        ballet.replaceActor(ballet.getListOfActors().get(0).getSurname(), opera.getListOfActors().get(2));
        ballet.printActors();

        show.replaceActor(actors.get(2).getSurname(), opera.getListOfActors().get(2));
        show.printActors();

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
