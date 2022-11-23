package model;

public class DescriptionGenreFilm {
    private long ID;
    private String descriptionGenre;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getDescriptionGenre() {
        return descriptionGenre;
    }

    public void setDescriptionGenre(String descriptionGenre) {
        this.descriptionGenre = descriptionGenre;
    }

    public DescriptionGenreFilm(long ID, String descriptionGenre) {
        this.ID = ID;
        this.descriptionGenre = descriptionGenre;
    }
}
