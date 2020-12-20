package text;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import project.controller.Custom_black_Controller;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panelBlackDelete extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public panelBlackDelete() {
		setBounds(0, 0, 807, 533);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB4F1\uB85D\uB41C \uD68C\uC6D0 \uC870\uD68C");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 702, 75);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(217, 150, 267, 34);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Custom_black_Controller().BlackDelete(textField.getText());
			}
		});
		btnNewButton.setBounds(450, 101, 97, 23);
		add(btnNewButton);
	}
}
