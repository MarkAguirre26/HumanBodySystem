package com.mark.humanbody;

/**
 * Created by Mark on 2/19/2017.
 */

public class FactModel {
int image;
    String factname;
    int tag;

    public FactModel(int img,String animalName,  int tag) {
        this.image = img;
        this.factname = animalName;
        this.tag = tag;

    }

    public int getImage() {
        return image;
    }

    public String getFactname() {
        return factname;
    }

    public int getTag() {
        return tag;
    }
}