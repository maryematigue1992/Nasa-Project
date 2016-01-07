/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universe.rover;

import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import universe.rover.position.Position;

/**
 *
 * @author atig
 */
public class TestRover extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestRover( String testName ){
        super( testName );
    }
    
    public void test_getState_StateIsNorth_N(){
        Position.setLimits(5, 5);
        Position position=new Position(1,2);
        Rover rover =new Rover(position,'N');
        assertSame('N', rover.getState());
     }
     
    public void test_getState_StateIsNorthAndRoverTurnLeft_Is_West(){
        Position.setLimits(5, 5);
        Position position=new Position(1,2);
        Rover rover =new Rover(position,'N');
        rover.turnLeft();
        assertSame('W',rover.getState());
    }
    public void test_move_StateIsNorthandRoverMove_CoordinatesXeq0Yeq1(){
        Position.setLimits(5, 5);
        Position position=new Position(0,0);
        Rover rover =new Rover(position,'N');
        rover.move();
        assertSame(rover.position.getX(),0);
        assertSame(rover.position.getY(),1);
    }
    
    public void test_move_StateIsNorthandRoverTurnRightThenMove_CoordinatesXeq0Yeq1(){
        Position.setLimits(5, 5);
        Position position=new Position(0,0);
        Rover rover =new Rover(position,'N');
        rover.turnRight();
        rover.move();
        assertSame(rover.position.getX(), 1);
        assertSame(rover.position.getY(),0);            
    }
    
    public void test_getY_StateIsSouthandRoverMove10Times_Yeq0(){
        Position.setLimits(5,5);
        Position position=new Position(0,0);
        Rover rover =new Rover(position,'S');
        for(int i=0 ; i<10;i++){
            rover.move();
        }
        assertSame(rover.position.getY(),0);  
    }
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestRover.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

    

