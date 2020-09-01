package de.fh_zwickau.oose.zuul;

import gui_pack.AlertBox;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * This class represents players in the game. Each player has
 * a current location.
 *
 * @author Savchuk Dmytro
 * @version 1.1 (December 2017)
 */
public class Player implements Serializable {

    private Stack<Room> roomsHistory;

    private List<Item> bag;

    /**
     * Constructor for objects of class Player
     */
    public Player() {

        roomsHistory = new Stack<>();
        this.bag = new ArrayList<>();
    }

    /**
     * @return the current room for this player.
     */
    public Room getCurrentRoom() {

        return roomsHistory.lastElement();
    }

    public List<Item> getBag() {
        return bag;
    }

    public void setBag(Item item) {
        this.bag.add(item);
    }

    /**
     * Set the current room for this player.
     * @param room - push in Stack rooms history
     */
    public void setCurrentRoom(Room room) {

        roomsHistory.push(room);
    }

    /**
     * Try to go to previous room.
     * @return previous room; If there is the room show message "There is no door!"
     */
    public String back() {
        String result;
        if(roomsHistory.size() > 1){
            roomsHistory.pop();
            System.out.println(  );
            result = getCurrentRoom().getLongDescription();
        }else result = "You can't go back";

        return result;

    }

    /**
     * @param direction - where we go
     * @return result of enter in room
     */
    public String walk(String direction) {

        // Try to leave current room.
        final String result = getCurrentRoom().getExit(direction).map(room -> {
          if( this.bag.containsAll(room.getNeedItems())  || room.isOpened() ) {

              setCurrentRoom(room);
              room.setOpened(true);
              return room.getLongDescription();
          }
            return "Blocked. " + "Try to find this items: " + room.showNeedItems(this.bag)+"\n" + getCurrentRoom().getLongDescription();
        }).orElse("There is no door!");

        return result;
    }

    /** print out all items player has
     * @param textArea - show result
     */
    public void look( JTextArea textArea ){
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (Item item : this.bag) {
            i++;
            result.append(item.getName() + "[" + i + "]" + ' ');
        }

        textArea.setText(result.toString());
    }

    /**
     * Dropping Items method
     * @param secondWord - index of Items, which player want to drop
     * @param textArea - console
     */
    public void give(String secondWord, JTextArea textArea) {

        try {
            Item item = this.bag.get(Integer.parseInt(secondWord) - 1);

            item.setAnswer(null);
            this.bag.remove(item);
            getCurrentRoom().addItem(item);
            textArea.setText("putted");
        }
        catch(NumberFormatException ex){
            textArea.setText("Spelling error");

        }catch(IndexOutOfBoundsException r){
            textArea.setText("There is no key");
        }
    }

    /**
     * Print out an riddle in AlertBox, reads input from player and print out solved or not
     *  @param secondWord - the index of Riddle
     *  @param textArea - show result
     */
    public void solve(String secondWord, JTextArea textArea){

        try {

            final String resultRiddle = getCurrentRoom().getItem(Integer.parseInt(secondWord)).map( item ->{
                if( item.getAnswer() == null){
                    this.bag.add(item);
                    getCurrentRoom().removeHasItem(item);
                    return "You took back your own item \n" + getCurrentRoom().getLongDescription();
                }else {


                    AlertBox alertBox = new AlertBox("Solve the Riddle", item.getRiddle());
                    alertBox.show();

                    if ( alertBox.getAnswer()!=null && alertBox.getAnswer().equalsIgnoreCase(item.getAnswer()) ) {

                        this.bag.add(item);
                        getCurrentRoom().removeHasItem(item);

                        return "You solved the Riddle\n" + getCurrentRoom().getLongDescription();

                    } else {
                        return "Try again!\n" + getCurrentRoom().getLongDescription();
                    }
                }

            }).orElse("There is no key");
            textArea.setText(resultRiddle);
        }
        catch(NumberFormatException ex){
            textArea.setText("Spelling error");

        }
    }
}

