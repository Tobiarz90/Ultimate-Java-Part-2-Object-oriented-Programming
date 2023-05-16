package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {
                new TextBox(),
                new CheckBox()
                // new UIControl() => NO! UIControl is an abstract concept - it cannot be rendered
        };
        for (UIControl control : controls) {
            /*
            procedural way:
            if control is a TextBox
               renderTextBox()
            if control is a CheckBox
               renderCheckBox()
             */

            // control is taking many forms => polymorphism
            control.render();
        }
    }
}
