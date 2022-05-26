import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private int a, b, c;
	Calculator cal = new Calculator();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
		a = 4321;
		b = 1234;
		c = 0;
		}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual); 
	}
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	public void testsum() {
		int n1 = 10;
		int n2 = 20;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(n1, n2);
		
		int expected = 200;
		assertEquals(actual, expected);			
		}
	public void testdivide() {
		int n1 = 9;
		int n2 = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(n1, n2);
		
		int expected = 3;
		assertEquals(actual, expected);
	}
	}

