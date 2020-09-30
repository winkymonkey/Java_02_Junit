package com.example.tdd.a_runTest_asRightClick;

import org.junit.Assert;
import org.junit.Test;


public class A_MyTest1 {
	
	@Test
	public void testAdd() {
		String str = "Junit is working fine";
		Assert.assertEquals("Junit is working fine", str);
	}
}