package org.example;

public class Main {
    public static void main(String[] args) {
        Point point1 =new Point(3,4);
        Point point2 =new Point(3,7);

        System.out.println(point1.distance());
        System.out.println(point2.distance(point1));
        System.out.println(point1.distance(5,6));
    }
}