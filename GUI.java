import java.awt.Frame;  // Using Frame class in package java.awt
import java.awt.*;
import java.awt.event.*;
import java.awt.Button;

// A GUI program is written as a subclass of Frame - the top-level container
// This subclass inherits all properties from Frame, e.g., title, icon, buttons, content-pane
public class GUI extends Frame implements ActionListener {
 	private Button btnPlay;

   // Constructor to setup the GUI components
   public GUI() { 
      btnPlay = new Button("Play");
      add(btnPlay);
      btnPlay.addActionListener(this);
   	setTitle("TicTacToe");
   	setSize(100, 100);
   	setVisible(true);
   }

   // Other methods

   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor (to setup the GUI) by allocating an instance
      new GUI();
   }

   @Override
   public void actionPerformed(ActionEvent evt) {
      setSize(450, 350);
      removeAll();
   }
}

