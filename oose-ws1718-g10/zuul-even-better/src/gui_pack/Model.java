package gui_pack;

import de.fh_zwickau.oose.zuul.Game;

/**
 * Using this class we connect our Controller with Gui. From here we start the Game
 * @author Savchuk Dmytro
 * @version 0.1 (December 2017)
 */


public class Model  {


    public Model(){}

    /**
     *
     * @param args - arguments
     */
    public static void main(String[] args)  {
        View view = new View();
        Game game = new Game(view);

        view.btnUp.addActionListener(game);
        view.btnDown.addActionListener(game);
        view.btnLeft.addActionListener(game);
        view.btnLoad.addActionListener(game);
        view.btnSave.addActionListener(game);
        view.btnRight.addActionListener(game);
        view.btnHelp.addActionListener(game);
        view.btnRun.addActionListener(game);
        view.btnBack.addActionListener(game);

        view.listItems.addListSelectionListener(game);
        view.bag.addListSelectionListener(game);

        game.play();
    }

}
