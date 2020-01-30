package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    private boolean b;
    private String choice = "";
    private int playField;
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
        CollisionChecker checker = new CollisionChecker();
        checker.checkForCollisions(dots, circles, squares);
        checker.checkCircleSquareCollide(circles, squares);
        checker.checkDotCollisions(dots, squares, circles);
    }

}
