/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Assert;

public class LibraryTest2 {/*
    @Test public void testSomeLibraryMethod() {
    	
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
        
        int a=2;
        int b=3;
        boolean result  = (a + b)  == 4;
        Assert.assertEquals( 4, a+b );
        
        
    }*/
	Library lib;
    @BeforeClass 	public static void beforeClass() {
    	System.out.println("Test Before Class");
	} 

    @AfterClass 	public static void afterClass() {
    	System.out.println("Test AfterClass");
	} 
    
    
	@Before	  public void testBefore() {
    	System.out.println("Test Before");
    	lib = new Library();
	}
    
	
    @Test     public void testAdd() {
    	System.out.println("Test Add");
    	int max = Integer.MAX_VALUE;
    	Assert.assertEquals(max +1, lib.add(max,1));
    }
    @Test     public void testSubstract() {
    	System.out.println("Test Substract");
    	Assert.assertEquals(Integer.MAX_VALUE+Integer.MIN_VALUE, lib.substract(Integer.MAX_VALUE,Integer.MIN_VALUE));
    }
}
