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
public interface IRoverHeading {

    public void setState(char heading);
    public IStateHeader getState();
    public void turnLeft();
    public void turnRight();
    public IPosition move(IPosition position);
}


