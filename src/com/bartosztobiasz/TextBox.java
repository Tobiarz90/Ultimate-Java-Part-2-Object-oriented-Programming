package com.bartosztobiasz;

public class TextBox extends UIControl {
    private String text = "";

    @Override
    public void render() {
        System.out.println("Render TextBox");
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
