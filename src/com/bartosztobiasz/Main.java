package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();
        show(textBox); // upcasting; textBox object gets automatically cast to UIControl object
    }

    public static void show(UIControl control) {
        /*
        at compile time we can only work with the members (methods, fields) of the UIControl class unless...
        explicit casting
         */
        var textBox = (TextBox) control; // downcasting

        textBox.setText("Hello World");
        System.out.println(control);
    }
}
