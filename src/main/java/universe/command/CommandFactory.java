/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universe.command;

import java.util.HashMap;
import universe.rover.IRover;

/**
 *
 * @author atig
 */
public class CommandFactory {
   private final HashMap<String,ICommand>commands;

    private CommandFactory() {
        commands = new HashMap();
    }

    public void addCommand(char name, ICommand command) {
        this.commands.put(String.valueOf(name), command);
    }

    public void executeCommand(char  name,IRover rover) {
        if ( this.commands.containsKey(String.valueOf(name)) ) {
                this.commands.get(String.valueOf(name)).execute(rover);
        }

    }

    public void executeCommands(String  command,IRover rover) {
        for(int i=0;i<command.length();i++){
            if ( this.commands.containsKey(String.valueOf(command.charAt(i))) ) {
                    this.commands.get(String.valueOf(command.charAt(i))).execute(rover);
            }
        }
    }
    
    public void listCommands() {
        // using stream (Java 8)
        System.out.println("Commands enabled :");
        System.out.println(commands.toString());
    }
    /* Factory pattern */
    public static CommandFactory init() {
        CommandFactory cf = new CommandFactory();
        cf.addCommand('L',new TurnLeft());
        cf.addCommand('R',new TurnRight());
        cf.addCommand('M',new Move());
        return cf;
    }
}
