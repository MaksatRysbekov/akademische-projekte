package gui_pack;


import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;


import java.awt.Font;

/**
 * GUI
 * @author Savchuk Dmytro
 * @version 0.1 (December 2017)
 */
public class View extends JFrame {

	public JLabel picture;

	public JButton btnUp;
	public JButton btnDown;
	public JButton btnLeft;
	public JButton btnRight;
	public JButton btnHelp;
	public JButton btnLoad;
	public JButton btnSave;
	public JButton btnBack;
	public JButton btnRun;
	public JFrame frame;

	// Map //////////////////
	public JButton corridor;
	public JButton castleGate;
	public JButton library;
	public JButton kitchen;
	public JButton princess;
	public JButton dragon;
	public JButton hallway;
	public JButton hall;


	public  JTextArea textArea = new JTextArea();
	public  JScrollPane scrollPane = new JScrollPane(textArea);
	public  JTextField textField;
	
	public DefaultListModel listItemsModel = new DefaultListModel();
	public JList listItems = new JList();

	public DefaultListModel bagModel = new DefaultListModel();
	public JList bag = new JList();

	public View() {
		textArea.setEditable(false);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		textArea.setBorder(BorderFactory.createCompoundBorder(border, 
		            BorderFactory.createEmptyBorder(5, 10, 0, 5)));

		frame = new JFrame();
		frame.setResizable(false);

		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1184, 612);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		scrollPane.setBounds(10,420,491,100);
		panel.add(scrollPane);

		picture = new JLabel("picture");
		picture.setBackground(Color.BLACK);
		picture.setBounds(10, 11, 491, 405);
		panel.add(picture);

		btnUp = new JButton("up");
		btnUp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnUp.setForeground(Color.BLUE);
		btnUp.setBounds(607, 420, 60, 25);
		panel.add(btnUp);

		btnDown = new JButton("down");
		btnDown.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDown.setForeground(Color.BLUE);
		btnDown.setBounds(607, 495, 60, 25);
		panel.add(btnDown);

		btnLeft = new JButton("left");
		btnLeft.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLeft.setForeground(Color.BLUE);
		btnLeft.setBounds(550, 456, 60, 25);
		panel.add(btnLeft);

		btnRight = new JButton("right");
		btnRight.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRight.setForeground(Color.BLUE);
		btnRight.setBounds(665, 456, 60, 25);
		panel.add(btnRight);

		btnHelp = new JButton("help");
		btnHelp.setForeground(Color.BLUE);
		btnHelp.setBounds(318, 562, 89, 23);
		panel.add(btnHelp);

		btnLoad = new JButton("load");
		btnLoad.setForeground(Color.BLUE);
		btnLoad.setBounds(208, 562, 89, 23);
		panel.add(btnLoad);

		btnSave = new JButton("save");
		btnSave.setForeground(Color.BLUE);
		btnSave.setBounds(109, 562, 89, 23);
		panel.add(btnSave);

		btnBack = new JButton("back");
		btnBack.setForeground(Color.BLUE);
		btnBack.setBounds(10, 562, 89, 23);
		panel.add(btnBack);

		panel.setBackground(new Color(63, 81, 181));

		listItems.setBounds(557, 33, 171, 182);
		panel.add(listItems);
		listItems.setModel(listItemsModel);

		textField = new JTextField();
		textField.setBounds(10, 531, 287, 20);
		panel.add(textField);
		textField.setColumns(10);
		

		bag.setBounds(557, 275, 171, 79);
		panel.add(bag);
		bag.setModel(bagModel);

		
		btnRun = new JButton("Run");
		btnRun.setForeground(Color.BLUE);
		btnRun.setBounds(318, 531, 183, 21);
		panel.add(btnRun);

		int width = 90;
		int height = 80;


		corridor = new JButton();
		corridor.setBackground(Color.pink);
		corridor.setBounds(974, 33, width, height);
		corridor.setText("Corridor");

		panel.add(corridor);
		
		castleGate = new JButton();
		castleGate.setBackground(Color.pink);
		castleGate.setBounds(945, 113, 150, 80);
		castleGate.setText("Castle Gate");
		panel.add(castleGate);

		library = new JButton();
		library.setBackground(Color.pink);
		library.setBounds(974, 273, width, height);
		library.setText("Library");
		panel.add(library);
		
		dragon = new JButton();
		dragon.setBackground(Color.pink);
		dragon.setBounds(1064, 33, width, height);
		dragon.setText("Dragon");
		panel.add(dragon);
		
		kitchen = new JButton();
		kitchen.setBackground(Color.pink);
		kitchen.setBounds(974, 193, width, height);
		kitchen.setText("Kitchen");
		panel.add(kitchen);
		
		hallway = new JButton();
		hallway.setBackground(Color.pink);
		hallway.setBounds(884, 273, width, height);
		hallway.setText("Hallway");
		panel.add(hallway);
		
		hall = new JButton();
		hall.setBackground(Color.pink);
		hall.setBounds(884, 353, width, height);
		hall.setText("Hall");
		panel.add(hall);

		princess = new JButton();
		princess.setBackground(Color.pink);
		princess.setBounds(794, 353, width, height);
		princess.setText("Princess");
		panel.add(princess);
		
		JLabel lblItemsInRoom = new JLabel("Items in Room");
		lblItemsInRoom.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblItemsInRoom.setForeground(Color.WHITE);
		lblItemsInRoom.setBounds(590, 11, 137, 14);
		panel.add(lblItemsInRoom);
		
		JLabel lblYourBag = new JLabel("Your Bag");
		lblYourBag.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYourBag.setForeground(Color.WHITE);
		lblYourBag.setBounds(607, 248, 105, 25);
		panel.add(lblYourBag);
		
		JLabel lblGo = new JLabel("Go");
		lblGo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGo.setForeground(Color.WHITE);
		lblGo.setBounds(625, 456, 35, 28);
		panel.add(lblGo);

		frame.setSize(1190,641);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public DefaultListModel getlistItemsModel() {
		return this.listItemsModel;
	}
	public DefaultListModel getBagModel() {
		return this.bagModel;
	}

}
