package com.makoele.naturalbeautyremediesforafricanskin;

public class Item {
    String name;
    String description;
    int img;

   public Item(){}

   public Item(String name, String description, int img){
       this.name = name;
       this.description = description;
       this.img = img;

   }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImg() {
        return img;
    }
}
