package com.bartosztobiasz;

// public class UIControl extends Object
public class UIControl {
    private boolean isEnabled = true;

    // call this constructor explicitly inside the subclass
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
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
