package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLibrary implements MethTest{

    public Init init;

    public TestLibrary(){
        init = new Init();
        init.player.setCurrentRoom(init.library);
    }
    /*
    * Expected kitchen
    * */
    @Override @Test
    public void goUp() {

        init.player.walk(init.up);
        assertEquals(init.kitchen, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected kitchen
     * */
    @Override @Test
    public void goDown() {

        init.player.walk(init.down);
        assertEquals(init.library, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected Turm
     * */
    @Override @Test
    public void goRight() {

        init.player.walk(init.right);
        assertEquals(init.library, init.player.getCurrentRoom());
    }
    /*
    * Expected hallway
    * */
    @Override @Test
    public void goLeft() {

        init.player.walk(init.left);
        assertEquals(init.hallway, init.player.getCurrentRoom());
    }
}
