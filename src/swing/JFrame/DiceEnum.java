package swing.JFrame;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public enum DiceEnum {

	Dice1("image/�ֻ���1.jpg"),
	Dice2("image/�ֻ���2.jpg"),
	Dice3("image/�ֻ���3.jpg"),
	Dice4("image/�ֻ���4.jpg"),
	Dice5("image/�ֻ���5.jpg"),
	Dice6("image/�ֻ���6.jpg");

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
