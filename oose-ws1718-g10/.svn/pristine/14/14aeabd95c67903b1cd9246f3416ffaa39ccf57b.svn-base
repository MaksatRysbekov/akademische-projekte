package gui_pack;
import javax.swing.*;

/**
 * Using this class we show a riddle in AlertBox with inputs and buttons 'ok' or 'cancel'. And after that return answer
 * @author Savchuk Dmytro
 * @version 0.1 (December 2017)
 */
public class AlertBox {

    private String title = "";
    private String message = "";
    private String answer = "";

    public AlertBox(){}

    /**
     *
     * @param title - title of AlertBox("Solve the Riddle")
     * @param message - riddle
     */
    public AlertBox(String title, String message){
        this.title = title;
        this.message = message;
    }

    /**
     * Show Frame AlertBox
     */
    public void show(){
        JFrame frame = new JFrame("Riddle");
        this.answer = JOptionPane.showInputDialog(
                frame,
                this.message,
                this.title,
                JOptionPane.INFORMATION_MESSAGE
        );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public String getAnswer() {
        return answer;
    }
}