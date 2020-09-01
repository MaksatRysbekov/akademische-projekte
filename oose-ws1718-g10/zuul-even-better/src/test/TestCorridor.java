package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestCorridor implements  MethTest {

    public Init init;

    public TestCorridor(){
        init = new Init();
        init.player.setCurrentRoom(init.corridor);
    }
    /*
     * There is no door
     * Expected corridor
     * */
    @Override @Test
    public void goUp() {

        init.player.walk(init.up);
        assertEquals(init.corridor, init.player.getCurrentRoom());
    }
    /*
    * Expected castleGate
    * */
    @Override @Test
    public void goDown() {
        init.player.walk(init.down);
        assertEquals(init.castleGate, init.player.getCurrentRoom());
    }
    /*
    * Expected dragonRoom
    * */
    @Override @Test
    public void goRight() {

        init.player.walk(init.right);
        assertEquals(init.dragonRoom, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected corridor
     * */
    @Override @Test
    public void goLeft() {

        init.player.walk(init.left);
        assertEquals(init.corridor, init.player.getCurrentRoom());
    }

}
