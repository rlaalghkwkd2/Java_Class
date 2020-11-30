package quiz;

import java.awt.Color;

import java.awt.Dimension;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Image;

import oracle.jdbc.AdditionalDatabaseMetaData;

public class S02_ImageButtonQuiz_Onwer extends JFrame {

	// kakao1.png를 이용해 12개의 버튼을 생성해보시오

	ArrayList<JButton> btns;
	final static int image_cols = 6;
	final static int image_rows = 2;
	
	public S02_ImageButtonQuiz_Onwer() {
		btns = new ArrayList<>(image_cols * image_rows);
		
		try {
			BufferedImage source = ImageIO.read(
					new File("C:\\Users\\seunghwan\\Pictures\\Saved Pictures\\KakaoTalk_20201127_104414652.png")
					);
			
		
			
			System.out.println("이미지 전체 너비 : " + source.getWidth());
			System.out.println("이미지 전체 높이 : " + source.getHeight());
			
			System.out.println("각 이미지 너비 : " + source.getWidth() / image_cols);
			System.out.println("각 이미지 높이 : " + source.getHeight() / image_rows);
			
			
			int btn_width = source.getWidth() / image_cols;
			int btn_height = source.getHeight() / image_rows;
			
			
			for(int col = 0; col < image_cols; col++) {				
				for(int row = 0; row < image_rows; row++) {
					java.awt.Image cropped_image 
						= source.getSubimage(
							col * btn_width,
							row * btn_height,
							btn_width,
							btn_height);
					JButton btn = new JButton();
					
					int randomSize = (int)(Math.random() *31 + 50);
					int random_x = (int)(Math.random() * (1000 - randomSize));
					int random_y = (int) (Math.random() * (1000 - randomSize));
					
					
					btn.setBackground(new Color(0x8affe8));
					btn.setSize(randomSize, randomSize);
					btn.setLocation(random_x, random_y);
					
					// getScaledInstance
					btn.setIcon(new ImageIcon(
		                    cropped_image.getScaledInstance(randomSize, randomSize, Image.SCALE_SMOOTH)));
							
					
					
					btns.add(btn);
					
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
		
		for(JButton btn : btns) {
			add(btn);
		}
		
		
		
	}

	// kakao1.png를 이용해 12개의 버튼을생ㄱ성햅호세요

	public static void main(String[] args) {

		new S02_ImageButtonQuiz_Onwer();

	}
}
