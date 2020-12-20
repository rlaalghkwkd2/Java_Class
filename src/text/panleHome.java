package text;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class panleHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public panleHome() {
		setBounds(0, 0, 807, 533);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(119, 59, 357, 137);
		add(panel);
	}
}
