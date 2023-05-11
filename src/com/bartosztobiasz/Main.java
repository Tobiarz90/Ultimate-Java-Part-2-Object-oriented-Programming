package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox(); // textBox1 references an object on the HEAP
        /*
        Java memory allocation process:
        1. Evaluate 'new TextBox()' -> create new object and store it on the HEAP
        2. Execute 'var textBox1' -> allocate memory on the STACK and store object's address in it
         */

        var textBox2 = textBox1; // 2x variables on the STACK and 1x object on the HEAP

        // both variables are referencing the same object
        textBox1.setText("Hello World");
        System.out.println(textBox2.text);

        /*
        Java memory deallocation process:
        1. Remove variables from the STACK
        2. Garbage Collector:  (if there are no references to the object) Remove object from the HEAP
         */
    }
}
