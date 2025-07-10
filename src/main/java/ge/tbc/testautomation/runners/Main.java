package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.figures.Circle;

import java.util.StringJoiner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import ge.tbc.testautomation.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(7);
            System.out.println("circle area: " + circle.getArea());
            System.out.println("circle length: " + circle.getLength());
            circle.printPackageName();

            circle.doubleSize();
            System.out.println("circle double area: " + circle.getArea());

            circle.customSize(3);
            System.out.println("circle custom area: " + circle.getArea());

            System.out.println(circle.validateFigure());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Triangle triangle = new Triangle(3, 6, 5, 6);
            System.out.println("triangle area: " + triangle.getArea());
            System.out.println("triangle length: " + triangle.getLength());
            triangle.printPackageName();

            triangle.doubleSize();
            System.out.println("triangle double area: " + triangle.getArea());

            triangle.customSize(2);
            System.out.println("triangle custom area: " + triangle.getArea());

            System.out.println(triangle.validateFigure());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
