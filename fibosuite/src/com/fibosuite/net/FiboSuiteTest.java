package com.fibosuite.net;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FiboSuiteTest {

	@Test
	void test() {
		Fibonacci test = new Fibonacci();
		int output = test.fiboSuite(20);
		assertEquals(6765, output); 
	}

}
