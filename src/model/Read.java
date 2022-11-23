package model;

public interface Read {
    Client readClient(long id);
    Admin readAdmin(long id);
    Purchase readPurchase(long id);
    Film readFilm(long id);
    Actor readActor(long id);
    ActorFilm readActorFilm(long id);
    SocialMediaActor readSocialMediaActor(long id);
    GenreFilm readGenreFilm(long genre_ID);
    DescriptionGenreFilm readDescriptionGenreFilm(long id);
}
