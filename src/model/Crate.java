package model;

public interface Crate {
    Client createClient(long id);
    Admin createAdmin(long id);
    Purchase createPurchase(long id);
    Film crateFilm(long id);
    Actor createActor(long id);
    ActorFilm createActorFilm(long id);
    SocialMediaActor createSocialMediaActor(long id);
    GenreFilm crateGenreFilm(long genre_ID);
    DescriptionGenreFilm createDescriptionGenreFilm(long id);
}
