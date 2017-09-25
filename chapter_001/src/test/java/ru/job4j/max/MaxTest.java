/**
 *
 */
package ru.job4j.max;
/**
 *
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * сейчас я буду прописывать все импорты.
 */
public class MaxTest {
    /**
     *восславим летающего макаронного монстра и помолим его о рабочем коде.
     */
    @Test
    public void whenFirstLessSecond() {
        /**
         *
         */
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
}