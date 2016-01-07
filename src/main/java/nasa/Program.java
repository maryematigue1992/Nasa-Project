/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nasa;

import universe.rover.Rover;
import universe.rover.position.Position;

/**
 *
 * @author atig
 */
public class Program {
    
    public static void main (   String args[]){
        Position.setLimits(5, 5);
        
        Position position=new Position(1,2);
        Rover rover =new Rover(position,'N');
        
        Position position2=new Position(3,3);
        Rover rover2 =new Rover(position2,'E');
        
        NasaPreparation.init();
        NasaPreparation.prepareRover(rover,"LMLMLMLMM");
        NasaPreparation.prepareRover(rover2,"MMRMMRMRRM");
        
        System.out.println(NasaPreparation.roversState());        
        System.out.println("*************************");
        
        NasaPreparation.enter();
        
        System.out.println(NasaPreparation.roversState());        
    }
}
