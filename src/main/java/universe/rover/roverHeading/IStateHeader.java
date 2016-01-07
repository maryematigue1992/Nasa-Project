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
public interface  IStateHeader {
   
   abstract IStateHeader turnLeft();
   abstract IStateHeader turnRight();
   abstract IPosition move(IPosition position);
}
