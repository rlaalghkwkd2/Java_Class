package swing;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Button_test extends JFrame {

	final static String[] paths = { "C:\\Users\\seunghwan\\Pictures\\Saved Pictures\\apple.jpg",
			"C:\\Users\\seunghwan\\Pictures\\Saved Pictures\\banana.jpg" };

	// 경로를 이용해 ArrayList에 미리 ImageIcon들을 만들어 놓는다
	final static ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();

	static {
		for (String path : paths) {
			setImgeIcon(path);
		}
	}

	private static void setImgeIcon(String path) {
		try {
			images.add(new ImageIcon(ImageIO.read(new File(path)).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private int curr_image = 0;

	public Button_test() {
		JLabel label01 = new JLabel(images.get(curr_image));
		JButton change_btn = new JButton("Change!");
		
		
		// label02에 테두리 추가
		label01.setBorder(BorderFactory.createLineBorder(Color.RED, 3, true));
		
		JFrame myframe = this;
		
		change_btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				label01.setIcon(images.get(++curr_image % images.size()));
				myframe.getContentPane().setBackground(Color.black);
			
			}
		});
		
		
		change_btn.setBounds(170, 0, 100, 50);
		label01.setBounds(125, 60, 200, 200);
		
		add(change_btn);
		add(label01);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(800, 700);
		setVisible(true);
	}

	public static void main(String[] args) throws IOException {

		new Button_test();

	}
}
