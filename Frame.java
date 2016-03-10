import java.awt.*; 
import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Graphics;

public class Frame extends JFrame implements ActionListener {

	JFrame myFrame;
	JButton btnPlay;
	public Frame() {

		myFrame = new JFrame("TicTacToe");
		myFrame.setSize(200, 200);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   	myFrame.setVisible(true);

   	btnPlay = new JButton("Play");
   	myFrame.add(btnPlay);
   	btnPlay.addActionListener(this);


	}

	public static void main(String[] args) {
		new Frame();
	}

	@Override
   public void actionPerformed(ActionEvent evt) {
      myFrame.remove(btnPlay);
      myFrame.setSize(300, 325);
      myFrame.add(new Game());
   }
}