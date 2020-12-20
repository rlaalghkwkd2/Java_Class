package project.swing.Action;

import java.awt.Container;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.controller.Custom_black_Controller;
import project.swing_view.Custom_Black_Delete_View;
import project.swing_view.Custom_Select_View;


public class Black_Select_btnAction implements ActionListener{

	Container card_panel;
	JTextField tTitle;
	JTextArea textarea;
	public Black_Select_btnAction(Container card_panel) {
			this.card_panel = card_panel;
	}
 // �� ��ȸ
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<String> text = new ArrayList<String>();
		ArrayList<String> custom_info = new ArrayList<String>();
		ArrayList<String> custom_info_copy = new ArrayList<String>();
		
		this.tTitle =  Custom_Black_Delete_View.tTitle;
		this.textarea = Custom_Black_Delete_View.textarea;
		
		new Custom_black_Controller().black_select(tTitle.getText());		
		Custom_Black_Delete_View.textarea.setText("");
		text.add("[�� ID]: ");
		text.add("[�� �̸�]: ");
		text.add("[�� ����]: ");
		text.add("[�� ����]: ");		
		text.add("[�� ����ȣ]: ");
		text.add("[�� �̸���]: ");
		text.add("[�� �ּ�]: ");
		text.add("[�� ī���ȣ]: ");
		text.add("[����]: ");
		text.add("[�����]: ");
		
		
		
		for(int i = 0; i < Custom_black_Controller.mo.size(); i++) {
			custom_info.add(text.get(i%10)+Custom_black_Controller.mo.get(i));
		}
		for(int j = 0; j < custom_info.size(); j++) {	
			if(j%10 == 0 && j != 0) {
				textarea.append("����������������������������������������\n");
			}
			tTitle.setText(custom_info.get(j));			
			String stext = tTitle.getText();
			textarea.append(stext + "\n");
			tTitle.setText("");		
	}
		custom_info_copy.addAll(Custom_black_Controller.mo);
		Custom_black_Controller.mo.removeAll(custom_info_copy);
		
	}			
}
		


