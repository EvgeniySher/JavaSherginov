/**
 * тест к калькулятору.
 */

package ru.job4j.calculate;

/**
 *
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 */
public class CalculateTest {
	/**
	 * i dont know.
	 */
	@Test

	public void when9Multplic4ThanNumber36() {
		/**
		 * join to brother of steel
		 */
		Calculate calc = new Calculate();
		int expect = 36;
		int result = calc.cal(9, 4);
		assertThat(result, is(expect));
}
}