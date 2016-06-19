package br.com.cafecomjava.HellTriangle;

import br.com.cafecomjava.HellPyramid.App;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	int [][] pyramid = {{6},{3,5},{9,7,1},{4,6,8,4}};
		App app = new App();
        assertTrue( app.hellPyramid(pyramid) == 26 );
    }
}
