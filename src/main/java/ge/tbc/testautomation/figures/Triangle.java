package ge.tbc.testautomation.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Triangle extends Figures implements IResizable, IValidFigure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;

        if (!validateFigure()) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
    }

    @Override
    public boolean validateFigure() {
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public double getArea() {
        return c*h/2;
    }

    @Override
    public double getLength() {
        return a + b + c;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }

    @Override
    public void doubleSize() {
        a *= 2;
        b *= 2;
        c *= 2;
    }

    @Override
    public void customSize(double byValue) {
        a *= byValue;
        b *= byValue;
        c *= byValue;
    }
}
