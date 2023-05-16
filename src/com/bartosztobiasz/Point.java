package com.bartosztobiasz;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            var other = (Point) obj; // downcasting
            return other.x == x && other.y == y;
        }

        return false;
    }
}
