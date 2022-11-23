package model;

import java.time.LocalDate;
import java.util.Date;

public class Film {
    private int ID;
    private int genre_ID;
    private String filmName;
    private LocalDate releaseYearFilm;
    private long lengthOfTheFilm;
    private String descriptionFilm;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGenre_ID() {
        return genre_ID;
    }

    public void setGenre_ID(int genre_ID) {
        this.genre_ID = genre_ID;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public LocalDate getReleaseYearFilm() {
        return releaseYearFilm;
    }

    public void setReleaseYearFilm(LocalDate releaseYearFilm) {
        this.releaseYearFilm = releaseYearFilm;
    }

    public long getLengthOfTheFilm() {
        return lengthOfTheFilm;
    }

    public void setLengthOfTheFilm(long lengthOfTheFilm) {
        this.lengthOfTheFilm = lengthOfTheFilm;
    }

    public String getDescriptionFilm() {
        return descriptionFilm;
    }

    public void setDescriptionFilm(String descriptionFilm) {
        this.descriptionFilm = descriptionFilm;
    }

    public Film(int ID, int genre_ID, String filmName, LocalDate releaseYearFilm, long lengthOfTheFilm, String descriptionFilm) {
        this.ID = ID;
        this.genre_ID = genre_ID;
        this.filmName = filmName;
        this.releaseYearFilm = releaseYearFilm;
        this.lengthOfTheFilm = lengthOfTheFilm;
        this.descriptionFilm = descriptionFilm;
    }
}
