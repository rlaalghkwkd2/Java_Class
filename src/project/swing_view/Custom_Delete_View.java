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
import project.swing.Action.Delete_CardAction;
import project.swing.Action.Select_btnAction;

public class Custom_Delete_View extends JFrame{

	
	public static JTextField tTitle = new JTextField(17);
	public static JTextArea textarea = new JTextArea(10, 23);
	
	
	public void Custom_Drop() {
		JButton btn = new JButton("삭제");
		JButton sbtn = new JButton("조회");
		JButton rebtn = new JButton("취소");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
	
		setTitle("회원 삭제");

		p1.setOpaque(false);
		p1.setLayout(new FlowLayout());
		p2.add(new JLabel("회원 삭제", JLabel.CENTER));
	
	
		p1.add(tTitle);	
		p1.add(sbtn);
		p1.add(new JScrollPane(textarea));		
		
		jp.add(btn);
		jp.add(rebtn);
		add(p2, BorderLayout.NORTH);	
	
		add(p1, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);
			
		btn.addActionListener(new Delete_CardAction(p1)); // 삭제
		sbtn.addActionListener(new Select_btnAction(p1));
		rebtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		}); 	

	SwingTools_p.initTestFrame(this);
		
	}
	
	
	public static void main(String[] args) {
		new Custom_Delete_View().Custom_Drop();
	}
	
}
