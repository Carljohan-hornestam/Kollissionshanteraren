package com.company;

import java.util.ArrayList;
import java.util.List;

public class Dot extends Points {
    public int x;
    public int y;

    public Dot(){
        this.x = setRandomX1();
        this.y = setRandomY1();
    }

    public int getX(){
        return x;
}
    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static List createDots(ArrayList<Dot> dots, int numberOfDots){
        for (int i = 0; i < numberOfDots; i++){
            dots.add(new Dot());
            System.out.println("Dot created with coordinates " + dots.get(i).x + "," + dots.get(i).y);
        }
        return dots;
    }
}
