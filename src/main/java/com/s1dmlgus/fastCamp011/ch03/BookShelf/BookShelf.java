package com.s1dmlgus.fastCamp011.ch03.BookShelf;

public class BookShelf extends Shelf implements Queue{

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQeueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
