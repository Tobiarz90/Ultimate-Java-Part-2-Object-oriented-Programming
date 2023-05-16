package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);

        System.out.println(point1 == point2); // comparing addresses
        System.out.println(point1.equals(point2)); // comparing based on references
    }
}
