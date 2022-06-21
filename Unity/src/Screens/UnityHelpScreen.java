package Screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Utility.Assets;

//Suppress serial warnings
@SuppressWarnings("serial")
public class UnityHelpScreen extends JFrame implements ActionListener {

	JButton backButton = new JButton("Back");

	// The constructor method of this class
	public UnityHelpScreen() {
		frameSetup();
		buttonSetup();
	}
	
	private void buttonSetup() {
		backButton.setBounds(45, 20, 100, 30);
		backButton.setBackground(Color.ORANGE);
		backButton.addActionListener(this);
		add(backButton);
	}
	

	//This method sets up the frame
	private void frameSetup() {
		
		//Set the title and frame size
		setTitle("Unity");
		setSize(1280, 720);
		setLayout(null);
		setContentPane(new JLabel(Assets.helpBackground));
		
		//Prevent the program from running when the frame is closed, prevent the 
		//frame from being resized, and make the frame visible
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

	}

	// This is the acitonPerformed class where it takes action of each button in
	// this screen.
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == backButton) {
			new UnityLoginScreen();
			this.dispose();
		}
		
	}
	
}

