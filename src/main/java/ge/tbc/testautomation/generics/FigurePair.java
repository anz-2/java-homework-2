package ge.tbc.testautomation.generics;

import ge.tbc.testautomation.figures.Figures;

public class FigurePair<E extends Figures, T extends Figures> {
    private E elementOne;
    private T elementTwo;

    public FigurePair(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public E getElementOne() {
        return elementOne;
    }

    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }

    public T getElementTwo() {
        return elementTwo;
    }

    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }

    @Override
    public String toString() {
        return "\nFigurePair{" +
                "elementOne=" + elementOne +
                ", elementTwo=" + elementTwo +
                '}';
    }
}
