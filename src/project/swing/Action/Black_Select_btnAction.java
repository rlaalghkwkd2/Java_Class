package project.swing.Action;

import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.controller.Custom_Controller;
import project.controller.Custom_black_Controller;
import project.swing_view.Custom_Select_View;


public class Black_Select_btnAction implements ActionListener{

	Container card_panel;
	JTextField tTitle;
	JTextArea textarea;
	public Black_Select_btnAction(Container card_panel) {
			this.card_panel = card_panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<String> text = new ArrayList<String>();
		ArrayList<String> custom_info = new ArrayList<String>();
		ArrayList<String> custom_info_copy = new ArrayList<String>();
		
		this.tTitle =  Custom_Select_View.tTitle;
		this.textarea = Custom_Select_View.textarea;
		
		new Custom_black_Controller().Custom_black_select(tTitle.getText());
		new Custom_Controller().Custom_Name_Select(tTitle.getText());
		
		Custom_Select_View.textarea.setText("");
		text.add("[堅偌 ID]: ");
		text.add("[堅偌 檜葷]: ");
		text.add("[堅偌 釭檜]: ");
		text.add("[堅偌 撩滌]: ");		
		text.add("[堅偌 ア廓�β: ");
		text.add("[堅偌 檜詭橾]: ");
		text.add("[堅偌 輿模]: ");
		text.add("[堅偌 蘋萄廓�β: ");
		
		for(int i = 0; i < Custom_Controller.mo.size(); i++) {
			custom_info.add(text.get(i%8)+Custom_Controller.mo.get(i));
		}
		for(int j = 0; j < custom_info.size(); j++) {	
			if(j%8 == 0 && j != 0) {
				textarea.append("式式式式式式式式式式式式式式式式式式式式\n");
			}
			tTitle.setText(custom_info.get(j));			
			String stext = tTitle.getText();
			textarea.append(stext + "\n");
			tTitle.setText("");		
	}
		custom_info_copy.addAll(Custom_Controller.mo);
		Custom_Controller.mo.removeAll(custom_info_copy);
		
	}			
}
		


