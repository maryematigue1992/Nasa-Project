/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universe.command;

import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import universe.rover.Rover;
import universe.rover.position.Position;


/**
 *
 * @author atig
 */
public class TestCommandFactory extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestCommandFactory( String testName ){
        super( testName );
    }
    
    public void test_executeCommand_commandIsR_TurnLeft(){
        Position.setLimits(5, 5);
        Position position=new Position(1,2);
        Rover rover =new Rover(position,'N');
        CommandFactory cf=CommandFactory.init();
        cf.executeCommand('L',rover);
        assertSame('W',rover.getState());
    }
    
     public void test_executeCommands_RoverStateIsNorthandcommandIsRRL_roverStateIsSouth(){
        Position.setLimits(5, 5);
        Position position=new Position(1,2);
        Rover rover =new Rover(position,'N');
        CommandFactory cf=CommandFactory.init();
        cf.executeCommands("RRL",rover);
        assertSame('E',rover.getState());
    }
     
      public void test_executeCommand_commandIsM_Move(){
        CommandFactory cf=CommandFactory.init();
    }
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestCommandFactory.class );
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

    

