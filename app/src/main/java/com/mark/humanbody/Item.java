package com.mark.humanbody;

/**
 * Created by Mark on 2/19/2017.
 */

public class Item {

    String animalName;
    int animalImage,itemCount;
    int tag;

    public Item(String animalName, int animalImage, int tag,int count) {
        this.animalImage = animalImage;
        this.animalName = animalName;
        this.tag = tag;
        this.itemCount  =count;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalImage() {
        return animalImage;
    }

    public int getTag() {
        return tag;
    }
}