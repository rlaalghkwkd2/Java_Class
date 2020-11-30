package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S03_JLabel extends JFrame{

	
	public S03_JLabel() throws IOException {
		
		
		// 연습문제: 버튼을 하나 추가하고, 그 버튼을 누르면 사과 그림이 바나나로 변하도록 만들어보기 (다시누르면 사과가 된다)
		
		
		// JLabel : 텍스트, 그림등을 적을 수 잇는 컴포넌트
		JLabel lavel01 = new JLabel("Hello, java gui!!");
		JLabel label02 = new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\seunghwan\\Pictures\\Saved Pictures\\KakaoTalk_20201127_104414652.png")
				).getScaledInstance(100, 100, Image.SCALE_SMOOTH)
				)
				);
		
		label02.setBackground(Color.black);
		
		lavel01.setBounds(50, 50, 400 , 250);
		label02.setBounds(50, 120, 300, 300);
		
		
		
		// 컴포턴트들의 (JFrame 등)글꼴 설정
		lavel01.setFont(new Font("Courier",Font.PLAIN , 35));	
		
		// label02에 테두리 추가
//				label01.setBorder(BorderFactory.createLineBorder(Color.RED, 3, true));
				
		
		add(lavel01);
		add(label02);
		
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(700, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) throws IOException {
		
		new S03_JLabel();
		
	}
	
}
