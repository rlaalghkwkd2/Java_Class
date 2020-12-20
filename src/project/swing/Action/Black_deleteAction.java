package project.swing.Action;

import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import project.controller.Custom_Select_Controller;
import project.controller.Custom_black_Controller;
import project.swing_view.Custom_Black_Delete_View;
import project.swing_view.Custom_Black_Input_View;

public class Black_deleteAction implements ActionListener{

	Container card_panel;
	JTextField tTitle;
	String card;
	
	public Black_deleteAction(Container card_panel) {
		this.card_panel = card_panel;
	}
	// 블랙 해제
	@Override
	public void actionPerformed(ActionEvent e) {
		this.tTitle = Custom_Black_Delete_View.tTitle;
		card = this.tTitle.getText();
		new Custom_black_Controller().BlackDelete(card);
		new Custom_Select_Controller().Custom_Card_select(card);
		System.out.println("블랙리스트 해제 완료!");
		
		Custom_Black_Delete_View.tTitle.setText("");
		Custom_Black_Delete_View.textarea.setText("");
	}
	
	
}
