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
public class HeaderNorth implements IStateHeader {

    public IStateHeader turnLeft() {
        return new HeaderWest();
    }

    public IStateHeader turnRight() {
        return new HeaderEast();
    }
    
    public IPosition move(IPosition  position){
        if(position.getY()<Position.getLimitX())
            position.incrementY();
        return position;
    }
}
