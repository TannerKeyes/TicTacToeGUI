import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.*; 
import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.Dimension;

public class Game extends JPanel {

	public static JFrame myFrame;

	public void paintComponent (Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawLine(100, 0, 100, 300);
      	g2.drawLine(200, 0, 200, 300);
     	g2.drawLine(0, 100, 300, 100);
      	g2.drawLine(0, 200, 300, 200);
      	g2.drawLine(300, 0, 300, 300);
	}

	public static void main(String[] args) {
		myFrame.add(new Game());
	}

}