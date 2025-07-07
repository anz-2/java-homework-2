package ge.tbc.testautomation.figures;

public class Rectangle extends Figures {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea(){
        return a*b;
    }


    @Override
    public double getPerimeter(){
        return 2*(a+b);
    }
}
