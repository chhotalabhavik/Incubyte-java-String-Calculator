

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
	
}