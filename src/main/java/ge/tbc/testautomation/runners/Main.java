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

import ge.tbc.testautomation.figures.Triangle;



public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int height = 10;
        @SuppressWarnings("unused")
        double count = 5.2;
        @SuppressWarnings("unused")
        String model = "audi";



        Field[] fields = Analyzable.class.getDeclaredFields();

        List<String> match = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(VariableNameAnnotation.class))
                .filter(field -> {
                    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                    return field.getName().equalsIgnoreCase(annotation.name());
                })
                .map(Field::getName)
                .collect(Collectors.toList());

        System.out.println("matching: " + match);

        List<String> nonMatch = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(VariableNameAnnotation.class))
                .filter(field -> {
                    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                    return !field.getName().equalsIgnoreCase(annotation.name());
                })
                .map(Field::getName)
                .collect(Collectors.toList());

        System.out.println("non-matching: " + nonMatch);


    }
}
