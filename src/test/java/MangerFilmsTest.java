import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MangerFilmsTest {

    @Test
    public void allFilms() {
        ManagerFilms films = new ManagerFilms();

        Afisha[] expected = {};

        Assertions.assertArrayEquals(expected, films.getItems());
    }

    @Test
    public void addOneFilm() {
        ManagerFilms manager = new ManagerFilms();

        manager.save("film1");

        String[] expected = {"film1"};

        Assertions.assertArrayEquals(expected, manager.getItems());
    }

    @Test
    public void addTwoFilm() {
        ManagerFilms manager = new ManagerFilms();

        manager.save("film1");
        manager.save("film2");

        String[] expected = {"film1", "film2"};

        Assertions.assertArrayEquals(expected, manager.getItems());
    }

    @Test
    public void filmsMoreLimit() {
        ManagerFilms manager = new ManagerFilms();

        manager.save("film1");
        manager.save("film2");
        manager.save("film3");
        manager.save("film4");
        manager.save("film5");

        String[] expected = {"film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsMoreThanLimit() {
        ManagerFilms manager = new ManagerFilms(7);


        manager.save("film1");
        manager.save("film2");
        manager.save("film3");
        manager.save("film4");
        manager.save("film5");
        manager.save("film6");
        manager.save("film7");

        String[] expected = {"film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsLessThanLimit() {
        ManagerFilms manager = new ManagerFilms();

        manager.save("film1");
        manager.save("film2");

        String[] expected = {"film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsFindAll() {
        ManagerFilms manager = new ManagerFilms();

        manager.save("film1");
        manager.save("film2");
        manager.save("film3");
        manager.save("film4");
        manager.save("film5");

        String[] expected = {"film1", "film2", "film3", "film4", "film5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
