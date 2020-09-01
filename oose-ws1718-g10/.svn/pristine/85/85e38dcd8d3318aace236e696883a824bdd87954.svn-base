package de.fh_zwickau.oose.zuul;

import javax.swing.*;
import java.io.Serializable;

/**
 * Implementation of the 'quit' user command.
 * 
 * @author Michael Kolling
 * @version 1.0 (December 2002)
 */
public class QuitCommand extends Command implements Serializable {
    /**
     * Constructor for objects of class QuitCommand
     */
    public QuitCommand(){
    }

    /**
     * "Quit" was entered. Check the argument to see whether
     * we really quit the game. 
     * @param player - out player
     * @param textArea - console
     * @return true, if we should quit; false otherwise.
     */
    public boolean execute(Player player, JTextArea textArea){
        if(!hasSecondWord()) {
            return true;
        }
        else {
            textArea.setText("I cannot quit that...");
            return false;
        }
    }
    //help quit
    @Override
    public String help() {

        return "Type only quit to exit program";
    }

}
