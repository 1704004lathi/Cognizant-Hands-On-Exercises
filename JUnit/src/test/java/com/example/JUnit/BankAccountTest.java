package com.example.JUnit;
	import static org.junit.jupiter.api.Assertions.assertEquals;
	import org.junit.jupiter.api.*;

	public class BankAccountTest {

	private BankAccount account;

	    @BeforeEach
	    public void setUp() {
	        account = new BankAccount(100.0);  // Starting balance is 100
	        System.out.println("Setup - BankAccount created with initial balance 100.0");
	    }

	    @AfterEach
	    public void tearDown() {
	        account = null;
	        System.out.println("Teardown - BankAccount instance cleared");
	    }

	    @Test
	    public void testDeposit_PositiveAmount() {
	        // Arrange
	        double depositAmount = 50.0;

	        // Act
	        account.deposit(depositAmount);

	        // Assert
	        assertEquals(150.0, account.getBalance(), 0.001);
	    }

	    @Test
	    public void testDeposit_ZeroAmount() {
	        // Arrange
	        double depositAmount = 0.0;

	        // Act
	        account.deposit(depositAmount);

	        // Assert
	        assertEquals(100.0, account.getBalance(), 0.001);
	    }


	}


