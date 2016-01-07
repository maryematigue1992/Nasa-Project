/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universe.command;

import universe.rover.IRover;

/**
 *
 * @author atig
 */
public class TurnLeft implements ICommand {

    public void execute(IRover rover) {
        rover.turnLeft();
    }
}
