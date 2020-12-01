package swing.JFrame;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public enum PictureEnum {

	APPLE("���", "image/���.jpg"),
	BANANA("�ٳ���", "image/�ٳ���.jpg"),
	PENGUIN("���", "image/���.jpg");

	String kName;
	String img_path;
	Image image;
	
	PictureEnum(String kName, String img_path) {
		this.kName = kName;
		this.img_path = img_path;
		try {
			this.image = ImageIO.read(new File(img_path));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
