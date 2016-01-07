/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universe.rover.roverHeading;

import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author atig
 */
public class TestRoverHeading extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestRoverHeading( String testName ){
        super( testName );
    }
    
    public void test_setState_StateIsNorth_North(){
        RoverHeading roverHeading=new RoverHeading('N');
        assertSame(new HeaderNorth().getClass(), roverHeading.getState().getClass());
    }
    
    public void test_turnLeft_StateIsNorthAndRoverHeadingTurnLeft_HeaderWest(){
        RoverHeading roverHeading=new RoverHeading('N');
        roverHeading.turnLeft();
        assertSame(new HeaderWest().getClass(), roverHeading.getState().getClass());
    }
    
    public void test_turnRight_StateIsNorthAndRoverHeadingturnRight_HeaderEast(){
        RoverHeading roverHeading=new RoverHeading('N');
        roverHeading.turnRight();
        assertSame(new HeaderEast().getClass(), roverHeading.getState().getClass());
    }
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestRoverHeading.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

    
