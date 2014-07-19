import static org.junit.Assert.*;

import org.junit.Test;

import CalculatorSum.CalculatorSum;
public class TestSum {

	@Test
	public void testCase1() {
		CalculatorSum calculatorSum = new CalculatorSum();
		assertEquals("5", calculatorSum.result(2, 3));
        // TODO: Remove this later
	}

}
