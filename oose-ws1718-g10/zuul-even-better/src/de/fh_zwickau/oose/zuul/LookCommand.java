package de.fh_zwickau.oose.zuul;

import javax.swing.*;
import java.io.Serializable;

/**
 * Using this class we can see content of Player's Bag
 * @author Savchuk Dmytro
 * @version 1.1 (December 2017)
 */
public class LookCommand extends Command implements Serializable {

    /**
     * Constructor for objects of class LookCommand
     */
    public LookCommand(){}
    /*
    * Show bag content
    *
    * */
    @Override
    public boolean execute(Player player, JTextArea textArea) {

        player.look(textArea);
        return false;
    }
    /*
    * "look help"
    * */
    @Override
    public String help() {
        return "Just type look to see content of your bag";
    }
}
