package de.fh_zwickau.oose.zuul;

import javax.swing.*;
import java.io.Serializable;

/**
 * Implementation of the 'help' user command.
 * 
 * @author Michael Kolling
 * @version 1.0 (December 2002)
 */
public class NullCommand extends Command implements Serializable {
    
    /**
     * Constructor for objects of class HelpCommand
     */
    public NullCommand()    {

    }
    
    /**
     * Print out an error message
     * @param player - out player
     * @param textArea - console
     * @return false
     */
    public boolean execute(Player player, JTextArea textArea){
    	textArea.setText("I don't understand...(Type \"help\" for help.)");
        return false;
    }

    @Override
    public String help() {

        return "There is no command";
    }
}
