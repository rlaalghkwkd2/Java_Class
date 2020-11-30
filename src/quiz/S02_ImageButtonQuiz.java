package quiz;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.prism.Image;

import oracle.jdbc.AdditionalDatabaseMetaData;

public class S02_ImageButtonQuiz extends JFrame {

	// kakao1.png를 이용해 12개의 버튼을 생성해보시오

	public S02_ImageButtonQuiz() {

		String path = "C:\\Users\\seunghwan\\Pictures\\Saved Pictures\\KakaoTalk_20201127_104414652.png";
		try {

			int x = 0;
			int y = 0;
			
			int Width = 120;
			int Height = 123;

			BufferedImage image = ImageIO.read(new File(path));

			System.out.println("원본 : " + image.getWidth() + "x" + image.getHeight());
			BufferedImage croppedImage = image.getSubimage(0, 0, Width, Height);
			System.out.println("수정본: " + croppedImage.getWidth() + "x" + croppedImage.getHeight());

			JButton[] jbut = new JButton[12];
//			while (true) {
//				JButton btn = new JButton(new ImageIcon(image.getSubimage(x, y, Width, Height)));
//				btn.setBounds(x, y, Width, Height);
//				add(btn);
//				x+= Width;
//				count++;
//				if (count == 6) {
//					y = Height;
//					x = 0;
//					continue;
//				} else if (count == 12) {
//					break;
//				}
//
//			}
			

		            
		            
			for (int i = 0; i < jbut.length; i++) {
				
				jbut[i] = new JButton(new ImageIcon(image.getSubimage(x, y, Width,Height)));
				jbut[i].setBounds(x, y, Width, Height);
				add(jbut[i]);
				x += Width;
				
				if(i == 5) {
					x = 0;
					y = Height;
				continue;
				}else if (i == 12) {
					break;
				}
			}
			

			setLayout(null);
			setLocationRelativeTo(null);
			setSize(735, 285);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// kakao1.png를 이용해 12개의 버튼을생ㄱ성햅호세요

	public static void main(String[] args) {

		new S02_ImageButtonQuiz();

	}
}
