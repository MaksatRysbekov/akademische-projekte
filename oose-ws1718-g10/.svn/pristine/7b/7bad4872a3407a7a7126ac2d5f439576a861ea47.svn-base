package test;

import de.fh_zwickau.oose.zuul.Item;
import de.fh_zwickau.oose.zuul.Player;
import de.fh_zwickau.oose.zuul.Room;

public class Init {


    public Player player;
    public Room dragonRoom, corridor, castleGate, kitchen, library, hallway, hall, princess;
    public Item keyForLibrary, flowers, keyForCorridor, chocolate;
    public String right,left,down,up;

    public Init(){

        this.player = new Player();

        //directions
        right = "right";
        left = "left";
        down = "down";
        up = "up";
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
        keyForLibrary = new Item("Key_For_Library", "What loses its head in the morning and gets it back at night?","pillow");
        flowers = new Item("Flowers", "Mr. Smith has 4 daughters. Each of his daughters has a brother.","five");
        keyForCorridor = new Item("Key_For_Corridor", "What is full of holes but still holds water?","sponge");
        chocolate = new Item("Chocolate", "What occurs twice in a week, once in a year but never in a day?", "letter E");

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
    }
}
