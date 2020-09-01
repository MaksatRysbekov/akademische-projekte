package de.fh_zwickau.oose.zuul;

import javax.swing.*;
import java.io.Serializable;

/**
 * Using this class we can get different items from rooms by index
 * @author Savchuk Dmytro
 * @version 1.1 (December 2017)
 */
public class GetCommand extends Command implements Serializable {

    GetCommand(){
    }
    /**
     * Print out an riddle, reads input from player and print out solved or not
     * @param player - our player
     * @return false
     */
    @Override
    public boolean execute(Player player, JTextArea textArea) {

        if(hasSecondWord()) {

            player.solve(getSecondWord(), textArea);
        }
        else {
            // if there is no second word, we don't know where to go...
            textArea.setText("Which item?");
        }
        return false;
    }

    @Override
    public String help() {
        return "Type only get and number to read the Riddle";
    }
}