package com.s1dmlgus.fastCamp011.ch03.BookShelf;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        this.shelf = new ArrayList<>();
    }

    public int getCount() {

        return shelf.size();
    }
}
