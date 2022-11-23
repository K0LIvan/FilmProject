package model;

public interface Delete {
    Client deleteClient(long id);
    Admin deleteAdmin(long id);
    Purchase deletePurchase(long id);
    Film deleteFilm(long id);
    Actor deleteActor(long id);
    ActorFilm deleteActorFilm(long id);
    SocialMediaActor deleteSocialMediaActor(long id);
    GenreFilm deleteGenreFilm(long genre_ID);
    DescriptionGenreFilm deleteDescriptionGenreFilm(long id);
}
