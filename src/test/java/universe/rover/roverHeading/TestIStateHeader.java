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
public class TestIStateHeader extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestIStateHeader( String testName )
    {
        super( testName );
    }
    public void test_turnRight_HeaderNorthTurnRight_HeaderEast(){
        IStateHeader action;
        action = new HeaderNorth();
        IStateHeader newdirection = action.turnRight();
        assertSame(new HeaderEast().getClass(), newdirection.getClass());
    }
     
    public void test_turnLeft_HeaderNorthTurnLeft_HeaderWest(){
        IStateHeader action;
        action = new HeaderNorth();
        IStateHeader newdirection = action.turnLeft();
        assertSame(new HeaderWest().getClass(), newdirection.getClass());
    }
    
    public void test_turnLeft_HeaderSouthTurnLeft_HeaderEast(){
        IStateHeader action;
        action = new HeaderSouth();
        IStateHeader newdirection= action.turnLeft();
        assertSame(new HeaderEast().getClass(), newdirection.getClass());
    }
    
    public void test_turnRight_HeaderSouthTurnRight_HeaderWest(){
        IStateHeader action;
        action = new HeaderSouth();
        IStateHeader newdirection = action.turnRight();
        assertSame(new HeaderWest().getClass(), newdirection.getClass());
    }
     
    public void test_turnLeft_HeaderEastTurnLeft_HeaderNorth(){
        IStateHeader action;
        action = new HeaderEast();
        IStateHeader newdirection= action.turnLeft();
        assertSame(new HeaderNorth().getClass(), newdirection.getClass());
    }
    
    public void test_turnRight_HeaderEastTurnRight_HeaderSouth(){
        IStateHeader action;
        action = new HeaderEast();
        IStateHeader newdirection = action.turnRight();
        assertSame(new HeaderSouth().getClass(), newdirection.getClass());
    }  
    public void test_turnLeft_HeaderWestTurnLeft_HeaderSouth(){
        IStateHeader action;
        action = new HeaderWest();
        IStateHeader newdirection= action.turnLeft();
        assertSame(new HeaderSouth().getClass(), newdirection.getClass());
    }
    
    public void test_turnLeft_HeaderWestTurnRight_HeaderNorth(){
        IStateHeader action;
        action = new HeaderWest();
        IStateHeader newdirection = action.turnRight();
        assertSame(new HeaderNorth().getClass(), newdirection.getClass());
    }
     
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestIStateHeader.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

    

