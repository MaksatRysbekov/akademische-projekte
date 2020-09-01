package de.fh_zwickau.oose.zuul;

import gui_pack.View;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.
 * 
 * @author  Savchuk Dmytro
 * @version 1.1 (December 2017)
 */

public class Game implements ActionListener, ListSelectionListener, Serializable  {
    private Parser parser;
    private Player player;
    private Room dragonRoom, corridor, castleGate, kitchen, library, hallway, hall, princess;
    private List<JButton> buttonRooms;

    private View view;

    /**
     * @param view - GUI
     * Create the game and initialise its internal map.
     */
    public Game(View view) {
        this.view = view;

        player = new Player();
        parser = new Parser();
        createRooms();
    }


/**
 * Create all the rooms and link their exits together.
**/
    public void createRooms(){
        //directions
        String right = "right";
        String left = "left";
        String down = "down";
        String up = "up";
        // create the rooms
        dragonRoom = new Room("Dragon Room");
        corridor = new Room("Corridor");
        castleGate = new Room("Castle Gate");
        kitchen = new Room("Kitchen");
        library = new Room("Library");
        hallway = new Room("Hallway");
        hall = new Room("Hall");
        princess = new Room("Princess");
        
        // initialise room exits
        dragonRoom.setExit(left, corridor);

        corridor.setExit(right, dragonRoom);
        corridor.setExit(down, castleGate);

        castleGate.setExit(up, corridor);
        castleGate.setExit(down, kitchen);

        kitchen.setExit(up, castleGate);
        kitchen.setExit(down, library);

        library.setExit(up, kitchen);
        library.setExit(left, hallway);

        hallway.setExit(right, library);
        hallway.setExit(down, hall);

        hall.setExit(up ,hallway);
        hall.setExit(left , princess);

        princess.setExit(right, hall);

        // initialise items
        Item keyForLibrary = new Item("Key_For_Library", "What loses its head in the morning and gets it back at night?","pillow");
        Item flowers = new Item("Flowers", "Mr. Smith has 4 daughters. Each of his daughters has a brother. How many children does Mr. Smith have ?","five");
        Item keyForCorridor = new Item("Key_For_Corridor", "What is full of holes but still holds water?","sponge");
        Item chocolate = new Item("Chocolate", "What occurs twice in a week, once in a year but never in a day?", "letter E");

        //add items into rooms
        dragonRoom.addItem(keyForLibrary);

        corridor.addItem(flowers);
        corridor.addNeedItem(keyForCorridor);
        corridor.addItem(chocolate);

        library.addNeedItem(keyForLibrary);
        kitchen.addItem(keyForCorridor);

        princess.addNeedItem(flowers);
        princess.addNeedItem(chocolate);
        // the player starts the game outside
        player.setCurrentRoom(castleGate);
        setRoomsColor(player.getCurrentRoom());
        
    }

/**
 *Starting the Game
 * print Welcome in TextArea
*/
    public void play(){
        view.textArea.setText(printWelcome());
    }

