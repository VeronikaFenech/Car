package com.example.car;

public class Singleton {
    private static Singleton instance;

    int count;

    public Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

