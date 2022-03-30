//package apps;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class MyArrayDemo {
//    public static void main(String[] args) {
//
//
//
//
//
//
////        MyArrayForDouble nums2 = new MyArrayForDouble();
////        nums2.add(3.14); nums2.add(5); nums2.printArray(); //printArray(2, 5): 3.14, 5.0
//
////        String s1 = new String ("Hello");
////        String s2 = new String ("Hi");
////        System.out.println(s1 == s2);
////        System.out.println(s1.equals(s2));
////        System.out.println(s1.compareTo(s2)); // compares char by char basis
////        System.out.println(s1.compareTo(s1)); // compares char by char basis
////        System.out.println("100".compareTo("99"));
//
////        MyArrayForString names = new MyArrayForString();
////        names.add("Tom"); names.add("ethan"); names.sort(); names.printArray();
//
////        MyArray<Integer> nums1 = new MyArray<Integer>();
////        nums1.add(20); nums1.add(10); nums1.printArray();
////
////        MyArray<Double> nums2 = new MyArray<Double>();
////        nums2.add(20.0); nums2.add(10.0); nums2.printArray();
////
////        MyArray<String> names = new MyArray<String>();
////        names.add("Tom"); names.add("ethan"); names.sort(); names.printArray();
//
////        MyArray2<Integer> nums1 = new MyArray2<>();
////        nums1.add(20); nums1.add(10); System.out.println(nums1); nums1.repeat(3); nums1.printArray();
////        MyArray<Circle> circles = new MyArray<Circle>();
////        Circle c1 = new Circle(5);
////        circles.add(new Circle(10.0));circles.add(c1); circles.printArray();
////        System.out.println(circles.search(new Circle(5)));
////        System.out.println(circles.search(c1)); //1
////        System.out.println(circles.min()); //1
//
//        ArrayList<Circle> circles = new ArrayList<>();
//        Circle c1 = new Circle(5);
//        circles.add(new Circle(10.0));circles.add(c1); System.out.println(circles);
//        System.out.println(circles.indexOf(new Circle(5))); //1
//        System.out.println(circles.indexOf(c1)); //1
//        Collections.sort(circles); System.out.println(circles);
//
////        MyArray2<Double> nums2 = new MyArray2<Double>();
////        nums2.add(20.0); nums2.add(10.0); System.out.println(nums2); nums2.printArray();
////
////        MyArray2<String> names = new MyArray2<>();
////        names.add("Tom"); names.add("Ethan"); System.out.println(names); names.printArray():
//
//
////        ArrayList<Integer> nums1 = new ArrayList<Integer>();
////
////        ArrayList<Double> nums2 = new ArrayList<Double>();
//
////        ArrayList<String> names = new ArrayList<>();
//
//
//
////        MyArrayForString names = new MyArrayForString();
////        names.add("Tom"); names,add("Ethan"); names.printArray();
//
//        //        MyArrayForInt nums1 = new MyArrayForInt(); // creates 1 instance of array with 5 spaces
////        nums1.printArray(); // prints with first num being valid values, second being capacity
////        nums1.add(10);
////        nums1.add(20);
////
//        // Test for add and print function
//        // nums1.add(10); nums1.add(20);nums1.add(30); nums1.add(40); nums1.add(50);
//
//
////        nums1.add(99);
////        nums1.printArray(); // should print array with new values added
////        nums1.add(155); nums1.printArray();
////        nums1.add(-30); nums1.printArray();
//        // the following is test cases for remove function
////        nums1.remove(20); /* should remove 20 */ nums1.printArray(); // printArray(7,10): 10,-30,-3,0,30,99,155 (-30 (deleted from range))
////        nums1.remove(10); nums1.printArray(); // printArray(6,10): 155,-30,-3,0,30,99
////        nums1.remove(99); nums1.printArray();// printArray(6,10): 155,-30,-3,0,30
////        nums1.remove(200); nums1.printArray();// printArray(6,10): 155,-30,-3,0,30
//        // test for min function
////        System.out.println(nums1.min()); // will print minimum value: theoretically -30
////        nums1.sort(); nums1.printArray(); // -30,-3,0,10,20,30,99.155
//
//    }
//}
