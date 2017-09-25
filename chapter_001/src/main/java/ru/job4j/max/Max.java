/**
 *@Holy Shit
 */
package ru.job4j.max;
/**
 *@author evgen
 */
public class Max {
    /**
     *
     * @param a = 1
     * @param c = 2
     * @return = вывод максимального значения которое должно провериться по тесту
     */
    public int max(int a, int c) {
        /**
         * Я так и не понял за требование к тернарному условию потому сделл тоже самое но через Math.
         */
       int maximum = Math.max(a, c);
            return maximum;
    }
}