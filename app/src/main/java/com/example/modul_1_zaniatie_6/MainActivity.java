package com.example.modul_1_zaniatie_6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements VideoCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Car.getModel();

        Car car = new Car();
        car.getDriver();

        Car.type = "fff";

        // new Car.Engine().startEngine();


        Designer john = new Designer();
        Programmer bill = new Programmer();

        john.work();
        bill.work();


        Human anonymousClassHumanSinger = new Human() {
            @Override
            void work() {
                Log.d("MYLOG", "Signing");
            }
        };


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code after button used
                v.setBackgroundColor(Color.GREEN);
            }
        });


        Farmer farmer = new Farmer();
        Warrior warrior = new Warrior();

        farmer.move();
        farmer.move();
        farmer.stop();
        farmer.build();

        warrior.attack();
        warrior.move();
        warrior.stop();

        Movable farmer_two = new Farmer();
        farmer_two.move();


        //callback
        VideoProcessor videoProcessor = new VideoProcessor(this);

    }


    @Override
    public void onFinished() {

    }

    @Override
    public void onHalfDone() {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}