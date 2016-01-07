/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universe.rover.roverHeading;

import universe.rover.position.IPosition;
/**
 *
 * @author atig
 */
public class HeaderSouth implements IStateHeader {
    
    public IStateHeader turnLeft() {
        return new HeaderEast();
    }

    public IStateHeader turnRight() {
        return new HeaderWest();
    }
    
    public IPosition move(IPosition  position){
        if(position.getY()>0)
            position.decrementY();
        return position;
    }
}
