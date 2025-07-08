package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.figures.Circle;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;
import ge.tbc.testautomation.util.HelperFunctions;

public class Main {
    public static void main(String[] args) {
        //დავალება - Java Exceptions, String Operations & Regex
        try {
            Circle circle = new Circle(-1);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 1; i <= 8; i++) {
                new Circle(i);
            }
        } catch (LimitException e) {
            System.out.println(e.getMessage());
        }

        //String Operations
        String sentence = "Test Automation Bootcamp 12, 2025";
        int index = sentence.indexOf("Automation");
        int size = index + "Automation".length();
        String formattedString = sentence.substring(index, size).toLowerCase();
        System.out.println(formattedString);

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            String noComma = w.replace(",", "");
            System.out.println(noComma);
        }

        String replaced = sentence.replace(" ", "-");
        System.out.println(replaced);


        //Regex
        String[] phoneNumbers = {
                "599-51-13-23",
                "555123456233",
                "592-12-43-56",
                "5950444123221",
                "1234123456789",
                "599-12-34-51",
                "555-12-34-56"
        };

        for (int i = 0; i < phoneNumbers.length; i++) {
            String phone = phoneNumbers[i];
            boolean isValid = phoneNumberValidation(phone);
            if(isValid){
                System.out.println(phone + " is valid");
            } else {
                System.out.println(phone + " is not valid");
            }
        }


    }
    private static boolean phoneNumberValidation(String phoneNumber) {
        String regex = "^(555|595|592|599)\\d{6}$";
        String noDash = phoneNumber.replace("-", "");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(noDash);
        return matcher.matches();
    }
}


        /*Rectangle rectangle1 = new Rectangle(10, 23);
        Rectangle rectangle2 = new Rectangle(15, 25);
        Triangle triangle = new Triangle(7, 5, 8, 6);

        HelperFunctions.compareRectangles(rectangle1, rectangle2);
        System.out.println("Rectangle1 area: " + rectangle1.getArea());
        System.out.println("Rectangle1 perimeter: " + rectangle1.getPerimeter());

        System.out.println("Rectangle2 area: " + rectangle2.getArea());
        System.out.println("Rectangle2 perimeter: " + rectangle2.getPerimeter());

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());*/