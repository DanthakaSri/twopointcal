package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class mainTest {

	Calculator app = new Calculator();
	

	@Test
	public void testCalculateDistance() {
		Object resultDistance=5.66;
		assertEquals(resultDistance, app.calculateDistance(8, 9, 4, 5));
	}

	@Test
	public void testCalculateEquation() {
		Object resultEquation="4.0x +-4.0y =-4.0";
		assertEquals(resultEquation, app.calculateEquation(8, 9, 4, 5));
	}

	@Test
	public void testCalculateGradient() {
		Object resultGradient=1.0;
		assertEquals(resultGradient, app.calculateGradient(8, 9, 4, 5));
	}

}
