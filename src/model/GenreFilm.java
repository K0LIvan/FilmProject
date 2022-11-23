package model;

public class GenreFilm {
    private long genre_ID;
    private String nameGenreFilm;

    public long getGenre_ID() {
        return genre_ID;
    }

    public void setGenre_ID(long genre_ID) {
        this.genre_ID = genre_ID;
    }

    public String getNameGenreFilm() {
        return nameGenreFilm;
    }

    public void setNameGenreFilm(String nameGenreFilm) {
        this.nameGenreFilm = nameGenreFilm;
    }

    public GenreFilm(long genre_ID, String nameGenreFilm) {
        this.genre_ID = genre_ID;
        this.nameGenreFilm = nameGenreFilm;
    }
}
