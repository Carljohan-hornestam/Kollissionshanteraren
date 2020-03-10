package com.company;


public class Points {
    int x1;
    int y1;
    int x2;
    int y2;
    float r;

    public int setRandomX1(){
        do {
            x1 = (int) (Math.random() * Menu.playField);
        } while (x1 > Menu.playField);
        return x1;
    }
    public int setRandomY1(){
        do {
            y1 = (int) (Math.random() * Menu.playField);
        } while (y1 > Menu.playField);
        return y1;
    }
    public int setX2(int topRightX){
        x2 = topRightX / 2;
        return x2;
    }
    public int setY2(int topRightY){
        y2 = topRightY / 2;
        return y2;
    }
    public float calculateRadius(){
        r = (float) Math.sqrt((x1 * 2) + (y1 * 2));
        return r;
    }

    }

