package com.example.modul_1_zaniatie_6;

import android.util.Log;

public class Warrior implements Movable, Attacking{
    @Override
    public void attack() {
        Log.d("MYLOG", "warrior attack");
    }

    @Override
    public void move() {
        Log.d("MYLOG", "warrior move");
    }

    @Override
    public void stop() {
        Log.d("MYLOG", "warrior stop");
    }
}
