package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Square extends Points {
    public int bottomLeftX;
    public int bottomLeftY;
    public int topRightX;
    public int topRightY;
    public int sideA;
    public int sideB;

    public Square(){
        bottomLeftX = setRandomX1();
        bottomLeftY = setRandomY1();
        topRightX = setX2(bottomLeftX);
        topRightY = setY2(bottomLeftY);
        sideA = 5;
        sideB = 5;
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
    public int getSideA(){return sideA;}
    public int getSideB(){return sideB;}

    public static List createSquares(ArrayList<Square> squares, int numberofSquares){
        for (int i = 0; i < numberofSquares; i++){
            squares.add(new Square());
            System.out.println("Square created with coordinates " + squares.get(i).x1 + "," + squares.get(i).y1);
        }
        return squares;
    }
    }



