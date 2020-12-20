package text;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import project.swing.Action.Black_Insert_CardAction;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class panelBlackIn extends JPanel {
	public static JTextField textcard = new JTextField(20);
	public static JTextField reason = new JTextField(20);

	public panelBlackIn() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(0, 0, 807, 533);
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uCE74\uB4DC\uBC88\uD638:");
		lblNewLabel_1.setBounds(12, 139, 64, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uB4F1\uB85D\uC0AC\uC720:");
		lblNewLabel_1_1.setBounds(12, 176, 64, 27);
		add(lblNewLabel_1_1);
		
		textcard.setBounds(78, 140, 250, 26);
		add(textcard);
	
		reason.setBounds(78, 177, 250, 26);
		add(reason);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 234, 783, 256);
		add(textArea);
		
		JButton btnNewButton = new JButton("µî·Ï");
		btnNewButton.addActionListener(new BlackInbtn(this));
	
	
		btnNewButton.setBounds(593, 500, 97, 23);
		add(btnNewButton);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(Color.GRAY);
		panelTitle.setBounds(2, 2, 803, 69);
		add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBE14\uB799\uD68C\uC6D0 \uB4F1\uB85D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 779, 49);
		panelTitle.add(lblNewLabel);
	}
}
