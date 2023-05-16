package com.bartosztobiasz;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // comparing an object with itself => optimization technique
        if (this == obj) // comparing objects by their references (addresses in the memory)
            return true;

        if (!(obj instanceof Point))
            return false;

        var other = (Point) obj; // downcasting
        return other.x == x && other.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y); // Generating a hash code based on the values.
    }
}
