/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universe.rover.roverHeading;

import universe.rover.position.IPosition;
import universe.rover.position.Position;





/**
 *
 * @author atig
 */
public class RoverHeading implements IRoverHeading{
    IStateHeader header; 
    
    public RoverHeading(char c){
        setState(c);
    }

    public void setState(char heading ) {
        switch (heading) {
        case 'W':
            header = new HeaderWest();
            break;
            
        case 'S':
            header = new HeaderSouth();
            break;

        case 'N':
            header = new HeaderNorth();
            break;

        case 'E':
            header = new HeaderEast();
            break;
        }
    }

    public IStateHeader getState() {
        return header;
    }
    
    public void turnLeft(){
        header=header.turnLeft();
    }
    
    public void turnRight(){
        header=header.turnRight();
    }

    public IPosition move(IPosition position) {
       return header.move(position);
    }
}
