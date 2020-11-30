package swing;


import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_JButton extends JFrame {


	public S02_JButton() {
		
		JButton button1 = new JButton("����������");
		JButton button2 = new JButton("CLICK ME!");
		JButton button3 = new JButton(new ImageIcon("C:\\Users\\seunghwan\\Pictures\\Saved Pictures\\600035c0e351085fced5e3473da3a147.jpg"));
		
		// ��ġ�� ũ�� ������ �ѹ��� �Ѵ�
		button1.setBounds(100, 100, 100, 50);
		button2.setBounds(100, 250, 150, 50);
		button3.setBounds(300, 200, 600, 600);
		
		// setTest : ������Ʈ�� �ؽ��� �����Ѵ�.
		button1.setText("ABCDEFG!");
		button2.setText("����������!");
		
		// setEnable : ��ư�� Ȱ��ȭ/ ��Ȱ��ȭ
		button1.setEnabled(true);
		button2.setEnabled(true);
		
		// ��ư�� �⺻���� �׼Ǹ����ʸ� ����
		ActionListener basic_btn_action = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �̺�Ʈ�� �߻����� �� �ش� �̺�Ʈ�� ������ �Ѱܹް� �ȴ�
				System.out.println("��ư�� ���ǽ��ϴ�!");
				
				System.out.println("������ư ����: " + e.getSource());
				
				JButton clicked_btn  = (JButton) e.getSource();
				
				System.out.println("���� ��ư�� �̸�: " + clicked_btn.getText());
				
			}
		};
		
		
		// ��ư�� �׼Ǹ����� �߰� (������ �ߵ�)
		//	- ActionListener �������̽��� ����ü�� ��ư�� �߰��� �� �մ�
		button1.addActionListener(basic_btn_action);
		button2.addActionListener(basic_btn_action);
		
		
		add(button1);
		add(button2);
		add(button3);
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(500, 100);
		setSize(950, 900);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		
		
		new S02_JButton();
		
		
	}
}
