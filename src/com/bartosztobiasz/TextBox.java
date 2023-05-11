package com.bartosztobiasz;

// access_modifier class PascalCase
public class TextBox {
    // fields:
    public String text;
//    public String text = ""; // initializing a field

    // methods:
    public void setText(String text) {
        // use 'this' keyword when the parameter name is the same as the field name
        this.text = text; // 'this' -> reference to the current object
    }

    public void clear() {
        text = "";
    }
}
