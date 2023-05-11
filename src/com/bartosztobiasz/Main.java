package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
//        TextBox textBox1 = new TextBox(); // class instantiating
        var textBox1 = new TextBox();

        System.out.println(textBox1.text); // not instantiated reference types return 'null'
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Box 2"); // objects are independent of each other
        System.out.println(textBox2.text);
    }
}
