package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();
        textBox.setText("Hello World");

        // println() method automatically calls the toString() method on any object
//        System.out.println(textBox.toString());
        System.out.println(textBox);
    }
}
