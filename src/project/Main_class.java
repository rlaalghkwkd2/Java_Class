package project;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import project.method.SwingTools_p;
import project.swing.Action.Delete_CardAction;
import project.swing_view.Custom_Delete_View;



public class Main_class extends JFrame{

public Main_class() {
	
	
		JButton b1 = new JButton("회원 등록");
		JButton b2 = new JButton("회원 삭제");
		JButton b3 = new JButton("회원 조회");
		JButton b4 = new JButton("회원 블랙 등록");
		JButton b5 = new JButton("블랙 해제");
		
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		setLayout(new FlowLayout(FlowLayout.LEFT,10,0));
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Custom_Delete_View().Custom_Drop();
				
			}
		});
		
		
		SwingTools_p.initTestFrame(this);
	
		}	
public static void main(String[] args) {
	new Main_class();
}
	
}
