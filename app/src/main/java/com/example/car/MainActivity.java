package com.example.car;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Car car = null;

    TextView txtTank;
    TextView txtWeight;
    TextView txtWidth;
    TextView txtTakhometre;
    TextView txtHeight;
    TextView txtVinCode;
    TextView txtMark;
    TextView txtIsEngine;


    static String text = "";
    public static int A_PLUS_B(int a,int b){
        return a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*iCar iCar= new Car(4,80.0f, 2500, 3500, 1500, "VAZ");
        iCar truck =new Truck();*/
        Bike.count=0;
        Singleton singleton= Singleton.getInstance();
        singleton.count++;
        Singleton singleton2= Singleton.getInstance();
        System.out.println(("Count; " +singleton.count));
        car = new Car(4,80.0f, 2500, 3500, 1500, "VAZ");
        car.setHeight(1500);
        car.setWidth(5500);

        Jeep jeep=new Jeep(4,80.0f, 2500, 3500, 1500, "VAZ");
        jeep.getHeight();



        txtTank = findViewById(R.id.txtTank);
        txtWeight = findViewById(R.id.txtWeight);
        txtWidth = findViewById(R.id.txtWidth);
        txtTakhometre = findViewById(R.id.txtTakhometre);
        txtHeight = findViewById(R.id.txtHeight);
        txtVinCode = findViewById(R.id.txtVinCode);
        txtMark = findViewById(R.id.txtMark);
        txtIsEngine = findViewById(R.id.txtIsEngine);

        txtTank.setText("Tank =" + car.getTank());
        txtWeight.setText("Weight =" + car.getWidth());
        txtWidth.setText("Width =" + car.getWidth());
        //txtTakhometre.setText("Takhometre =" + car.takhometre);
        txtHeight.setText("Height =" + car.getHeight());
        //txtVinCode.setText("VinCode =" + car.vinCode);
        txtMark.setText("Mark =" + car.setMark());
        //txtIsEngine.setText("IsEngine =" + car.isEngine);

        car.startEngine();
        //int sum =sum(12,32);
        //String s="Sum a and b = "+sum;
        //System.out.println(s);
        car.accelerater(5);
        car.accelerater(10);
        car.accelerater(10);
        car.accelerater(10);
        car.accelerater(10);
        car.decelerater(30);
        car.decelerater(30);
        car.stopEngine();
        //test();

    }

    int sum(int a, int b) {
        return a + b;
    }


}
