package de.fh_zwickau.oose.zuul;
import javax.swing.*;
import java.io.Serializable;
import java.util.Optional;

/**
 * Implementation of the 'help' user command.
 * 
 * @author Michael Kolling
 * @version 1.0 (December 2002)
 */
public class HelpCommand extends Command implements Serializable{

	private CommandWords commandWords;
    /**
     * Constructor for objects of class HelpCommand
     * @param words - CommandWords
     */
    public HelpCommand(CommandWords words) {
        this.commandWords = words;
    }
	/**
     * Print out some help information. Here we print some stupid, 
     * cryptic message and a list of the command words.
     * Returns always false.
     * 
     * @param player - our player
     * @param textArea - console
     * @return false
     */
	@Override
	public boolean execute(Player player, JTextArea textArea) {
		StringBuffer result = new StringBuffer();
		if( hasSecondWord()){
			Optional<Command> command = this.commandWords.get( getSecondWord() );
			Command commandObject = command.orElse( new NullCommand() );
			textArea.setText(commandObject.help());
		}else {

			result.append("You are lost. You are alone. You wander around at the castle.\n");
			result.append(player.getCurrentRoom().getLongDescription());
			result.append("\nYour command words are:\n");
			result.append(commandWords.showAll());

			textArea.setText( result.toString() );

		}
		return false;
	}

	//help help
	@Override
	public String help() {

		return "You can use help command to display available commands";
	}
}