package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Circle;
import ge.tbc.testautomation.figures.Rectangle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.Collections;


public class ContainersAndComparing {
    public static void main(String[] args) {
        ArrayList<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("555-542-231");
        phoneNumbers.add("555-887-987");
        phoneNumbers.add("555-161-143");
        phoneNumbers.add("555-189-6667");

        Iterator<String> iterator = phoneNumbers.iterator();
        while(iterator.hasNext()) {
            String number = iterator.next();
            System.out.println(number);
        }

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("giorgi", "555-542-231");
        phoneBook.put("goga", "555-887-987");
        phoneBook.put("gocha", "555-161-143");
        phoneBook.put("gogi", "555-189-6667");

        for (String name : phoneBook.keySet()) {
            String number = phoneBook.get(name);
            if (number.contains("8")) {
                System.out.println(name);
            }
        }

        TreeSet<Circle> circles = new TreeSet<>();
        circles.add(new Circle(7));
        circles.add(new Circle(23));
        circles.add(new Circle(4));
        circles.add(new Circle(2));
        circles.add(new Circle(53));
        circles.add(new Circle(2));
        circles.add(new Circle(9));
        circles.add(new Circle(4));
        circles.add(new Circle(23));
        circles.add(new Circle(13));

        for (Circle c : circles) {
            System.out.println(c);
        }

        HashSet<Circle> hashSet = new HashSet<>();
        hashSet.addAll(circles);
        for (Circle c : hashSet) {
            System.out.println(c);
        }

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(12, 9));
        rectangles.add(new Rectangle(11, 15));
        rectangles.add(new Rectangle(9, 8));
        rectangles.add(new Rectangle(14, 7));
        Collections.sort(rectangles, new RectangleComparator());

        for (Rectangle r : rectangles) {
            System.out.println(r);
        }

    }
}
