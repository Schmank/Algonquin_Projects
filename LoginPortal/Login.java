/*This window lacks true functionality
 * Requires:-Name and password field
 * 			-ActionListener for login button (ties to database and checks to see if input id valid)
 * 			-Sign up button (To create account & send e-mail verification)
 * 			-"Tooltips" (for fun)*/


//This needs to be re-written in JavaFX rather than awt/swing

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Login extends JFrame {

	JButton login=new JButton("Login");
	JButton cancel=new JButton("Cancel");
	
	
	
	public Login(){
		
		loginBox();
	}
		
	//Just creates the login Window
	//No input is accepted yet
	public void loginBox(){
		
		//Creates buttons
		JButton login=new JButton("Login");
		JButton cancel=new JButton("Cancel");
		
		//Creates new window (vertical portion)
		JPanel logWindow=new JPanel();
		logWindow.setLayout(new BoxLayout(logWindow, BoxLayout.Y_AXIS));
		add(logWindow);
		
		
		logWindow.add(Box.createVerticalGlue()); //Creates invisible filler so there is space between components
		
		JPanel horzBox=new JPanel();
		horzBox.setAlignmentX(1f); //makes horzBox(bottom panel) right aligned
		horzBox.setLayout(new BoxLayout(horzBox, BoxLayout.X_AXIS));
		
		horzBox.add(login);
		horzBox.add(Box.createRigidArea(new Dimension(3, 0))); //Creates space between buttons
		horzBox.add(cancel);
		horzBox.add(Box.createRigidArea(new Dimension(13, 0)));
		
		logWindow.add(horzBox);
        logWindow.add(Box.createRigidArea(new Dimension(0, 13))); //Creates space between bottom panel(horzBox) and border of window
		
		//Sets listener to cancel button (exits)
		cancel.addActionListener(new CustomActionListener());
				
		
		//Sets the container(window) parameters
		setTitle("Site Login");
		setSize(300, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new Login();
	}
	
	//Should be in another class 
	class CustomActionListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	          System.exit(0);
	      }
	}
}
