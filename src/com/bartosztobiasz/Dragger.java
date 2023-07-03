package com.bartosztobiasz;

public class Dragger {
    public void drag(Draggable draggable) {
        /*
        Draggable vs. UIWidget
        Draggable interface is simple. It has only required methods.
         */
        draggable.drag();
        System.out.println("Dragging done!");
    }
}
