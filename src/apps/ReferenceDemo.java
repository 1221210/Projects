//package apps;
//import java.util.ArrayList; // import this whenever using arraylist
//
//public class ReferenceDemo {
//    public static void main(String[] args) {
//        Circle c1 = new Circle(10);
//        Circle c2 = new Circle(10);
//        Circle c3 = c2; // c3 points to c2
//        c2.setRadius(99);
//
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//        ArrayList<Circle> circles = new ArrayList<Circle>(); // makes new empty ArrayList
//        circles.add(c1); circles.add(c2); circles.add(c3); // adds all circles to arraylist
//        ArrayList<Circle> circles2 = (ArrayList<Circle>)circles.clone(); // cast arraylist to circles.clone / says circles2 is equal to a shallow copy of circles so a change to the copy is a change to circles 2
//
//        circles.add(new Circle(55));
//        System.out.println(circles);
//        System.out.println(circles2);
//
//        // Careful when comparing
//
//        System.out.println(c1 == c2); // addresses are not the same for both // output: false
//        System.out.println(c1.equals(c2)); // compares radius of both c1 and c2 // output = true
//        System.out.println(c2 == c3); // c3 points to c3 addresses so they are the same. // true
//
//        // String is immutable
//        // the following example shows
//        String s1 = "Hello";
//        s1 = s1 + "World";
//
//
//    }
//}
