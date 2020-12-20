package project.swing.Action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import project.controller.Custom_Update_Controller;
import project.swing_view.Custom_Update_Check_View;
import project.swing_view.Custom_Update_View;

public class Update_btnAction implements ActionListener{

	Container card_panel;
	
	public Update_btnAction(Container card_panel) {
		this.card_panel = card_panel;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Custom_Update_Controller().Custom_Modify(Custom_Update_Check_View.cardNumber.getText());
	System.out.println("¼öÁ¤");
	}
}
