package ru.job4j.calculate;
/**
 * My <b>class</b>.
 * @author evgen or GuyFromValue114
 */
public class Calculator {
    /**
     *
     */
    private double result;

    /**
     *
     * @param first the 1
     * @param second the 1
     */
    public void plus(double first, double second) {
        this.result = first + second;
    }

    /**
     *
     * @param first the 10
     * @param second the 5
     */
    public void minus(double first, double second) {
       this.result = first - second;
   }
    /**
     *
     * @param first the 10
     * @param second the 8
     */
    public void multiply(double first, double second) {
        this.result = first * second;
    }
    /**
     *
     * @param first the 6
     * @param second the 6
     */
    public void divide(double first, double second) {
        this.result = first / second;
    }
    /**
     *
     * @return the equal
     */
    public double getResult() {
        return this.result;
    }
}
