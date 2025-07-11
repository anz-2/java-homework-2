package ge.tbc.testautomation.figures;

import java.util.Comparator;

public class Rectangle {
    private double area;

    public Rectangle(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                '}';
    }

    public static Comparator<Rectangle> getReversedComparator() {
        return Comparator.comparing(Rectangle::getArea).reversed();
    }

}
