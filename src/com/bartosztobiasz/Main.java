package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var box1 = new TextBox();
//        var box2 = box1;
        var box2 = new TextBox();

        System.out.println(box1.hashCode()); // hashed code calculated based on the address of this object
        System.out.println(box2.hashCode());

        System.out.println(box1.equals(box2)); // by default: compares two objects by their hash codes

        // Returns a string representation of the object.
        // fully.qualified.name.of.the.class@hashCodeRepresentedAsHexodecimal
        System.out.println(box1.toString());

        // Changing the implementation of the equal()/toString() method -> method overriding.
    }
}
