package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Points point = new Points();
    CollisionChecker checker = new CollisionChecker();
    private boolean b;
    private String choice = "";
    private String restartMenuChoice = "";
    public static int playField;
    private int numberOfDots;
    private int numberOfCircles;
    private int numberOfSquares;

    public void run() {
        System.out.println("1: Run program");
        System.out.println("2: Exit");
        choice = scan.nextLine();
        if (choice.equals("1")) {
            runProgram();
        } else {

        }
    }

    public void runProgram() {
        System.out.println("Enter size of playfield as an integer: ");
        do {
            playField = scan.nextInt();
            if (playField > 100) {
                System.out.println("The max limit for the playfield is 100x100, enter a new number");
                b = false;
            } else {
                b = true;
            }
        } while (!b);

        System.out.println("How many dots would you like it to be on the field?");
        numberOfDots = scan.nextInt();
        ArrayList<Dot> dots = new ArrayList<>();
        Dot.createDots(dots, numberOfDots);

        System.out.println("How many circles would you like it to be on the field?");
        numberOfCircles = scan.nextInt();
        ArrayList<Circle> circles = new ArrayList<>();
        Circle.createCircles(circles, numberOfCircles);

        System.out.println("How many squares would you like it to be on the field?");
        numberOfSquares = scan.nextInt();
        ArrayList<Square> squares = new ArrayList<>();
        Square.createSquares(squares, numberOfSquares);

        checker.checkDotVsDotCollisions(dots);
        checker.checkCircleVsCircleCollisions(circles);
        checker.checkSquareVsSquareCollisions(squares);
        checker.checkCircleVsSquareCollide(circles, squares);
        checker.checkDotVsSquareCollisions(dots, squares);
        checker.checkDotVsCircleCollisions(dots, circles);

        restartMenu(dots, circles, squares);
    }

    public void restartMenu(ArrayList<Dot> dots, ArrayList<Circle> circles, ArrayList<Square> squares) {
        System.out.println("1: Restart");
        System.out.println("2: Quit");
        do {
            restartMenuChoice = scan.nextLine();
            if (restartMenuChoice.equals("1")) {
                restart(dots, circles, squares);
            }
        } while (!restartMenuChoice.equals("2"));
    }
    public void restart(ArrayList<Dot> dots, ArrayList<Circle> circles, ArrayList<Square> squares){
        for (Dot dot : dots) {
            dot.setX(point.setRandomX1());
            dot.setY(point.setRandomY1());
        }
        for (Circle circle : circles) {
            circle.setX(point.setRandomX1());
            circle.setY(point.setRandomY1());
        }
        for (Square square : squares){
            square.setTopRightX(point.setRandomX1());
            square.setTopRightY(point.setRandomY1());
            square.setBottomLeftX(point.setX2(square.getTopRightX()));
            square.setBottomLeftY(point.setY2(square.getTopRightY()));
        }
        checker.checkDotVsDotCollisions(dots);
        checker.checkCircleVsCircleCollisions(circles);
        checker.checkSquareVsSquareCollisions(squares);
        checker.checkCircleVsSquareCollide(circles, squares);
        checker.checkDotVsSquareCollisions(dots, squares);
        checker.checkDotVsCircleCollisions(dots, circles);

        restartMenu(dots, circles, squares);
    }
}
