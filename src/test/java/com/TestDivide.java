package com;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jenkin.Hello;

public class TestDivide {

	@Test
	public void test() {
		Calc calc = new Calc();
		assertEquals(2, calc.Divide(10,5));
        // TODO: Remove this later
	}

}
