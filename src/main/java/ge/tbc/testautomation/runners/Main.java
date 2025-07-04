package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;
import ge.tbc.testautomation.util.HelperFunctions;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 23);
        Rectangle rectangle2 = new Rectangle(15, 25);
        Triangle triangle = new Triangle(7, 5, 8, 6);

        HelperFunctions.compareRectangles(rectangle1, rectangle2);
        System.out.println("Rectangle1 area: " + rectangle1.getArea());
        System.out.println("Rectangle1 perimeter: " + rectangle1.getPerimeter());

        System.out.println("Rectangle2 area: " + rectangle2.getArea());
        System.out.println("Rectangle2 perimeter: " + rectangle2.getPerimeter());

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
    }
}
