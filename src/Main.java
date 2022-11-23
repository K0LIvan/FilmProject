import model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {


    static ArrayList<Actor> actors = new ArrayList<Actor>();
    static ArrayList<ActorFilm> actorFilms = new ArrayList<>();
    static ArrayList<SocialMediaActor> socialMediaActors = new ArrayList<>();
    static ArrayList<GenreFilm> genreFilms = new ArrayList<>();
    static ArrayList<DescriptionGenreFilm> descriptionGenreFilms = new ArrayList<>();
    static ArrayList<Film> films = new ArrayList<Film>();
    static ArrayList<Purchase> purchases = new ArrayList<>();
    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Admin> admins = new ArrayList<>();

    public static void main(String[] args) {
        //write here
    }

    public static void initDate(){
        clients.add(new Client(1, "Иван", "Иванов", "+111111111111"));
        clients.add(new Client(2, "Павел", "Павлов", "+222222222222"));
        clients.add(new Client(3, "Петр","Петров", "+333333333333"));

        admins.add(new Admin(0, "Admin", "Admin", "+000000000000"));

        purchases.add(new Purchase(1, 1, 1, 11.1, LocalDate.of(2022, 11, 1)));
        purchases.add(new Purchase(2, 2, 2, 22.2, LocalDate.of(2022, 11, 2)));
        purchases.add(new Purchase(3, 3, 3, 33.3, LocalDate.of(2022, 11, 3)));

        films.add(new Film(1, 1, "Звездные войны 5",  LocalDate.of(1980, 5, 21), 11111111, "описание"));
        films.add(new Film(2, 2, "Звездный путь 3",  LocalDate.of(2016, 8, 21), 22222222, "описание"));
        films.add(new Film(3, 3, "Области тьмы",  LocalDate.of(2011, 3, 17), 33333333, "описание"));

        genreFilms.add(new GenreFilm(1, "боевик"));
        genreFilms.add(new GenreFilm(2, "приключение"));
        genreFilms.add(new GenreFilm(2, "фантастика"));

        descriptionGenreFilms.add(new DescriptionGenreFilm(1, "жанр кинематографа, в котором основное внимание уделяется перестрелкам, дракам, погоням и т. д."));
        descriptionGenreFilms.add(new DescriptionGenreFilm(2, "остросюжетный вид игрового фильма, соответствующий приключенческому роману в литературе"));
        descriptionGenreFilms.add(new DescriptionGenreFilm(3, " жанр, объединяющий художественные произведения, в которых повествуется о событиях, мирах и героях, нарушающих границы реальности"));

        actors.add(new Actor(1, "Харрисон", "Форд", LocalDate.of(1942, 7, 13)));
        actors.add(new Actor(2, "Крис", "Пайн", LocalDate.of(1980, 8, 26)));
        actors.add(new Actor(3, "Бредли", "Купер", LocalDate.of(1975, 1, 5)));

        actorFilms.add(new ActorFilm(1, 1, 1));
        actorFilms.add(new ActorFilm(2, 2, 2));
        actorFilms.add(new ActorFilm(3, 3, 3));

        socialMediaActors.add(new SocialMediaActor(1, "link", "link", "link"));
        socialMediaActors.add(new SocialMediaActor(2, "link","link","link"));
        socialMediaActors.add(new SocialMediaActor(3, "link", "link", "link"));
    }
}
