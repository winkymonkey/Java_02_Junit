package org.example.tdd.c_runTest_multipleTestClass;

import org.junit.Assert;
import org.junit.Test;


public class C_MyTest1 {
	
	@Test
	public void testAdd() {
		String str = "Junit is working fine";
		Assert.assertEquals("Junit is working fine", str);
	}
}
