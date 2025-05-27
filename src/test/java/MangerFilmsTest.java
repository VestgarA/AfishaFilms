import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MangerFilmsTest {
    Afisha film1 = new Afisha("Бладшот");
    Afisha film2 = new Afisha("Вперёд");
    Afisha film3 = new Afisha("Отель 'Белград'");
    Afisha film4 = new Afisha("Джентельмены");
    Afisha film5 = new Afisha("Человек-невидимка");
    Afisha film6 = new Afisha("Троли 'Мировой тур'");
    Afisha film7 = new Afisha("Номер один");

    @Test
    public void allFilms() {
        ManagerFilms films = new ManagerFilms();

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);
        films.save(film6);
        films.save(film7);

        Afisha[] expected = {film1, film2, film3, film4, film5, film6, film7};

        Assertions.assertArrayEquals(expected, films.getItems());
    }

    @Test
    public void addOneFilm() {
        ManagerFilms films = new ManagerFilms();

        films.save(film7);

        Afisha[] expected = {film7};

        Assertions.assertArrayEquals(expected, films.getItems());
    }

    @Test
    public void filmsFindLast() {
        ManagerFilms films = new ManagerFilms();
        // ProductManager manager = new ProductManager(films);

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);

        Afisha[] expected = {film5, film4, film3, film2, film1};
        Afisha[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsFindAll() {
        ManagerFilms films = new ManagerFilms();

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);

        Afisha[] expected = {film1, film2, film3, film4, film5};
        Afisha[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
