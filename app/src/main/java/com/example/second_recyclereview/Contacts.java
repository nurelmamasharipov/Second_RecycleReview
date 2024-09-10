package com.example.second_recyclereview;

public class Contacts {
    private String name;
    private String about;
    private String image;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Contacts(String name, String about, String image) {
        this.name = name;
        this.about = about;
        this.image = image;
    }
}
