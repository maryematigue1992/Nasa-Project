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
public class HeaderWest implements IStateHeader {

    public IStateHeader turnLeft() {
        return new HeaderSouth();
    }

    public IStateHeader turnRight() {
        return new HeaderNorth();
    }
    
    public IPosition move(IPosition  position){
       if(position.getX()>0){
        position.decrementX();
       }
        return position;
    }
}
