package com.example.second_recyclereview;

public class Models {
    private String image;
    private String name;
    private String weight;
    private String consumption;
    private String price;

    public Models(String image, String name, String weight, String consumption, String price) {
        this.image = image;
        this.name = name;
        this.weight = weight;
        this.consumption = consumption;
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
