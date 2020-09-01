package de.fh_zwickau.oose.zuul;


import java.io.Serializable;


/**
 * Using this class we can add different items in room and guess the riddle of items
 * @author Savchuk Dmytro
 * @version 1.1 (December 2017)
 */
public class Item implements Serializable{
    // variables for riddle in game and for answer and name of item
    private String riddle;
    private String answer;
    private String itemName;

    /**
     * Constructor for items
     * @param itemName - name of Item
     * @param riddle - text of riddle
     * @param answer - answer of riddle
     */
    public Item(String itemName, String riddle, String answer){

        this.riddle = riddle;
        this.answer = answer;
        this.itemName = itemName;
    }

    /**
    * @return riddle
    * */
    public String getRiddle(){
        return  this.riddle;
    }
    /**
    * @return name of item
    * */
    public String getName(){

        return this.itemName;
    }

    /**@return answer of riddle
     * **/
    public String getAnswer() {
        return answer;
    }

    /**
     *
     * @param answer - set answer for riddle
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                '}';
    }
}
