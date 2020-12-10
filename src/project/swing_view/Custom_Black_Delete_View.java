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
import project.swing.Action.Black_Select_btnAction;
import project.swing.Action.Black_deleteAction;
import project.swing.Action.Select_btnAction;

public class Custom_Black_Delete_View extends JFrame{

	public static JTextField tTitle = new JTextField(17);
	public static JTextArea textarea = new JTextArea(10, 23);
	
	
	public void Black_Delete() {
		JButton btn = new JButton("해제");
		JButton sbtn = new JButton("조회");
		JButton rebtn = new JButton("취소");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
		setTitle("블랙리스트 해제");

		p1.setOpaque(false);
		p1.setLayout(new FlowLayout());
		p2.add(new JLabel("BlackList  해제", JLabel.CENTER));

		p1.add(tTitle);	
		p1.add(sbtn);
		p1.add(new JScrollPane(textarea));
		
		jp.add(btn);
		jp.add(rebtn);
		add(p2, BorderLayout.NORTH);	
		add(p1, BorderLayout.CENTER);		
		add(jp, BorderLayout.SOUTH);
		
		btn.addActionListener(new Black_deleteAction(p1));
		sbtn.addActionListener(new Black_Select_btnAction(p1));
		rebtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		}); 	
		
		SwingTools_p.initTestFrame(this);
	}
	
	public static void main(String[] args) {
		new Custom_Black_Delete_View().Black_Delete();
	}
	
}
