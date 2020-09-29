package com.example.tdd.a_runTest_asRightClick;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class A_MyTest3_annotations {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("execute before class");
	}

	@Before
	public void before() {
		System.out.println("execute before test");
	}
	
	@Test
	public void test() {
		System.out.println("test case");
	}
	
	@After
	public void after() {
		System.out.println("execute after test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("execute after class");
	}

	@Ignore
	public void ignoreTest() {
		System.out.println("test case ignore and will not execute");
	}
}
