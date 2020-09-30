package com.example.tdd.b_runTest_usingRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class B_MyTestRunner {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(B_MyTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}