package swing.JFrame;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class DiceLabel extends JLabel{

	public DiceLabel(DiceEnum dice) {
		super(new ImageIcon(dice.image.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
	
	}
	
	}
	

