package com.example.modul_1_zaniatie_6;

import android.util.Log;

public class Farmer implements Movable{
    int health = 100;

    @Override
    public void move() {
        Log.d("MYLOG", "farmer move");
    }

    @Override
    public void stop() {
        Log.d("MYLOG", "farmer stop");
    }

    public void build(){
        Log.d("MYLOG", "farmer build");
    }
}
