package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.annotationsAndStreams.Analyzable;
import ge.tbc.testautomation.annotationsAndStreams.VariableNameAnnotation;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.figures.Circle;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;
import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;


public class Main {
    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] fieldsOne = objOne.getClass().getDeclaredFields();
        Field[] fieldsTwo = objTwo.getClass().getDeclaredFields();
        return new AnyPair<>(fieldsOne, fieldsTwo);
    }

    public static void main(String[] args) {
        AnyPair<Field[], Field[]> fields = getDeclaredFields(5, "hello");
        System.out.println("Integer fields:");
        Arrays.asList(fields.getElementOne()).forEach(field -> System.out.println(field.getName()));
        System.out.println("String fields:");
        Arrays.asList(fields.getElementTwo()).forEach(field -> System.out.println(field.getName()));

        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(5, 10);
        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle, rectangle);

        System.out.println(figurePair);
    }
}
