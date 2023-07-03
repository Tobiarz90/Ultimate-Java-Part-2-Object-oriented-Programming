package com.bartosztobiasz;

public interface UIWidget
        extends Draggable, Resizable // multiple parents
{
    void render();
}
