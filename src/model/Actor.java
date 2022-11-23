package model;

import java.time.LocalDate;
import java.util.Date;

public class Actor {
    private long ID;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Actor(long ID, String name, String surname, LocalDate dateOfBirth) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }
}
