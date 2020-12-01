package swing.JFrame;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PictureLabel extends JLabel{

	public PictureLabel(PictureEnum picture) {		//여도 오케이
		super(new ImageIcon(picture.image
				.getScaledInstance(400, 400, Image.SCALE_AREA_AVERAGING)));
	}
	
	
}
