/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universe.rover.position;

import static junit.framework.Assert.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author atig
 */
public class TestPosition extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestPosition( String testName )
    {
        super( testName );
    }
    public void test_PositionInitiation(){
        Position.setLimits(5, 5);
        Position position = new Position(0,0);
        assertEquals(0,position.getX());
        assertEquals(0,position.getY());
        assertEquals(5,Position.getLimitX());
        assertEquals(5,Position.getLimitY());
    }
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestPosition.class );
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}