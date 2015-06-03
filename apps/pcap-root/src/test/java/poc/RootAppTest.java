package poc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class RootAppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RootAppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RootAppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	RootApp app = new RootApp();
        System.out.println(app.start());
    }
}
