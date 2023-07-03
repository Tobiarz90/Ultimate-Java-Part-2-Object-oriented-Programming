package com.bartosztobiasz;

public class Dragger {
    public void drag(
            UIWidget widget // coupling
    ) {
        widget.drag();
        System.out.println("Dragging done!");
    }
}
