package sumDigits;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class SumDigitsTest {
	
	public SumDigitsTest() {
		
	}
	
	@BeforeClass
	public static void setUpClass() {
    }
	
	@AfterClass
	public static void tearDownClass() {
	}
	 
	@Before
	public void setUp() {
	}
	    
	 @After
	 public void tearDown() {
	 }
	  

      // Toma dos valores enteros como casos de prueba de entrada
       @Test
      public void testsumdigits2() {
            System.out.println ("Prueba 2 digitos");
            SumDigits s = new SumDigits();
            int res = 6;
     		int result = s.sum(15);
     		assertEquals(res, result);
       }
 
      // Toma un valor entero de tres dígitos como caso de prueba de entrada
       @Test
	 public void testsumdigits3() {
	     System.out.println ("Prueba 3 digitos");
	     SumDigits s = new SumDigits();
	     int res = 9;
	     int result = s.sum(333);
	     assertEquals(res, result);
	 }
	 
	       @Test
	 public void testsumdigits4() {
	     System.out.println ("Negativos=fail");
	     SumDigits s = new SumDigits();
	     int res = -2;
	     int result =s.sum(-20);
	     assertFalse(result==res);
	 }    


	@Test
	void test() {
		fail("Not yet implemented");
	}

}
