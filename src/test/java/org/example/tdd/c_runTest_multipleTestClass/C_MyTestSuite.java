package org.example.tdd.c_runTest_multipleTestClass;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({ C_MyTest1.class, C_MyTest2.class })
public class C_MyTestSuite {
	
}
