package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import de.fh_zwickau.oose.zuul.CommandWords;

public class TestCommands {
	
	
	public TestCommands() {}
    //checking have we back command
    @Test
    public void isBack(){
        CommandWords command = new CommandWords();
        assertNotNull(command.get("back"));
    }
    //checking have we quit command
    @Test
    public void isQuit(){
        CommandWords command = new CommandWords();
        assertNotNull(command.get("quit"));
    }
    //checking have we go command
    @Test
    public void isGo(){
        CommandWords command = new CommandWords();
        assertNotNull(command.get("go"));
    }
    //checking have we help command
    @Test
    public void isHelp(){
        CommandWords command = new CommandWords();
        assertNotNull(command.get("help"));
    }
    //checking have we get command
    @Test
    public void isGet(){
        CommandWords command = new CommandWords();
        assertNotNull(command.get("get"));
    }
    //checking have we put command
    @Test
    public void isPut(){
        CommandWords command = new CommandWords();
        assertNotNull(command.get("put"));
    }
    //checking have we look command
    @Test
    public void isLook(){
        CommandWords command = new CommandWords();
        assertNotNull(command.get("look"));
    }
}
