

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

public class StringCalculatorTest {

    @Test
	public void sumsEmptyStringTo0() {
		assertThat(StringCalculator.sum(""), is(0));
	}

	@Test
	public void sumsSingleNumberToItself() {
		assertThat(StringCalculator.sum("5"), is(5));
		assertThat(StringCalculator.sum("42"), is(42));
	}

    @Test
	public void sumsTwoNumbersSeperatedByComma() {
		assertThat(StringCalculator.sum("1,2"), is(3));
		assertThat(StringCalculator.sum("1,3"), is(4));
	}

	@Test
	public void sumsThreeNumbersSeperatedByComma() {
		assertThat(StringCalculator.sum("1,2,3"), is(6));
	}
	
}