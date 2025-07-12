package ge.tbc.testautomation.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Circle extends Figures implements IResizable, IValidFigure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (!validateFigure()) {
            throw new IllegalArgumentException("Invalid radius");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }

    @Override
    public void doubleSize() {
        this.radius *= 2;
    }

    @Override
    public void customSize(double byValue) {
        this.radius *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return radius > 0;
    }
}