    /**
     * @return the opening message for the player.
     */
    private String printWelcome(){
        String welcome = "Welcome to The World of Zuul!\nThe World of Zuul is a new, incredibly boring adventure game.\nType 'help' if you need help.\n";
        welcome += player.getCurrentRoom().getLongDescription();
        return welcome;

    }
    /**
     * @param e - Event
    * Buttons clicked
    * */
    @Override
    public void actionPerformed (ActionEvent e)  {
        Object source = e.getSource();

        if (source == this.view.btnUp) {
            GoCommand goCommand = new GoCommand();
            goCommand.setSecondWord("up");
            goCommand.execute(player, view.textArea);
        }

        if (source == view.btnDown) {
            GoCommand goCommand = new GoCommand();
            goCommand.setSecondWord("down");
            goCommand.execute(player, view.textArea);
        }

        if(source == view.btnRun){
            Command command = parser.getCommand(view.textField);
            command.execute(player, view.textArea);
        }

       if (source == view.btnHelp) {
            HelpCommand helpCommand = new HelpCommand(new CommandWords());
            helpCommand.execute(player, view.textArea);
        }

        if (source == view.btnBack) {
            BackCommand backCommand = new BackCommand();
            backCommand.execute(player, view.textArea);

        }

        if( source == view.btnSave){
            try {
                save();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        if (source == view.btnLoad) {
            try {
                load();
            } catch (IOException | ClassNotFoundException e1) {
                e1.printStackTrace();
            }
        }

        if (source == view.btnRight) {
            GoCommand goCommand = new GoCommand();
            goCommand.setSecondWord("right");
            goCommand.execute(player, view.textArea);
        }
        if (source == view.btnLeft) {
            GoCommand goCommand = new GoCommand();
            goCommand.setSecondWord("left");
            goCommand.execute(player, view.textArea);
        }
        updateItemsList();
        updateBagList();
        setRoomsColor(player.getCurrentRoom());

    }
/**
 * Load the last saved Game
 * @throws  java.io.IOException
 * @throws  java.lang.ClassNotFoundException
 */
    public void load() throws IOException, ClassNotFoundException {

        FileInputStream PlayerFile = new FileInputStream("player.out");
        ObjectInputStream PlayerIn = new ObjectInputStream(PlayerFile);
        player = (Player) PlayerIn.readObject();

        FileInputStream TextAreaFile = new FileInputStream("textArea.out");
        ObjectInputStream text = new ObjectInputStream(TextAreaFile);
        JTextArea textArea = (JTextArea) text.readObject();
        this.view.textArea.setText(textArea.getText() );

        PlayerIn.close();
        text.close();

    }
/**
 * Save the current Game in files
 * @throws java.io.IOException
 */
    public void save() throws IOException{
        FileOutputStream PlayerOut = new FileOutputStream("player.out");
        ObjectOutputStream PlayerStream = new ObjectOutputStream(PlayerOut);

        PlayerStream.writeObject(player);
        PlayerStream.flush();
        PlayerStream.close();

        FileOutputStream TextAreaFile = new FileOutputStream("textArea.out");
        ObjectOutputStream text = new ObjectOutputStream(TextAreaFile);

        text.writeObject(view.textArea);
        view.textArea.setText("Saved");
        text.flush();
        text.close();
    }
    /**
    *  filling content of Bag in JList
    * */
    public void updateBagList(){
        view.getBagModel().clear();
        for (int i = 0; i < player.getBag().size(); i++) {
            view.getBagModel().addElement( player.getBag().get(i).getName() );
        }
    }

    /**
     * filling content of Items of Rooms in JList
      */
    public void updateItemsList(){
        view.getlistItemsModel().clear();
        for (int i = 0; i < player.getCurrentRoom().getAllItems().size(); i++) {
            view.getlistItemsModel().addElement( player.getCurrentRoom().getAllItems().get(i).getName());
        }
    }

    /**
     *
     * @param room - current Room
     *  Depending on the room we paint current room in green color and change pictures
     */
   public void setRoomsColor(Room room){

        buttonRooms = new ArrayList<>();

        buttonRooms.add(view.corridor);
        buttonRooms.add(view.castleGate);
        buttonRooms.add(view.dragon);
        buttonRooms.add(view.kitchen);
        buttonRooms.add(view.library);
        buttonRooms.add(view.hall);
        buttonRooms.add(view.hallway);
        buttonRooms.add(view.princess);

        //reset for all rooms
        for(int i =0; i<buttonRooms.size(); i++){
            buttonRooms.get(i).setBackground(new Color(197,202,233));
        }

        //green color
        Color color = new Color(139,195,74);



        if( room.getShortDescription().equals(castleGate.getShortDescription()) ){
            view.castleGate.setBackground(color);
            view.picture.setIcon(new ImageIcon(View.class.getResource("/pictures/castleGate.jpg")));
        }
        if(room.getShortDescription().equals(corridor.getShortDescription())){
            view.corridor.setBackground(color);
            view.picture.setIcon(new ImageIcon(View.class.getResource("/pictures/corridor.jpg")));
        }
        if(room.getShortDescription().equals(dragonRoom.getShortDescription())){
            view.dragon.setBackground(color);
            view.picture.setIcon(new ImageIcon(View.class.getResource("/pictures/dragon.jpg")));
        }

        if(room.getShortDescription().equals(kitchen.getShortDescription())){
            view.kitchen.setBackground(color);
            view.picture.setIcon(new ImageIcon(View.class.getResource("/pictures/kitchen.jpg")));

        }
        if(room.getShortDescription().equals(library.getShortDescription())){
            view.library.setBackground(color);
            view.picture.setIcon(new ImageIcon(View.class.getResource("/pictures/library.jpg")));
        }
        if(room.getShortDescription().equals(hall.getShortDescription())){
            view.hall.setBackground(color);
            view.picture.setIcon(new ImageIcon(View.class.getResource("/pictures/hall.jpg")));
        }
        if(room.getShortDescription().equals(hallway.getShortDescription())){
            view.hallway.setBackground(color);
            view.picture.setIcon(new ImageIcon(View.class.getResource("/pictures/hallway.jpg")));
        }
        if(room.getShortDescription().equals(princess.getShortDescription())){
            view.princess.setBackground(color);
            view.picture.setIcon(new ImageIcon(View.class.getResource("/pictures/princess.jpg")));
            view.textArea.setText("Congratulations. You won this difficult Game");
        }
    }

    /**
     *
     * @param e - Event
     * On JLists clicked
     * If we click on the listItems - we chosen Items of rooms and after that we see the riddle
     * If we click on the bagList - we putted in current room this Item
     */
    @Override
    public void valueChanged(ListSelectionEvent e) {

        if(e.getValueIsAdjusting()) {
            if (this.view.listItems.getSelectedValue() != null) {
                int index = this.view.listItems.getSelectedIndex();
                GetCommand getCommand = new GetCommand();
                getCommand.setSecondWord(Integer.toString(index + 1));
                getCommand.execute(player, this.view.textArea);
                updateItemsList();
                updateBagList();

            }

            if (this.view.bag.getSelectedValue() != null ) {
                int index = this.view.bag.getSelectedIndex();
                PutCommand putCommand = new PutCommand();
                putCommand.setSecondWord(Integer.toString(index + 1));
                putCommand.execute(player, this.view.textArea);
                view.getBagModel().remove(index);
                updateItemsList();
            }
        }

    }
}
