package swing;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Button_test_owner extends JFrame {


	ArrayList<JLabel> imgsum;
	public Button_test_owner() throws IOException {

		
		
		JButton jbut01 = new JButton("버튼");

		
	
			ImageIcon im01= 
					new ImageIcon(ImageIO.read(new File("image/사과.jpg"))
							.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
			ImageIcon im02 = 
					new ImageIcon(ImageIO.read(new File("image/바나나.jpg"))
							.getScaledInstance(100, 100, Image.SCALE_SMOOTH));

			JLabel label01 = new JLabel(im01);
			add(jbut01);
			add(label01);
			
			
			jbut01.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(label01.getIcon() == im01) {
						label01.setIcon(im02);
					}else {
						label01.setIcon(im01);
					}
					
				}
			});
			
			
			jbut01.setBounds(150, 0, 100, 50);
			label01.setBounds(150, 0, 100, 250);
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(500, 500);
			setLocation(700, 200);
			setVisible(true);

		

	}

	public static void main(String[] args) throws IOException {

		new Button_test_owner();

	}
}
