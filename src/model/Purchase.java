package model;

import java.time.LocalDate;
import java.util.Date;

public class Purchase {
    private long ID;
    private long film_ID;
    private long client_ID;
    private double amountPurchase;
    private LocalDate dateOfPurchase;

    public long getID(){
        return ID;
    }
    public void setID(long ID){
        this.ID = ID;
    }
    public long getFilm_ID(){
        return film_ID;
    }
    public void setFilm_ID(long film_ID){
        this.film_ID = film_ID;
    }
    public long getClient_ID(){
        return client_ID;
    }
    public void setClient_ID(long client_ID){
        this.client_ID =client_ID;
    }
    public double getAmountPurchase(){
        return amountPurchase;
    }
    public void setAmountPurchase(double amountPurchase){
        this.amountPurchase = amountPurchase;
    }
    public LocalDate getDateOfPurchase(){
        return dateOfPurchase;
    }
    public void setDateOfPurchase(LocalDate dateOfPurchase){
        this.dateOfPurchase = dateOfPurchase;
    }

    public Purchase(long ID, long film_ID, long client_ID, double amountPurchase, LocalDate dateOfPurchase) {
        this.ID = ID;
        this.film_ID = film_ID;
        this.client_ID = client_ID;
        this.amountPurchase = amountPurchase;
        this.dateOfPurchase = dateOfPurchase;
    }
}
