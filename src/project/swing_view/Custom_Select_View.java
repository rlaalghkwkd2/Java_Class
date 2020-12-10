package project.swing_view;

import java.awt.BorderLayout;





import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.swing.Action.Select_btnAction;
import project.swing.Action.Select_textAction;
import sun.launcher.resources.launcher;
import swing.SwingTools;


public class Custom_Select_View extends JFrame {

	public static JTextField tTitle = new JTextField(23);
	public static JTextArea textarea = new JTextArea(10, 23);
	JButton btn = new JButton("조회");
	JButton rebtn = new JButton("취소");
	
	public void Custom_search_info() {		
		JPanel p1 = new JPanel();		
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));		
		tTitle.addActionListener(new Select_textAction(p1));
				
		setTitle("회원정보 조회");
		p1.setOpaque(false);
		p1.setLayout(new FlowLayout());		
		p1.add(new JLabel("조회하실 회원의 이름 or 카드 번호 입력", JLabel.CENTER));
				
		p1.add(tTitle);	
		p1.add(new JScrollPane(textarea));	
			
		jp.add(btn);		
		jp.add(rebtn);
		
		add(p1, BorderLayout.CENTER);		
		add(jp, BorderLayout.SOUTH);
		
		btn.addActionListener(new Select_btnAction(p1));		
		rebtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		}); 	

		setSize(400, 350);
		setLocation(900, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Custom_Select_View().Custom_search_info();
	}

}
