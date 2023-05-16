package com.bartosztobiasz;

// public class UIControl extends Object
public abstract class UIControl {
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

    public abstract void render();
}
