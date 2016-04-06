package simpleCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator(); //arrange
		calc.add(10,20); 
		assertEquals(30,calc.getResult());
	}

}
