/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universe.rover;

import universe.rover.position.IPosition;
import universe.rover.roverHeading.IRoverHeading;

/**
 *
 * @author atig
 */
public interface IRover {
    public void turnLeft();
    public void turnRight();
    public void move();
    public IPosition getPosition();
    public IRoverHeading getRoverHeading();
    public char getState();
}
