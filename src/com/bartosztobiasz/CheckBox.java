package com.bartosztobiasz;

public final class CheckBox extends UIControl {
    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }

    // Final methods cannot be overridden.
//    @Override
//    public final void enable() { }
}

// Final classes cannot be extended.
//public class MyCheckBox extends CheckBox { }
