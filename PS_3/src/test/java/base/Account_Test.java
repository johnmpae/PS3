package base;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class Account_Test {
	
	static Account A;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		A = new Account();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		A = null;
	}
	
	@Test
	public void depositTest(){
		A.deposit(500.00);
		assertEquals(500.00, A.getBalance(), 0);
	}

	@Test
	public void withdrawTest() {
		A.deposit(500.00);
		assertEquals("$400 Expected, actual is $500",(long)A.getBalance(),(long)500.00);
        A.withdraw(900);
	}

}
