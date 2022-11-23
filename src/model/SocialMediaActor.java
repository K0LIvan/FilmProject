package model;

public class SocialMediaActor {
    private long ID;
    private String linkFacebook;
    private String linkInstagram;
    private String linkTwitter;

    public long getID(){
        return ID;
    }
    public void setID(long ID){
        this.ID = ID;
    }
    public String getLinkFacebook(){
        return linkFacebook;
    }
    public void setLinkFacebook(String linkFacebook){
        this.linkFacebook = linkFacebook;
    }
    public String getLinkInstagram(){
        return linkInstagram;
    }
    public void setLinkInstagram(String linkInstagram){
        this.linkInstagram = linkInstagram;
    }
    public String getLinkTwitter(){
        return linkTwitter;
    }
    public void setLinkTwitter(String linkTwitter){
        this.linkTwitter = linkTwitter;
    }

    public SocialMediaActor(long ID, String linkFacebook, String linkInstagram, String linkTwitter) {
        this.ID = ID;
        this.linkFacebook = linkFacebook;
        this.linkInstagram = linkInstagram;
        this.linkTwitter = linkTwitter;
    }
}
