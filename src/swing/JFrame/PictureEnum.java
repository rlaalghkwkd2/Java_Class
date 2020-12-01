package swing.JFrame;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public enum PictureEnum { // 여긴 오케이
	APPLE("사과", "image/사과.jpg"),
	BANANA("바나나", "image/바나나.jpg"),
	PENGUIN("펭귄", "image/펭귄.jpg");

	String kName;
	String img_path; 
	Image image;
	
	PictureEnum(String kName,  String img_path) {
		this.kName = kName;
		this.img_path = img_path;
		try {
			this.image = ImageIO.read(new File(img_path));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
