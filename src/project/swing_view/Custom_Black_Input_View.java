package project.swing_view;

import java.awt.BorderLayout;



import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import project.method.SwingTools_p;
import project.swing.Action.Black_Insert_CardAction;
import project.swing.Action.Select_btnAction;
import project.swing.Action.Select_textAction;

public class Custom_Black_Input_View extends JFrame{
	
	public static JTextField tTitle = new JTextField(17);
	public static JTextArea textarea = new JTextArea(10, 23);
	public static JTextField reason = new JTextField(15);
	
	public void Black_Input() {
		JButton btn = new JButton("���");
		JButton sbtn = new JButton("��ȸ");
		JButton rebtn = new JButton("���");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
	JLabel j1 = new JLabel("�� ����: ");
	j1.setBounds(10, 50, 100, 430);
	reason.setBounds(89, 255, 255, 20);	
	textarea.setEditable(false);
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
		
//		tTitle.addActionListener(new Black_Insert_CardAction(p1));
		setTitle("������Ʈ ���");

		p1.setOpaque(false);
		p1.setLayout(new FlowLayout());
		p2.add(new JLabel("BlackList���", JLabel.CENTER));
		
		p1.add(tTitle);	
		p1.add(sbtn);
		p1.add(new JScrollPane(textarea));
			
		jp.add(btn);
		jp.add(rebtn);
		add(j1);
		add(reason);
		add(p2, BorderLayout.NORTH);	
		
		add(p1, BorderLayout.CENTER);
		
		add(jp, BorderLayout.SOUTH);
			
		btn.addActionListener(new Black_Insert_CardAction(p1));
		sbtn.addActionListener(new Select_btnAction(p1 ,1));
		rebtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		}); 	

	SwingTools_p.initTestFrame(this);
	}
	
	public static void main(String[] args) {
		new Custom_Black_Input_View().Black_Input();
	}

}
