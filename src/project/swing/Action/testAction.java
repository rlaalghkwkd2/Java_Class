package project.swing.Action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import project.controller.Custom_Controller;
import project.swing_view.test2;

public class testAction implements ActionListener{

	Container card_panel;
	 JTextField tTitle;
	 
	 
	 public testAction(Container card_panel) {
		 this.card_panel = card_panel;
	}
	 
	 
	@Override
	public void actionPerformed(ActionEvent e) {

		this.tTitle = test2.cardNumber;
		new Custom_Controller().Custom_Card_select(tTitle.getText());
		System.out.println("¾ß");
	}
	
	
}
