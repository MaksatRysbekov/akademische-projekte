package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHall implements MethTest {



    public Init init;


    public TestHall(){
        init = new Init();
        init.player.setCurrentRoom(init.hall);
    }


    /*
     * @Expected hallway
     * */

    @Override @Test
    public void goUp() {


        init.player.walk(init.up);
        assertEquals(init.hallway, init.player.getCurrentRoom());
    }
    /*
    * There is no door
    * Expected hall
    * */
    @Override @Test
    public void goDown() {


        init.player.walk(init.down);
        assertEquals(init.hall, init.player.getCurrentRoom());
    }
    /*
     * There is no door
     * Expected hall
     * */
    @Override @Test
    public void goRight(){


        init.player.walk(init.right);
        assertEquals(init.hall, init.player.getCurrentRoom());
    }

    /*
    * Princess is blocked
    * Expected hall
    * */
    @Override @Test
    public void goLeft() {


        init.player.walk(init.left);
        assertEquals(init.hall, init.player.getCurrentRoom());
    }

    /*
    * unblock Princess room and go there
    * Expected princess
    * */
    @Test
    public void goToPrincesa(){


        init.player.setBag(init.chocolate);
        init.player.setBag(init.flowers);
        init.player.walk(init.left);
        assertEquals(init.princess, init.player.getCurrentRoom());
    }
}
