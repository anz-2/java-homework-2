package ge.tbc.testautomation.figures;

public class Rectangle extends Figures{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }

    @Override
    public double getLength() {
        return (width + height)*2;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }

    @Override
    public String toString() {
        return "Rectangle Area = " + getArea();
    }
}
