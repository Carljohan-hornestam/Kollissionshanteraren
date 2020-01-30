package com.company;

import java.util.ArrayList;

public class CollisionChecker {
    public CollisionChecker() {
    }


    public void checkForCollisions(ArrayList<Dot> dots, ArrayList<Circle> circles, ArrayList<Square> squares) {
        for (int i = 0; i < dots.size(); i++) {
            for (int j = i + 1; j < dots.size(); j++) {
                if (dots.get(i).getX() == dots.get(j).getX() && dots.get(i).getY() == dots.get(j).getY()) {
                    System.out.println("Collision on dots located at " + dots.get(i).getX() + ", " + dots.get(i).getY());
                }
            }
        }
        System.out.println();
        for (int i = 0; i < circles.size(); i++) {
            for (int j = i + 1; j < circles.size(); j++) {
                if (Math.pow(circles.get(i).getX() - circles.get(j).getX(), 2) + Math.pow(circles.get(i).getY() - circles.get(j).getY()
                        , 2) <= Math.pow(circles.get(i).getR() + circles.get(j).getR(), 2)) {
                    System.out.println("Circle located at " + circles.get(i).getX() + "," + circles.get(i).getY()
                            + " collided with circle located at " + circles.get(j).getX() + "," + circles.get(j).getY() + "\n");
                }
            }
        }
        for (int i = 0; i < squares.size(); i++) {
            for (int j = i + 1; j < squares.size(); j++) {
                if (squares.get(i).getBottomLeftY() > squares.get(j).getTopRightY() || squares.get(i).getTopRightY() < squares.get(j)
                        .getBottomLeftY() || squares.get(i).getTopRightX() > squares.get(j).getTopRightX()
                        || squares.get(i).getTopRightX() < squares.get(j).getBottomLeftX()) {
                } else {
                    System.out.println("Square with top right coordinates of " + squares.get(i).getTopRightX() + "," + squares.get(i).getTopRightY()
                            + " and bottom left coordinates of " + squares.get(i).getBottomLeftX() + "," + squares.get(i).getBottomLeftY());
                    System.out.print("collided with square with top right coordinates of " + squares.get(j).getTopRightX() + "," +
                            squares.get(j).getTopRightY() + " and bottom left coordinates of " + squares.get(j).getBottomLeftX() + "," +
                            squares.get(j).getBottomLeftY() + "\n");
                }
            }
        }
    }

    public void checkCircleSquareCollide(ArrayList<Circle> circles, ArrayList<Square> squares) {
        for (int i = 0; i < circles.size(); i++) {
            for (int j = 0; j < squares.size(); j++) {
                if (circles.get(i).getX() + circles.get(i).getR() < squares.get(j).getBottomLeftX() || circles.get(i).getY() +
                        circles.get(i).getR() < squares.get(j).getBottomLeftY() || circles.get(i).getX() - circles.get(i).getR() >
                        squares.get(j).getTopRightX() || circles.get(i).getY() - circles.get(i).getR() > squares.get(j).getTopRightY()) {
                } else {
                    System.out.println("Square with top right coordinates of " + squares.get(j).getTopRightX() + "," +
                            squares.get(j).getTopRightY() + " and bottom left coordinates of " +
                            squares.get(j).getBottomLeftX() + "," + squares.get(j).getBottomLeftY());
                    System.out.print("collided with circle with coordinates of " + circles.get(i).getX() + "," + circles.get(i).getY() + "\n\n");
                }
            }
        }
    }
    public void checkDotCollisions(ArrayList<Dot> dots, ArrayList<Square> squares, ArrayList<Circle> circles){
        for (int i = 0; i < dots.size(); i++){
            for (int j = 0; j < squares.size(); j++){
                if (dots.get(i).getX() > squares.get(j).getBottomLeftX() & dots.get(i).getY() > squares.get(j).getBottomLeftY() &&
                        dots.get(i).getX() < squares.get(j).getTopRightX() & dots.get(i).getY() < squares.get(j).getTopRightY()){
                    System.out.println("Dot with coordinates " + dots.get(i).getX() + "," + dots.get(i).getY() +
                            "collided with square with top right coordinates of " + squares.get(j).getTopRightX() + "," +
                            squares.get(j).getTopRightY() + " and bottom left coordinates of " +
                            squares.get(j).getBottomLeftX() + "," + squares.get(j).getBottomLeftY() + "\n");
                }
                else{
                }
            }
        }
    }
}