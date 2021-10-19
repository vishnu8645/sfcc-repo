package com.sapient.trg.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void testIsPerfectNumberForSuccess() {
		assertTrue(MyMath.isPerfectNumber(6));
	}
	
	@Test
	void testIsPerfectNumberForFailure() {
		assertFalse(MyMath.isPerfectNumber(5));
	}
	
	
	@Test
	void testFactorialForSuccess() {
		assertEquals(1,MyMath.factorial(0));
	}
	
	@Test
	void testFactorialForFailure() {
		assertNotEquals(0,MyMath.factorial(0));
	}

}
