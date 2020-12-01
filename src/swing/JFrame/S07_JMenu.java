package swing.JFrame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import swing.SwingTools;
import swing.btn.actions.FirstCardBtnAcction;





public class S07_JMenu extends JFrame{
	

	
	public S07_JMenu() throws IOException {
		
		
		Container c = this.getContentPane();
		
		JButton btn = new JButton();
		
		JPanel center_panel = new JPanel(new CardLayout(10, 10));		
		JPanel center_panel2 = new JPanel(new CardLayout(10, 10));		
		JPanel center_panel3 = new JPanel(new CardLayout(10, 10));		
		JPanel center_panel4 = new JPanel(new CardLayout(10, 10));		
		JPanel center_panel5 = new JPanel(new CardLayout(10, 10));	
		
		JPanel center_panel6 = new JPanel(new CardLayout(10, 10));		
		JPanel center_panel7 = new JPanel(new CardLayout(10, 10));		
		JPanel center_panel8 = new JPanel(new CardLayout(10, 10));		
		
		
		
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
	
		JMenu sub_menu = new JMenu("µ¿¹°");
		JMenuItem i1, i2, i3, i4, i5;
		JMenuItem si1, si2, si3;
		
		
		// °¢ ¸Þ´º¸¦ ¼±ÅÃÇÏ¸é Ä«µå ·¹ÀÌ¾Æ¿ôÀÇ »çÁøÀÌ ¹Ù²îµµ·Ï ¸¸µé¾îº¸¼¼¿ä
		i1 = new JMenu("Apple");
		i2 = new JMenu("Banana");
		i3 = new JMenu("kiwi");
		i4 = new JMenu("peach");
		i5 = new JMenu("Orange");
		
		si1 = new JMenu("ÆëÄý");
		si2 = new JMenu("ÄÚ³¢¸®");
		si3 = new JMenu("»çÀÚ");
		
		
		
//		menu.setFont(new Font("±¼¸²", Font.ROMAN_BASELINE,20));
		
		menu.add(sub_menu);
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		menu.add(i5);
		
		sub_menu.add(si1);
		sub_menu.add(si2);
		sub_menu.add(si3);		
		
		bar.add(menu);
		this.setJMenuBar(bar);
		
		this.setLayout(new BorderLayout(0, 0));
		this.add(center_panel, BorderLayout.CENTER);
		
		i1.addActionListener(new FirstCardBtnAcction(center_panel));
		i2.addActionListener(new FirstCardBtnAcction(center_panel));
		i3.addActionListener(new FirstCardBtnAcction(center_panel));
		i4.addActionListener(new FirstCardBtnAcction(center_panel));
		i5.addActionListener(new FirstCardBtnAcction(center_panel));
		

		si1.addActionListener(new FirstCardBtnAcction(center_panel));			
		si2.addActionListener(new FirstCardBtnAcction(center_panel));			
		si3.addActionListener(new FirstCardBtnAcction(center_panel));			
			
		
		
		center_panel.add("apple", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/»ç°ú.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));

		center_panel2.add("Banana", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/¹Ù³ª³ª.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));	
		
		center_panel3.add("kiwi", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/Å°À§.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));
	
		center_panel4.add("peach", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/º¹¼þ¾Æ.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));
		
		center_panel5.add("Orange", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/¿À·»Áö.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));
		
		center_panel6.add("Æë±Ï", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/Æë±Ï.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));
		
		center_panel7.add("ÄÚ³¢¸®", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/ÄÚ³¢¸®.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));
		
		center_panel8.add("»çÀÚ", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/»çÀÚ.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));
		
		
	i1.add(center_panel);
	i2.add(center_panel2);
	i3.add(center_panel3);
	i4.add(center_panel4);
	i5.add(center_panel5);
	
	si1.add(center_panel6);
	si2.add(center_panel7);
	si3.add(center_panel8);
	

	SwingTools.initTestFrame(this);
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		new S07_JMenu();
		
	}
}
