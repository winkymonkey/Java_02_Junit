package org.example.tdd.b_runTest_usingRunner;

import org.junit.Assert;
import org.junit.Test;


public class B_MyTest {
	
	@Test
	public void testAdd() {
		String str = "Junit is working fine";
		Assert.assertEquals("Junit is working fine", str);
	}
}