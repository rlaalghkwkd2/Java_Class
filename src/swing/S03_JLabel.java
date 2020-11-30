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
		
		
		// ��������: ��ư�� �ϳ� �߰��ϰ�, �� ��ư�� ������ ��� �׸��� �ٳ����� ���ϵ��� ������ (�ٽô����� ����� �ȴ�)
		
		
		// JLabel : �ؽ�Ʈ, �׸����� ���� �� �մ� ������Ʈ
		JLabel lavel01 = new JLabel("Hello, java gui!!");
		JLabel label02 = new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\seunghwan\\Pictures\\Saved Pictures\\KakaoTalk_20201127_104414652.png")
				).getScaledInstance(100, 100, Image.SCALE_SMOOTH)
				)
				);
		
		label02.setBackground(Color.black);
		
		lavel01.setBounds(50, 50, 400 , 250);
		label02.setBounds(50, 120, 300, 300);
		
		
		
		// ������Ʈ���� (JFrame ��)�۲� ����
		lavel01.setFont(new Font("Courier",Font.PLAIN , 35));	
		
		// label02�� �׵θ� �߰�
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
