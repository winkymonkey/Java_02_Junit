package org.example.tdd.d_runTest_multipleTimeDifferentParameter;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class MyMathTest {
	private int num1;
	private int num2;
	private int expResult;
	private MyMath myMath;
	
	public MyMathTest(int num1, int num2, int expResult) {
		this.num1 = num1;
		this.num2 = num2;
		this.expResult = expResult;
	}
	
	@Before
	public void init() {
		myMath = new MyMath();
	}
	
	@Parameterized.Parameters
	public static List<Integer[]> input() {
		Integer[] arr1 = {1, 2, 3};
		Integer[] arr2 = {11, 22, 33};
		Integer[] arr3 = {111, 222, 333};
		Integer[] arr4 = {1111, 2222, 3333};
		
		List<Integer[]> list = new ArrayList<Integer[]>();
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		list.add(arr4);
		return list;
	}
	
	@Test
	public void test() {
		assertEquals(expResult, myMath.sum(num1, num2));
	}
}
