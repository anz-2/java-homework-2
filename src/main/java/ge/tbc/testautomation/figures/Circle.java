package ge.tbc.testautomation.figures;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Circle extends Figures {
    private double radius;

    public Circle(double radius){
        super();
        if(numberOfInstances > 5){
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        } else if (radius <=0) {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
