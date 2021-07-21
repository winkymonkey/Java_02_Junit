package org.example.tdd.a_runTest_asRightClick;

import org.junit.Assert;
import org.junit.Test;


public class A_MyTest2 {
	
	@Test
	public void myMethod() {
		String str = "Junit is working fine";
		int num = 5;
		String temp = null;
		Object obj1 = new Object();
		Object obj2 = obj1;
		Object obj3 = new Object();
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};

		Assert.assertEquals("Junit is working fine", str);
		Assert.assertFalse(num > 6);
		Assert.assertTrue(num < 9);
		Assert.assertNotNull(str);
		Assert.assertNull(temp);
		Assert.assertSame(obj1, obj2);
		Assert.assertNotSame(obj1, obj3);
		Assert.assertArrayEquals(arr1, arr2);
	}
}


//Assert.fail("Not yet implemented");