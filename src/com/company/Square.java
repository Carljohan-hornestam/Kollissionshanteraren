package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Square extends Points {
    public int topRightX;
    public int topRightY;
    public int bottomLeftX;
    public int bottomLeftY;

    public Square(){
        topRightX = setRandomX1();
        topRightY = setRandomY1();
        bottomLeftX = setX2(topRightX);
        bottomLeftY = setY2(topRightY);
    }
    public int getBottomLeftX(){
        return bottomLeftX;
    }
    public int getBottomLeftY(){
        return bottomLeftY;
    }
    public int getTopRightX(){
        return topRightX;
    }
    public int getTopRightY(){
        return topRightY;
    }

    public void setBottomLeftX(int bottomLeftX) {
        this.bottomLeftX = bottomLeftX;
    }

    public void setBottomLeftY(int bottomLeftY) {
        this.bottomLeftY = bottomLeftY;
    }

    public void setTopRightX(int topRightX) {
        this.topRightX = topRightX;
    }

    public void setTopRightY(int topRightY) {
        this.topRightY = topRightY;
    }

    public static List createSquares(ArrayList<Square> squares, int numberofSquares){
        for (int i = 0; i < numberofSquares; i++){
            squares.add(new Square());
            System.out.println("Square created with coordinates " + squares.get(i).x1 + "," + squares.get(i).y1);
            System.out.println();
        }
        return squares;
    }
    }



