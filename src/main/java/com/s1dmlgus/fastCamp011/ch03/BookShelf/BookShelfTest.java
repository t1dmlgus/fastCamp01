package com.s1dmlgus.fastCamp011.ch03.BookShelf;

public class BookShelfTest {

    public static void main(String[] args) {

        // BookShelf -> Queue 타입
        Queue bookShelf = new BookShelf();

        bookShelf.enQueue("h2");
        bookShelf.enQueue("h1");
        bookShelf.enQueue("h3");
        bookShelf.enQueue("h4");
        bookShelf.enQueue("h5");
        bookShelf.enQueue("h6");

        System.out.println(bookShelf.getSize());

        System.out.println(bookShelf.deQeueue());
    }
}
