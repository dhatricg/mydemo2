package testMaven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.cg.Calculator;
import com.cg.ICalculator;

public class CalculatorTest {
	private static ICalculator calculator;
	
	@Test // This is a test case
    public void testSum() {
        int result = calculator.sum(3, 4);
        assertEquals(7, result);
    }
	@Test
	public void testSub() {
        int result = calculator.sub(3, 4);
        assertEquals(-1, result);
    }
	
	@Test
	public void testMultiply() {
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }
	
	//@Disabled
	@Test
	public void testDivision() throws Exception {
        double result = calculator.division(3, 4);
        assertEquals(0.75, result);
    }
	
	@Test
	public void testEqualInteger() throws Exception {
        boolean result = calculator.equalInteger(3, 0);
        assertEquals(false, result);
    }
	
	@BeforeAll
    public static void initCalculator() {
        calculator = new Calculator();
        System.out.println(" Hello ! Before All Tests");

}
	 @BeforeEach 
	    public void beforeEachTest() {
	        System.out.println("This is executed before each Test");
	    }
	 
	 public void testDivisionException() {
		 Exception exception = assertThrows(Exception.class, () -> {
			 calculator.division(10, 0);
		 });
	 }
	
}