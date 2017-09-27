package ru.job4j.condition;

/**
 *
 */

public class Point {
    /**
     *
     */
    private int x;
    /**
     *
     */
    private int y;

    /**
     *
     * @param x = 0 test
     * @param y = 1 test
     */
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return = func form, left side must be equal right side
     */

    public int getX() {
        return this.x;
    }

    /**
     *
     * @return = y
     */
    public int getY() {
        return this.y;
    }

    /**
     *
     * @param a = a
     * @param b = b
     * @return = func
     */
    public boolean is(int a, int b) {
        return y == a * x + b;
    }
}
