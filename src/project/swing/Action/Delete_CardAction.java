package project.swing.Action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import project.controller.Custom_Deletes_Controller;
import project.swing_view.Custom_Delete_View;

public class Delete_CardAction implements ActionListener{
	Container card_panel;
	JTextField tTitle;
	String card;
	
	public Delete_CardAction(Container card_panel) {
		this.card_panel = card_panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	this.tTitle  = Custom_Delete_View.tTitle;
	card = this.tTitle.getText();
	new Custom_Deletes_Controller().Delete(card);		
	}
	
}
