package project.swing.Action;

import java.awt.Container;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import project.controller.Custom_Controller;
import project.controller.Custom_black_Controller;
import project.swing_view.Custom_Black_Input_View;

public class Black_Insert_CardAction implements ActionListener{
	
	Container card_panel;
	JTextField tTitle;
	String card;
	
	public Black_Insert_CardAction(Container card_panel) {
		this.card_panel = card_panel;
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.tTitle = Custom_Black_Input_View.tTitle;
		card = this.tTitle.getText();
		new Custom_Controller().Custom_Card_select(card);
		new Custom_black_Controller().black_CardInsert(card);
		
		
	}

	
	
}
