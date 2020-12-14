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

import project.controller.Custom_Controller;
import project.controller.Custom_UpdatdAction_Controller;
import project.method.SwingTools_p;
import project.swing.Action.Select_btnAction;
import project.swing.Action.testAction;

public class test2 extends JFrame{
	public static JTextField cardNumber = new JTextField(20);
	JButton checkbtn = new JButton("확인");
	
	public void update() {
		
		
		JLabel jl1 = new JLabel("회원 정보를 수정할 카드번호 입력",JLabel.CENTER);
		
		
		JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		setTitle("야");
		
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
		
		checkbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			new Custom_Controller().Custom_Card_select(cardNumber.getText());
			String sage = Custom_Controller.c_age +"";
			new test(
					Custom_Controller.c_name,
					sage,
					Custom_Controller.c_gender,
					Custom_Controller.c_email,
					Custom_Controller.c_phone,
					Custom_Controller.c_addr).Coustm_Input();		
			System.out.println(Custom_Controller.c_gender);
			}
		});
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setLocation(800, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new test2().update();
	}
}
