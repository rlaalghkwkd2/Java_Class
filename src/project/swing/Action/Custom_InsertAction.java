package project.swing.Action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import project01.contoller.Custom_Registration_Controller;

public class Custom_InsertAction implements ActionListener{

	
	Container card_penel;
	JTextField name;
	JTextField age;
	JTextField gender;
	JTextField email;
	JTextField phone;
	JTextField addr;
	
	
	public Custom_InsertAction(Container card_penel, JTextField name, JTextField age, JTextField gender, JTextField email, JTextField phone, JTextField addr) {
		this.card_penel = card_penel;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.addr = addr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Custom_Registration_Controller().Custom_insert_create_table_info(
				this.name.getText(),
				Integer.parseInt(this.age.getText()),
				this.gender.getText(),				
				this.email.getText(),
				this.phone.getText(),
				this.addr.getText());
		
	}
}
