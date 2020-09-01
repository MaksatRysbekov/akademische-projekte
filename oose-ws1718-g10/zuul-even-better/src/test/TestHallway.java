package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHallway implements MethTest{


    public Init init;

    public TestHallway(){
        init = new Init();
        init.player.setCurrentRoom(init.hallway);
    }
    /*
     * There is no door
     * Expected hallway
     * */
    @Override @Test
    public void goUp() {


        init.player.walk(init.up);
        assertEquals(init.hallway, init.player.getCurrentRoom());
    }
    /*
    * Expected hall
    * */
    @Override @Test
    public void goDown() {


        init.player.walk(init.down);
        assertEquals(init.hall, init.player.getCurrentRoom());
    }
    /*
    * library is blocked
    * Expected hallway
    * */
    @Override @Test
    public void goRight() {


        init.player.walk(init.right);
        assertEquals(init.hallway, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected hallway
     * */
    @Override @Test
    public void goLeft() {


        init.player.walk(init.left);
        assertEquals(init.hallway, init.player.getCurrentRoom());
    }

    /*
    * unblock library and go there
    * */
    @Test
    public void goToLibrary(){


        init.player.setBag(init.keyForLibrary);
        init.player.walk(init.right);
        assertEquals(init.library, init.player.getCurrentRoom());
    }
}
