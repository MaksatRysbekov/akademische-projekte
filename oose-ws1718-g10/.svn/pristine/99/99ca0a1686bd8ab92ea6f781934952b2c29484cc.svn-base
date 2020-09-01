package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCastleGate implements MethTest {

    public Init init;

    public TestCastleGate(){
        init = new Init();
        init.player.setCurrentRoom(init.castleGate);
    }
    /*
    * Corridor is blocked
    * Expected castleGate
    * */
    @Test
    public void goUp(){
        init.player.walk(init.up);
        assertEquals(init.castleGate, init.player.getCurrentRoom());
    }
    /*
     * Expected kitchen
     * */
    @Test
    public void goDown(){
        init.player.walk(init.down);
        assertEquals(init.kitchen, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected castleGate
     * */
    @Test
    public void goLeft(){
        init.player.walk(init.left);
        assertEquals(init.castleGate, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected castleGate
     * */
    @Test
    public void goRight(){
        init.player.walk(init.right);
        assertEquals(init.castleGate, init.player.getCurrentRoom());
    }


    @Test
    public void goToCorridor(){
        init.player.setBag(init.keyForCorridor);
        init.player.walk(init.up);
        assertEquals(init.corridor, init.player.getCurrentRoom());
    }

}
