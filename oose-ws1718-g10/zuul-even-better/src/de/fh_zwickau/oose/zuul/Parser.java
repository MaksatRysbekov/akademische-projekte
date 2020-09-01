package de.fh_zwickau.oose.zuul;
import javax.swing.*;
import java.io.Serializable;
import java.util.Optional;
import java.util.StringTokenizer;

/**
 * This class is the main class of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * This parser reads user input and tries to interpret it as an "Adventure"
 * command. Every time it is called it reads a line from the terminal and
 * tries to interpret the line as a two word command. It returns the command
 * as an object of class Command.
 *
 * The parser has a set of known command words. It checks user input against
 * the known commands, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.1 (December 2002)
 */

public class Parser implements Serializable{

    private CommandWords commands;  // holds all valid command words

    /**
     * Constructor - initialise the Parser
     */
    public Parser() {
        commands = new CommandWords();
    }

    /**
     * We're getting the commands from BufferedReader, and assigning the first and second word
     * @param textField - we input commands in JTextField
     * @return command if there is no command returns object of optional
     */
    public Command getCommand(JTextField textField)
    {
        String inputLine;  // will hold the full input line
        String word1;
        String word2;


        inputLine = textField.getText();

        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        if(tokenizer.hasMoreTokens()) {
            word1 = tokenizer.nextToken();
        }// get first word
        else{
            word1 = null;
        }
        if(tokenizer.hasMoreTokens()) {
            word2 = tokenizer.nextToken();      // get second word
        }
        else{
            word2 = null;
        }
        Optional<Command> command = commands.get(word1);
        Command commandObject = command.orElse( new NullCommand() );
        commandObject.setSecondWord(word2);

        return commandObject;


    }

}
