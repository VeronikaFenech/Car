package com.example.car;

public class Car{
    private int speed = 0;
    private float tankFull = 80;
    private float tank = 4f;
    private short takhometre = 1500;
    private int weight = 2500;
    private int width = 1000;
    private int height = 1500;
    private long vinCode = 3463;
    private String mark;
    private boolean isEngine;
    private boolean stop;
    private float temperature = 25.0f;
    private float oil = 50.0f;
    private int count=88;

    public Car(){

    }

    public Car(int count, float tankFull, int weight, int height, int width, String mark) {
        this.tankFull = tankFull;
        this.height = height;
        this.weight=weight;
        this.width= width;
        this.mark=mark;


    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    public float getTank() {
        return tank;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String setMark() {
        return mark;
    }


    public void startEngine() {
        if (!stopMechanismNormal()) return;
        if (!isTemperatureNormal()) return;
        if (!oilLevelNormal()) return;
        if (tank > 0 && speed == 0) {
            isEngine = true;
        } else if (isEngine) {
            System.out.println("Car already running");
        }
        isEngine = true;
        System.out.println("Car is running");
    }

    public void stopEngine() {
        isEngine = false;
        System.out.println("Car is stop");

    }

    private boolean isTemperatureNormal() {
        return temperature > 10 && temperature < 98;
    }

    private boolean oilLevelNormal() {
        return oil > 5;
    }

    private boolean stopMechanismNormal() {
        return stop = true;
    }

    public void accelerater(int velocity) {
        if (!isEngine) return;
        if (tank <= 0) {
            speed = 0;
            stopEngine();
            return;
        }
        tank--;
        speed += velocity;
        temperature += 1;
        oil -= 1;
        full(0);
        System.out.println("Наша скорость теперь: " + speed);
        //System.out.println("Наша скорость теперь: " +(((speed -velocity)<=0) ? 0:(speed-=velocity)));
    }

    public void decelerater(int velocity) {
        if (!isEngine) return;
        if (tank <= 0) {
            speed = 0;
            stopEngine();
            return;
        }
        if ((speed - velocity) <= 0) {
            speed = 0;
        } else {
            speed -= velocity;
        }
        System.out.println("Наша скорость теперь: " + (speed));
    }

    public void full(int a) {
        if ((tank + a) >= tankFull) {
            tank = 80f;
            System.out.println("Бак полный");
        } else {
            tank += a;
            System.out.println("Бак заполнен на: " + (tank));
        }
        if (tank <= 0) {
            System.out.println("Бак пуст");
            tank += 80f / 2;
            System.out.println("Вы заправили бак на половину");
        }
    }

}
