package quiz;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class classddw extends JFrame{

	public classddw() {
		try {
	         String path = "C:\\\\Users\\\\seunghwan\\\\Pictures\\\\Saved Pictures\\\\KakaoTalk_20201127_104414652.png";
	         BufferedImage image = ImageIO.read(new File(path));

	         System.out.println("Original Image Dimension: " + image.getWidth() + "x" + image.getHeight());
	         BufferedImage croppedImage = image.getSubimage(0, 0, 120, 123);
	         System.out.println("Cropped Image Dimension: " + croppedImage.getWidth() + "x" + croppedImage.getHeight());

	         int img_Width = 120;
	         int img_Height = 123;
	         int x = 0;
	         int y = 0;
	         JButton[] button = new JButton[12];
	         int count = 0;
	         for (int i = 0; i < 12; i++) {
	            if (count < 6) {
	               img_Height = 113;
	               button[i] = new JButton(new ImageIcon(image.getSubimage(x, y, img_Width, img_Height)));
	               button[i].setBounds(x, y, img_Width, img_Height);
	               add(button[i]);
	               x += 120;
	               count++;
	            } else {
	               if(count==6) {
	                  img_Height = 133;
	                  x = 0;
	                  y = 113;
	               }
	               button[i] = new JButton(new ImageIcon(image.getSubimage(x, y, img_Width, img_Height)));
	               button[i].setBounds(x, y, img_Width, img_Height);
	               add(button[i]);
	               x += 120;
	               count++;
	            }
	         }
	         setLayout(null);
	         setLocationRelativeTo(null);
	         setSize(1000, 1000);
	         setVisible(true);
	         setDefaultCloseOperation(EXIT_ON_CLOSE);

	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }

	   public static void main(String[] args) {
	      new classddw();
	   }
	}
	

