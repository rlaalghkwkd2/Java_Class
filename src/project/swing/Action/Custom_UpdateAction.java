package project.swing.Action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.controller.Custom_Controller;
import project.controller.Custom_UpdatdAction_Controller;
import project.swing_view.Custom_Black_Input_View;
import project.swing_view.Custom_Delete_View;
import project.swing_view.Custom_Select_View;
import project.swing_view.test2;

public class Custom_UpdateAction implements ActionListener{

	Container card_panel;
	JTextField cardNumber;
	
	JTextField Tname = new JTextField(10);
	JTextField Tage = new JTextField(5);
	JTextField Tgender = new JTextField(5);
	JCheckBox sgender[] = new JCheckBox[2];
	String genders[] = { "남", "여" };
	JTextField Temail = new JTextField(30);
	JTextField Ttel = new JTextField(20);
	JTextField taddr = new JTextField(50);


	
	public Custom_UpdateAction(Container card_panel) {
		this.card_panel = card_panel;
	}	
	@Override
	public void actionPerformed(ActionEvent e) {

		ArrayList<String> custom_info = new ArrayList<String>();
		ArrayList<String> custom_info_copy = new ArrayList<String>();
		
		this.cardNumber = test2.cardNumber;
		
		JTextField Tname = new JTextField(10);
		JTextField Tage = new JTextField(5);
		JTextField Tgender = new JTextField(5);
		JCheckBox sgender[] = new JCheckBox[2];
		String genders[] = { "남", "여" };
		JTextField Temail = new JTextField(30);
		JTextField Ttel = new JTextField(20);
		JTextField taddr = new JTextField(50);
		String splTel;
		JButton inbtn = new JButton("등록");
		JButton rebtn = new JButton("취소");
		
		
		new Custom_UpdatdAction_Controller().Custom_Update_Action(cardNumber.getText());
		Tname.setText(Custom_UpdatdAction_Controller.mo.get(0));
		Tage.setText(Custom_UpdatdAction_Controller.mo.get(1));
		Tgender.setText(Custom_UpdatdAction_Controller.mo.get(2));
		Temail.setText(Custom_UpdatdAction_Controller.mo.get(3));
		Ttel.setText(Custom_UpdatdAction_Controller.mo.get(4));
		taddr.setText(Custom_UpdatdAction_Controller.mo.get(5));
		

			
			
	
		custom_info_copy.addAll(Custom_UpdatdAction_Controller.mo);
		Custom_UpdatdAction_Controller.mo.removeAll(custom_info_copy);
		
	}

}
