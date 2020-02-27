package com.company;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Points {
    public int x;
    public int y;
    public float r;
    public int diameter;

    public Circle(){
        x = setRandomX1();
        y = setRandomY1();
        r = calculateRadius();
        diameter = (int) (r * 2);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public float getR(){
        return r;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDiameter(){
        return diameter;
    }
    public static List createCircles(ArrayList<Circle> circles, int numberofCircles){
        for (int i = 0; i < numberofCircles; i++){
            circles.add(new Circle());
            System.out.println("Circle created with coordinates " + circles.get(i).x + "," + circles.get(i).y);
        }
        return circles;
    }

}
