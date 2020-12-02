package com.example.car;

public class Bike extends Car{
    public static int count=0;
    public Bike( float tankFull, int weight, int height, int width, String mark) {
        super (2,tankFull, weight, height, width, mark);
    }
    public Bike(int count, float tankFull, int weight, int height, int width, String mark) {
        super (count,tankFull, weight, height, width, mark);

        MainActivity.text="STATIC TEXT";
        int sum=MainActivity.A_PLUS_B(0,2);
    }
}
