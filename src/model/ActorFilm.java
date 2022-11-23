package model;

public class ActorFilm {
    private long ID;
    private long actor_ID;
    private long film_ID;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getActor_ID() {
        return actor_ID;
    }

    public void setActor_ID(long actor_ID) {
        this.actor_ID = actor_ID;
    }

    public long getFilm_ID() {
        return film_ID;
    }

    public void setFilm_ID(long film_ID) {
        this.film_ID = film_ID;
    }

    public ActorFilm(long ID, long actor_ID, long film_ID) {
        this.ID = ID;
        this.actor_ID = actor_ID;
        this.film_ID = film_ID;
    }
}
