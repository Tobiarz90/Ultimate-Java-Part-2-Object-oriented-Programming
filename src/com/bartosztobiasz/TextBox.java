package com.bartosztobiasz;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        // explicit call of a base class constructor
        super(true); // (!) the first line of the constructor body
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    /*
    annotation -> a label
    that we attach to a class member
    which passes extra information to the Java compiler
     */
    @Override // a method declared in Object class
    public String toString() {
        return text;
    }
}
