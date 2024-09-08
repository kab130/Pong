
import java.awt.Color;

import javax.swing.JFrame;

public class Pong extends JFrame {
	
	public Pong() {
		String windowTitle = "Pong";
		int windowWidth = 800;
		int windowHeight = 600;
		
		setTitle(windowTitle);
		setSize(windowWidth, windowHeight);
		setResizable(true);
		add(new PongPanel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
			 
	          public void run() {
	 
	                 new Pong();

	            
	 
	          }
	 
	        });
	}

}
