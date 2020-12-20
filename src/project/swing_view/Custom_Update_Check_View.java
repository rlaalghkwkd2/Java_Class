package project.swing_view;

import java.awt.BorderLayout;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project.method.SwingTools_p;
import project.swing.Action.Custom_Updatd_SelectAction;
import project.swing.Action.Select_btnAction;

public class Custom_Update_Check_View extends JFrame{
	public static JTextField cardNumber = new JTextField(20);
	JButton checkbtn = new JButton("확인");
	
	public void update() {
		
		
		JLabel jl1 = new JLabel("회원 정보를 수정할 카드번호 입력",JLabel.CENTER);
		
		
		JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		
		jl1.setBounds(95, 0, 200, 50);
		cardNumber.setBounds(95, 50, 200, 25);
		
		JPanel p1 = new JPanel();
		p1.setOpaque(false);
		p1.setLayout(null);
		
		p1.add(cardNumber);	
		p1.add(jl1);
		south.setOpaque(false);		
		south.add(checkbtn);
		
		add(p1, BorderLayout.CENTER);
		add(south,BorderLayout.SOUTH);
		
		checkbtn.addActionListener(new Custom_Updatd_SelectAction(p1)); 
		checkbtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();			
			}
		});
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setLocation(800, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Custom_Update_Check_View().update();
	}
}
