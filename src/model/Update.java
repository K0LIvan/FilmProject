package model;

public interface Update {
    Client updateClient(long id);
    Admin updateAdmin(long id);
    Purchase updatePurchase(long id);
    Film updateFilm(long id);
    Actor updateActor(long id);
    ActorFilm updateActorFilm(long id);
    SocialMediaActor updateSocialMediaActor(long id);
    GenreFilm updateGenreFilm(long genre_ID);
    DescriptionGenreFilm updateDescriptionGenreFilm(long id);
}
