package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        show(control);

        var textBox = new TextBox();
        show(textBox); // upcasting
    }

    public static void show(UIControl control) {
        /*
        at compile time we can only work with the members (methods, fields) of the UIControl class unless...
        explicit casting
         */

        /*
        every TextBox is a UIControl

        not every UIControl is a TextBox:
        (TextBox) UIControl
        (TextBox) Button
        (TextBox) List
        ...
         */

        // ClassCastException -> casting generic type to a more specialized type
        if (control instanceof TextBox) {
            var textBox = (TextBox) control; // (TextBox) TextBox
            textBox.setText("Hello World");
        }

        System.out.println(control);
    }
}
