package com.example.car;

public class Book {
    private static Book instance;

    int count;

    public Book() {

    }

    public static Book getInstance() {
        if (instance == null) {
            instance = new Book();
        }
        return instance;
    }
}
