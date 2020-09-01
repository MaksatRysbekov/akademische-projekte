package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestKitchen implements MethTest {

    public Init init;

    public TestKitchen(){
        init = new Init();
        init.player.setCurrentRoom(init.kitchen);
    }


    /*
    * Expected castleGate
    * */
    @Override @Test
    public void goUp() {


        init.player.walk(init.up);
        assertEquals(init.castleGate, init.player.getCurrentRoom());
    }
    /*
    * library is blocked
    * Expected kitchen
    * */
    @Override @Test
    public void goDown() {


        init.player.walk(init.down);
        assertEquals(init.kitchen, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected kitchen
     * */
    @Override @Test
    public void goRight() {


        init.player.walk(init.right);
        assertEquals(init.kitchen, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected kitchen
     * */
    @Override @Test
    public void goLeft() {


        init.player.walk(init.left);
        assertEquals(init.kitchen, init.player.getCurrentRoom());
    }
    /*
    * unblock library and go there
    * */
    @Test
    public void goToLibrary(){
        init.player.setBag(init.keyForLibrary);
        init.player.walk(init.down);
        assertEquals(init.library, init.player.getCurrentRoom());
    }
}
