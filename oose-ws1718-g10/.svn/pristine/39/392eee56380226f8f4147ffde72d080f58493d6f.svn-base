package de.fh_zwickau.oose.zuul;
import java.io.Serializable;
import java.util.*;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 *
 * A "Room" represents one location in the scenery of the game.  It is
 * connected to other rooms via exits.  For each existing exit, the room
 * stores a reference to the neighboring room.
 *
 * @author  Savchuk Dmytro
 * @version 1.1 (December 2017)
 */

public class Room implements Serializable{

    private boolean opened = true;
    private String description;
    private Map<String, Room> exits;        // stores exits of this room.
    private List<Item> items;               //which items has this room
    private List<Item> needItem;            //which items this room need to be entered as player

    /**
     * @param description - Create a room described "description". Initially, it has no exits.
     * "description" is something like "in a kitchen" or "in an open court
     * yard".
     */
    public Room(String description) {

        this.description = description;
        exits = new HashMap<>();
        items = new ArrayList<>();
        needItem = new ArrayList<>();

    }

    public Room() {}

    public boolean isOpened() {
        return opened;
    }
    /**
     *when we solve the riddle of current room, it will be opened.
     * It's made when we drop item in room, and after that we want again take it - we don't solve the riddle again - we just take the item, because we took it before
     * @param opened - status of our room
     */
    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    //return all items which room has
    public String getItems() {

        StringBuilder result =new StringBuilder();
        String s = "";
        int i=0;
        for (Item item : items) {
            i++;
            result.append(item.getName() + "["+ i +"]" + " ");
        }
        if (i > 0) {
            s = "\njust type get and number to take item";
        }
        return result.toString() + s;

    }

    /**
     * @param item - add one item to current room
     */
    public void addItem(Item item) {

        this.items.add(item);
    }

    /**
     * @return List of all needItem
     */
    public List<Item> getNeedItems(){
        return this.needItem;
    }
    //show all item, which current room need> But, if player has some of need item - we don't show that
    public String showNeedItems(List<Item> playerBag) {

        StringBuilder result =new StringBuilder();

        for (Item item : needItem) {
            if (!playerBag.contains(item)) {

                result.append(item.getName() + ' ');
            }
        }

        return result.toString();
    }
    //getItem by index
    public Optional<Item> getItem(int index){
        if (index > this.items.size() || index <= 0) {
            return Optional.ofNullable(null);
        }
        index--;

        return Optional.ofNullable(this.items.get(index));

    }

    /**
     *
     * @return all items which contain in room
     */
    public List<Item> getAllItems(){
        return this.items;
    }


    /**
     * @param item - add New Item to current Room
     */
    public void addNeedItem(Item item) {
        this.opened = false;
        this.needItem.add(item);
    }

    /**
     * @param item - remove HasItem from current Room
     */
    public void removeHasItem(Item item){
        this.items.remove(item);
    }


    /**
     * Define an exit from this room.
     * @param direction - where is neighbor
     * @param neighbor - name
     */

    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    /**
     * Return the description of the room (the one that was defined in the
     * constructor).
     * @return description
     */
    public String getShortDescription(){
        return description;
    }

    /**
     *  @return a long description of this room, in the form:
     *     You are in the kitchen.
     *     Exits: north west
     */
    public String getLongDescription() {
        String has = "";
        if (this.items.size()>0){
            has = "\nHas:" + getItems();
        }
        return "You are in " + description + ".\n" + getExitString() + has;

    }

    /**
     * @return a string describing the room's exits, for example
     * "Exits: north west".
     */
    private String getExitString() {
        StringBuilder returnString = new StringBuilder("Exits:");

        Set<String> keys = exits.keySet();
        for(Iterator<String> iter = keys.iterator(); iter.hasNext(); ) {
            returnString.append(' ' + iter.next());
        }
        return returnString.toString();
    }

    /**@param direction - from where we want to see exits
     * @return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction returns object of optionals.
     */
    public Optional<Room> getExit(String direction){
       return Optional.ofNullable( exits.get(direction) );

    }

    @Override
    public String toString() {
        return "Room{" +
                "description='" + description + '\'' +
                '}';
    }
}

