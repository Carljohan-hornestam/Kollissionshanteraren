package com.company;

import java.util.ArrayList;
import java.util.List;

public class Points {
    int x1;
    int y1;
    int x2;
    int y2;
    float r;

    public int setRandomX1(){
        x1 = (int) (Math.random() * 15);
        return x1;
    }
    public int setRandomY1(){
        y1 = (int) (Math.random() * 15);
        return y1;
    }
    public int setX2(int bottomLeftX){
        x2 = bottomLeftX + (int) (Math.random() * 15) + 1;
        return x2;
    }
    public int setY2(int bottomLeftY){
        y2 = bottomLeftY + (int) (Math.random() * 15) + 1;
        return y2;
    }
    public float calculateRadius(){
        r = (float) Math.sqrt((x1 * 2) + (y1 * 2));
        return r;
    }

    }

