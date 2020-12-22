package project.swing.Action;

import java.awt.Container;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import project.controller.Custom_black_Controller;
import project.swing_view.Custom_Black_Input_View;
import project01.panelBlackIn;
import project01.contoller.Custom_Select_Controller;

public class Black_Insert_CardAction implements ActionListener{
	
	Container card_panel;
	JTextField tTitle;
	String card;
	 // 블랙 등록
	public Black_Insert_CardAction(Container card_panel) {
		this.card_panel = card_panel;
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.tTitle = Custom_Black_Input_View.tTitle;
		
		
		card = this.tTitle.getText();
		
		new Custom_Select_Controller().Custom_Card_select(card);
		new Custom_black_Controller().black_CardInsert(card);
		System.out.println("블랙리스트 등록 완료");
		
		
		Custom_Black_Input_View.reason.setText("");
		Custom_Black_Input_View.tTitle.setText("");
		Custom_Black_Input_View.textarea.setText("");
		
		
		new JLabel("블랙리스트 정상 등록 완료!");
		
	}

	
	
}
