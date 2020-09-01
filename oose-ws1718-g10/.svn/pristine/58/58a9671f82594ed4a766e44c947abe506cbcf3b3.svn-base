package test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDragonRoom implements MethTest {

    public Init init;

    public TestDragonRoom(){
        init = new Init();
        init.player.setCurrentRoom(init.dragonRoom);
    }

    /*
     * There is no door
     * Expected dragonRoom
     * */
    @Override @Test
    public void goUp() {

        init.player.walk(init.up);
        assertEquals(init.dragonRoom, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected dragonRoom
     * */
    @Override @Test
    public void goDown() {


        init.player.walk(init.down);
        assertEquals(init.dragonRoom, init.player.getCurrentRoom());
    }
    /*
    * There is no door
    * Expected dragonRoom
    * */
    @Override @Test
    public void goRight() {


        init.player.walk(init.right);
        assertEquals(init.dragonRoom, init.player.getCurrentRoom());
    }

    /*
    * Corridor is blocked
    * Expected dragonRoom
    * */
    @Override @Test
    public void goLeft() {

        init.player.walk(init.left);
        assertEquals(init.dragonRoom, init.player.getCurrentRoom());
    }

    /*
    * unblock Corridor and go there
    * */
    @Test
    public void goToKorridor(){

        init.player.setCurrentRoom(init.dragonRoom);
        init.player.setBag(init.keyForCorridor);
        init.player.walk(init.left);
        assertEquals(init.corridor, init.player.getCurrentRoom());
    }
}
