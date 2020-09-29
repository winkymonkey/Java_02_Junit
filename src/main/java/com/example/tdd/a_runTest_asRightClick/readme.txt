---------------------------------------------------------------------------------
Execution order is
	Method annotated with @BeforeClass
	
	Method annotated with @Before
	Method annotated with @Test
	Method annotated with @After
	
	Method annotated with @Before
	Method annotated with @Test
	Method annotated with @After
	
	Method annotated with @AfterClass
---------------------------------------------------------------------------------

If a method is declared as @Ignore
	==> It is ignored during JUnit execution.

---------------------------------------------------------------------------------

If a method is declared as @Test(timeout = 1000)
	==> It is considered as FAILED if execution is not completed within 1000ms

---------------------------------------------------------------------------------

If a method is declared as @Test(expected = ArithmeticException.class)
	==> JUnit will expect an ArithmeticException during execution

---------------------------------------------------------------------------------


