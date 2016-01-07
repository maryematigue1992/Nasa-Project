/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universe.rover;

import universe.rover.position.IPosition;
import universe.rover.position.Position;
import universe.rover.roverHeading.IRoverHeading;
import universe.rover.roverHeading.RoverHeading;

/**
 *
 * @author atig
 */
public class Rover implements IRover {
    public IRoverHeading roverHeading;
    public IPosition position;
    
    public Rover(Position position, char heading) {

         this.position=new Position(position);
         roverHeading=new RoverHeading(heading);
     }

     public IRoverHeading getRoverHeading() {
         return roverHeading;
     }

     public void setRoverHeading(IRoverHeading roverHeading) {
         this.roverHeading = roverHeading;
     }

     public IPosition getPosition() {
         return position;
     }

     public void setPosition(IPosition position) {
         this.position = position;
     }

     public void turnLeft(){
         roverHeading.turnLeft();
     }
     
     public void turnRight(){
         roverHeading.turnRight();
     }
     
     public void move(){
         position=roverHeading.move(position);
     }
     
     public char getState(){
         String stateHeader=roverHeading.getState().getClass().getSimpleName();
         char firstChar=stateHeader.charAt(6);
         return firstChar;
     }
}