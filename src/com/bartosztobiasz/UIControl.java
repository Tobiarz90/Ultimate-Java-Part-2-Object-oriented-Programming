package com.bartosztobiasz;

// public class UIControl extends Object
public class UIControl {
    private boolean isEnabled = true;

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
