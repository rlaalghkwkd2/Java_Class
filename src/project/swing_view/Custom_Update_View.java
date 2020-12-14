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

import project.controller.Custom_Controller;
import project.method.SwingTools_p;
import project.swing.Action.Delete_CardAction;
import project.swing.Action.Select_btnAction;

public class Custom_Update_View extends JFrame{

	public static JTextField tTitle = new JTextField(17);
	public static JTextField tTitle1 = new JTextField(17);
	public static JTextField tTitle2 = new JTextField(17);
	public static JTextField tTitle3 = new JTextField(17);
	public static JTextField tTitle4 = new JTextField(17);
	public static JTextField tTitle5 = new JTextField(17);
	public static JTextField tTitle6 = new JTextField(17);
//	public static JTextArea textarea = new JTextArea(10, 23);
	
	
	public void Custom_update() {
		JButton btn = new JButton("수정");
		JButton sbtn = new JButton("조회");
		JButton rebtn = new JButton("취소");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
	
		setTitle("회원 삭제");

		p1.setOpaque(false);
		p1.setLayout(new FlowLayout());
		p2.add(new JLabel("회원 삭제<카드 번호>", JLabel.CENTER));
	
	
		p1.add(tTitle);	
		p1.add(tTitle1);	
		p1.add(tTitle2);	
		p1.add(sbtn);
//		p1.add(new JScrollPane(textarea));		
		
		jp.add(btn);
		jp.add(rebtn);
		
		add(p2, BorderLayout.NORTH);		
		add(p1, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);
			
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Custom_Controller().Custom_Modify(tTitle.getText(), tTitle1.getText(), tTitle2.getText());
				
			}
		});
//		sbtn.addActionListener(new Select_btnActio4n(p1, 2));
		rebtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		}); 	

	SwingTools_p.initTestFrame(this);
		
	}
	
	
	public static void main(String[] args) {
		new Custom_Update_View().Custom_update();
	}
	
}
