package de.fh_zwickau.oose.zuul;

import javax.swing.*;
import java.io.Serializable;

/**
 * Implementation of the 'go' user command.
 * 
 * @author Michael Kolling
 * @version 1.0 (December 2002)
 */
public class GoCommand extends Command implements Serializable {
    /**
     * Constructor for objects of class GoCommand
     */
    public GoCommand(){
    }

    /** 
     * Try to go to one direction. If there is an exit, enter the new
     * room, otherwise print an error message. Returns always 'false'.
     * 
     * @param player - our player
     * @param textArea - console
     * @return false
     */
    public boolean execute(Player player, JTextArea textArea) {
    
        if(hasSecondWord()) {
        	
            String direction = getSecondWord();
            textArea.setText(player.walk(direction));
        }
        else {
            // if there is no second word, we don't know where to go...
            textArea.setText("Go where?");
        }
        return false;
    }

   /*
   * help go
   * */
    @Override
    public String help() {
        return "Type go and direction";
    }
}
