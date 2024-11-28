
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.BankAcount;
 
 
public class BankAccountTest {
	BankAcount acc ;
	@BeforeEach
    public void initBankAccount() {
        acc = new BankAcount ();
        System.out.println(" Hello ! Before All Tests");
    }
	@Test
	public void testDeposit() {
		acc.deposit(100);
		assertEquals(100, acc.getBalance(), "balance should be 100");
	}
	
	@Test
	public void testInitialBalnace() {
			assertEquals(0.0, acc.getBalance());
		
	}
	@Test
	public void testWithdraw() {
		acc.deposit(200);
		acc.withdraw(100);
		assertEquals(100, acc.getBalance());
		
	}
	@Test
	public void testWithdrawMoreThanBalance() {
	    acc.deposit(100);
	    Exception exception = assertThrows(
	        Exception.class, 
	        () -> acc.withdraw(150) );
	    assertEquals("insufficient funds", exception.getMessage());
	}
	
	@Test
    public void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            acc.deposit(-10.0);
        });
        assertEquals("deposit should be positive", exception.getMessage());
    }
	
}
