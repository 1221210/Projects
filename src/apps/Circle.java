//package apps;
//
//public class Circle implements Comparable<Circle>{
//    private double radius;
//    public Circle(double r) {
//        radius = r;
//    }
//    public double getRadius() {return radius;}
//    public void setRadius(double radius); // figure out what he did in zoom so there is no more errors
//    public double getArea() { return Math.PI * radius * radius;}
//    public double getPerimeter() { return 2 * Math.PI * radius;}
//    public String toString(){return "Circle(" + radius +")";}
//    public boolean equals (Object obj){
//        // radius vs obj.radius
//        return radius == ((Circle) obj).radius;
//
//    }
//    public int compareTo(Circle c2){
//        // radius vs c2.radius
//        return (int) (radius - c2.radius); // incorrect
//    }
//
//
//    public static void main(String[] args) {
//        Circle c1 = new Circle(10);
//        Circle c2 = new Circle(10);
//        System.out.println(c1);
//        System.out.println(c1.equals(c2));
//
////        System.out.println(c1.getRadius());
////        System.out.println(c1.getArea());
////        System.out.println(c1.getPerimeter());
//
//
//    }
//}