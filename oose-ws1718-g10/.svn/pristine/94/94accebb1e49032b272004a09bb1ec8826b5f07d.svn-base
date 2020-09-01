package de.fh_zwickau.oose.zuul;

import javax.swing.*;
import java.io.Serializable;

/**
 * Using this class we can drop Player's Items, which being in Bag
 * @author Savchuk Dmytro
 * @version 1.1 (December 2017)
 */
public class PutCommand extends Command implements Serializable {
    /*
    * There is command for put items of player in different rooms
    * */
    PutCommand(){

    }
    /**
     * @param player - our player
     * @param textArea - console
    * execute command to put item in current room
    * */
    @Override
    public boolean execute(Player player, JTextArea textArea) {
        if(hasSecondWord()) {

            String item = getSecondWord();
            player.give(item, textArea);
        }
        else {
            // if there is no second word, we don't know where to go...
            textArea.setText("Which item do you want to give?");
        }
        return false;
    }
    //help put
    @Override
    public String help() {
        return "Type put and number from your bag to give away your item in current room";
    }
}
