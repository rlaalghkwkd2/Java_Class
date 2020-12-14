package project.swing.Action;

import java.awt.Container;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.controller.Custom_Controller;
import project.controller.Custom_black_Controller;
import project.swing_view.Custom_Black_Delete_View;
import project.swing_view.Custom_Black_Input_View;
import project.swing_view.Custom_Delete_View;
import project.swing_view.Custom_Select_View;
import project.swing_view.test;
import project.swing_view.test2;


public class Select_btnAction implements ActionListener{

	Container card_panel;
    JTextField tTitle;
	JTextArea textarea;
	int number;
	
	public Select_btnAction(Container card_panel, int number) {
		this.number = number;
		this.card_panel = card_panel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// ������ҋ� ��ȸ // ���� ��ȸ // ȸ�������� ��ȸ
		ArrayList<String> text = new ArrayList<String>();
		ArrayList<String> custom_info = new ArrayList<String>();
		ArrayList<String> custom_info_copy = new ArrayList<String>();
		
		if(number == 0){
		this.tTitle =  Custom_Select_View.tTitle;
		this.textarea = Custom_Select_View.textarea;
		}else if(number == 1) {
		this.tTitle = Custom_Black_Input_View.tTitle;
		this.textarea = Custom_Black_Input_View.textarea;
		}else if(number == 2) {
		this.tTitle = Custom_Delete_View.tTitle;
		this.textarea = Custom_Delete_View.textarea;
		System.out.println("��ȸ" +tTitle.getText());
		}
				
		new Custom_Controller().Custom_Card_select(tTitle.getText());
		new Custom_Controller().Custom_Name_Select(tTitle.getText());		
		
		
		
		Custom_Select_View.textarea.setText("");		
		text.add("[�� ID]: ");
		text.add("[�� �̸�]: ");
		text.add("[�� ����]: ");
		text.add("[�� ����]: ");
		text.add("[�� ����ȣ]: ");
		text.add("[�� �̸���]: ");
		text.add("[�� �ּ�]: ");
		text.add("[�� ī���ȣ]: ");
		
		for (int i = 0; i < Custom_Controller.mo.size(); i++) {
			custom_info.add(text.get(i%8)+Custom_Controller.mo.get(i));
		}	
		for(int j = 0; j < custom_info.size(); j++) {	
			if(j%8 == 0 && j != 0) {
				textarea.append("����������������������������������������\n");
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
