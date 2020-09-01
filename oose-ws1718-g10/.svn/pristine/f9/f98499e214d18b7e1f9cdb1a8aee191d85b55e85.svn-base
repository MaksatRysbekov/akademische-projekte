package de.fh_zwickau.oose.zuul;

import javax.swing.*;
import java.io.Serializable;
/**
 *
 *
 * This class is performing a BackCommand for player. Using this class we can go back by our way
 * @author Savchuk Dmytro
 * @version 1.1 (December 2017)
 */
public class BackCommand extends Command implements Serializable {

	/**
     * Constructor for objects of class BackCommand
     *  
    */
	public BackCommand(){
    	
    }

    /** 
     * Try to back. If there is an exit, enter the previous
     * room, otherwise print an error message. Returns always 'false'.
     * 
     * @param player - our player
     * @param textArea - console
     */
    
    public boolean execute(Player player, JTextArea textArea){
    	
    	textArea.setText(player.back());
    	return false;

    }

    //help back
    @Override
    public String help() {
        return "Type only back to return into previous Room";

    }
}
