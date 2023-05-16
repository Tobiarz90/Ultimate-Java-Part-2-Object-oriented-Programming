package com.bartosztobiasz;

// public class UIControl extends Object
public class UIControl {
    private boolean isEnabled = true;

    // default contractor with no parameters
    public UIControl() {
        System.out.println("UIControl");
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    // getter
    public boolean isEnabled() {
        return isEnabled;
    }
}
