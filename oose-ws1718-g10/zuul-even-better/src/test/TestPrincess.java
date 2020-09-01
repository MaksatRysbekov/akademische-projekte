package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPrincess implements MethTest {

    public Init init;

    public TestPrincess(){
        init = new Init();
        init.player.setCurrentRoom(init.princess);
    }

    /*
     * There is no door
     * Expected princess
     * */
    @Override @Test
    public void goUp() {

        init.player.walk(init.up);
        assertEquals(init.princess, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected princess
     * */
    @Override @Test
    public void goDown() {

        init.player.walk(init.down);
        assertEquals(init.princess, init.player.getCurrentRoom());
    }
    /*
    * Expected hall
    * */
    @Override @Test
    public void goRight() {

        init.player.walk(init.right);
        assertEquals(init.hall, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected princess
     * */
    @Override @Test
    public void goLeft() {

        init.player.walk(init.left);
        assertEquals(init.princess, init.player.getCurrentRoom());
    }
}
