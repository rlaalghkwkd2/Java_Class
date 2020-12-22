package project.swing.Action;

import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.swing_view.Custom_Black_Input_View;
import project.swing_view.Custom_Delete_View;
import project.swing_view.Custom_Select_View;
import project.swing_view.Custom_Update_Check_View;
import project.swing_view.Custom_Update_View;
import project01.contoller.Custom_Select_Controller;


public class Custom_Updatd_SelectAction implements ActionListener{

	Container card_panel;
	JTextField tTitle;
	
	
	public Custom_Updatd_SelectAction(Container card_panel) {
		this.card_panel = card_panel;
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
	this.tTitle = Custom_Update_Check_View.cardNumber;
	new Custom_Select_Controller().Custom_Card_select(tTitle.getText());
	String sage = Custom_Select_Controller.c_age+"";
	new Custom_Update_View(
			Custom_Select_Controller.c_name,
			sage,
			Custom_Select_Controller.c_gender,
			Custom_Select_Controller.c_email,
			Custom_Select_Controller.c_phone,
			Custom_Select_Controller.c_addr).Custm_Input();
	System.out.println("수정할 회원 정보 값 불러오기 성공!");
	}


}
