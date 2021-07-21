package org.example.tdd.a_runTest_asRightClick;

import org.junit.Test;


public class A_MyTest4_timeout {
	
	@Test(timeout = 1000)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
	}
}
