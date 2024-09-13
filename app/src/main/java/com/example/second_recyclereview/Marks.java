package com.example.second_recyclereview;

public class Marks {
    private String name;
    private String image;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Marks(String name,String image) {
        this.name = name;
        this.image = image;
    }
}
