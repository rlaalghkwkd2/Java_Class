package project.swing.Action;

import java.awt.Container;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.swing_view.Custom_Select_View;
import project01.contoller.Custom_Select_Controller;

public class Select_textAction implements ActionListener{
	JTextField tTitle;
	JTextArea textarea;	
	Container card_panel;
	
	public Select_textAction(Container card_panel) {	
		this.card_panel = card_panel;	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<String> text = new ArrayList<String>();
		ArrayList<String> custom_info = new ArrayList<String>();
		ArrayList<String> custom_info_copy = new ArrayList<String>();
		
		this.tTitle =  Custom_Select_View.tTitle;
		this.textarea = Custom_Select_View.textarea;	
		
		new Custom_Select_Controller().Custom_Card_select(tTitle.getText());
		new Custom_Select_Controller().Custom_Name_Select(tTitle.getText());
		
		Custom_Select_View.textarea.setText("");
		text.add("[고객 ID]: ");
		text.add("[고객 이름]: ");
		text.add("[고객 나이]: ");
		text.add("[고객 성별]: ");		
		text.add("[고객 폰번호]: ");
		text.add("[고객 이메일]: ");
		text.add("[고객 주소]: ");
		text.add("[고객 카드번호]: ");
		text.add("[Black status]: ");
				
		
		if(Custom_Select_Controller.mo.size() == 0){
			Custom_Select_View.textarea.setText("존재하지 않는 회원입니다");
		}
		
		for (int i = 0; i < Custom_Select_Controller.mo.size(); i++) {
			custom_info.add(text.get(i%9)+Custom_Select_Controller.mo.get(i));
		}	
		for(int j = 0; j < custom_info.size(); j++) {	
			if(j%9 == 0 && j != 0) {
				textarea.append("────────────────────\n");
			}
			tTitle.setText(custom_info.get(j));
			String stext = tTitle.getText();
			textarea.append(stext + "\n");
			tTitle.setText("");		
			}
	
		custom_info_copy.addAll(Custom_Select_Controller.mo);
		Custom_Select_Controller.mo.removeAll(custom_info_copy);
		}
	}
