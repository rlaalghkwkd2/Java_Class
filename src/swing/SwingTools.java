package swing;

import javax.swing.JFrame;

public class SwingTools {

	
	public static void initTestFrame(JFrame frame) {

		
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 350);
		frame.setLocation(700, 600);
		frame.setVisible(true);
	}
	
}
