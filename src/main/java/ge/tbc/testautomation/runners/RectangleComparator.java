package ge.tbc.testautomation.runners;
import ge.tbc.testautomation.figures.Rectangle;
import java.util.Comparator;

public class RectangleComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Rectangle r1 = (Rectangle) o1;
        Rectangle r2 = (Rectangle) o2;

        return Integer.compare((int) r2.getArea(), (int) r1.getArea());
    }

}
