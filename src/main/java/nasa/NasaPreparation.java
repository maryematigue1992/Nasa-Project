package nasa;

import java.util.ArrayList;
import universe.command.CommandFactory;
import universe.rover.IRover;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atig
 */
public class NasaPreparation {
    static ArrayList<IRover> rovers;
    static ArrayList<String> commands;
    static CommandFactory cf;
    
    public static void init(){
        rovers=new ArrayList();
        commands=new ArrayList();
        cf=CommandFactory.init();
    }
    
    public static void prepareRover(IRover rover,String command){
        rovers.add(rover);
        commands.add(command);
    }
    
    public static void enter(){
        for(int i =0 ; i<rovers.size();i++){
            cf.executeCommands(commands.get(i), rovers.get(i));
        }
    }
    
    public static String roversState(){
        String state="";
        for(int i =0 ; i<rovers.size();i++){
            state+="X:";
            state+=rovers.get(i).getPosition().getX();
            state+="  ";
            state+="Y:";
            state+=rovers.get(i).getPosition().getY();
            state+="  ";
            state+="H:";
            state+=rovers.get(i).getState();
            state+="\n";
        }  
        return state;
    }
}
