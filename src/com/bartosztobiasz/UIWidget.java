package com.bartosztobiasz;

/*
Classes coupled to this interface need to be recompiled
when changing/adding parameters of methods of this interface.
 */
public interface UIWidget {
    void drag(); // single capability

    void resize(); // single capability

    void render(); // single capability
}
