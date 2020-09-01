package de.fh_zwickau.oose.zuul;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

/**
 * This class is the main class of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.
 * 
 * This class holds a collection of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 2.0 (December 2002)
 */

public class CommandWords implements Serializable{
    private Map<String, Command> commands;

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords() {
        commands = new HashMap<>();
        commands.put("go", new GoCommand());
        commands.put("help", new HelpCommand(this));
        commands.put("quit", new QuitCommand());
        commands.put("back", new BackCommand());
        commands.put("get", new GetCommand());
        commands.put("look", new LookCommand());
        commands.put("put", new PutCommand());
    }

    /**
     * @param word - CommandWord
     * @return object of optional if there is no command with this name
     */
    public Optional<Command> get(String word){
        return Optional.ofNullable( commands.get(word) );

    }

    /**
     * @return all valid commands
     */
    
    public StringBuffer showAll(){
        StringBuffer result = new StringBuffer();
        for(Iterator i = commands.keySet().iterator(); i.hasNext(); ) {
            result.append(i.next() + "  ");
        }
        return result;
    }
}
