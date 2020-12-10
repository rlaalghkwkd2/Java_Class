package swing.JFrame;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public enum DiceEnum {

	Dice1("image/주사위1.jpg"),
	Dice2("image/주사위2.jpg"),
	Dice3("image/주사위3.jpg"),
	Dice4("image/주사위4.jpg"),
	Dice5("image/주사위5.jpg"),
	Dice6("image/주사위6.jpg");

	String dice_img;
	public Image image;
	ImageIcon imageicon;
	
	DiceEnum(String dice_img) {
		
		this.dice_img = dice_img;
		try {
			this.image = ImageIO.read(new File(dice_img));
			this.imageicon = new ImageIcon(image.getScaledInstance(80, 80, Image.SCALE_SMOOTH));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Image getImage() {
		return image;
	}
	public ImageIcon getImageicon() {
		return imageicon;
	}
	
	

	
}
