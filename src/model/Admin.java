package model;

public class Admin {
    private long ID;
    private String name;
    private String surname;
    private String mobilePhone;

    public long getID(){
        return ID;
    }
    public void setID(long ID){
        this.ID = ID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Admin(long ID, String name, String surname, String mobilePhone) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.mobilePhone = mobilePhone;
    }
}
