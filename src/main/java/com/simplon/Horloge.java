package com.simplon;

public class Horloge {
    public int currentHour=0;

    public Horloge(int hour) {
        currentHour = hour;
    }

    public int getHour() {
        return currentHour;
    }
    public void setCurrentHour(int hour){currentHour = hour;}
}
