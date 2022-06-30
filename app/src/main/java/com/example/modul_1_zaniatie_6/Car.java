package com.example.modul_1_zaniatie_6;

public class Car {
    static String type = "Car";
    public final int WHEELS = 4;
    //public Location location = new Location();

    static String getModel(){
        return "BMW";
    }

    public String getDriver(){
        new Engine().startEngine();
        return "Ivan";
    }

    private class Engine {
        public String model = "Engine-12";
        public int engineWeight = 123;

        public void startEngine(){

        }
    }

    //private class Location() {
    //        int lat = 0;
    //        int lng = 0;
    //    }
}
