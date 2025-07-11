package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Circle;
import ge.tbc.testautomation.figures.Rectangle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class ContainersAndComparing {
    public static void main(String[] args) {
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("555-542-231");
        phoneNumbers.add("555-887-987");
        phoneNumbers.add("555-161-143");
        phoneNumbers.add("555-189-6667");

        Iterator<String> iterator = phoneNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Map<String, String> numbers = new HashMap<>();
        numbers.put("giorgi", phoneNumbers.get(0));
        numbers.put("gocha", phoneNumbers.get(1));
        numbers.put("gurami", phoneNumbers.get(2));
        numbers.put("goga", phoneNumbers.get(3));


        for (Map.Entry<String, String> entry : numbers.entrySet()) {
            if (entry.getValue().contains("8")) {
                System.out.println(entry.getKey());
            }
        }

       Set<Circle> treeSet = new TreeSet<>();
       treeSet.add(new Circle(23));
       treeSet.add(new Circle(103));
       treeSet.add(new Circle(15));
       treeSet.add(new Circle(26));
       treeSet.add(new Circle(27));
       treeSet.add(new Circle(23));
       treeSet.add(new Circle(23));
       treeSet.add(new Circle(26));
       treeSet.add(new Circle(45));
       treeSet.add(new Circle(33));

       for (Circle circle : treeSet) {
           System.out.println(circle);
       }


        Set<Circle> hashSet = new HashSet<>(treeSet);
       for (Circle circle : hashSet) {
           System.out.println(circle);
       }


        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2));
        rectangles.add(new Rectangle(7));
        rectangles.add(new Rectangle(6));
        rectangles.add(new Rectangle(14));
        rectangles.add(new Rectangle(3));

        rectangles.sort(Rectangle.getReversedComparator());

        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }
    }
}
