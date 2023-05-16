package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        show(control);

        var textBox = new TextBox();
        show(textBox); // upcasting; textBox object gets automatically cast to UIControl object
    }

    public static void show(UIControl control) {
        System.out.println(control);
    }
}
