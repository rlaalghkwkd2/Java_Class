package project.swing.Action;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.controller.Custom_black_Controller;
import project.swing_view.Custom_Black_Delete_View;
import project.swing_view.Custom_Black_Input_View;
import project.swing_view.Custom_Delete_View;
import project.swing_view.Custom_Select_View;
import project01.panelCustomCheck;
import project01.contoller.Custom_Select_Controller;


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
		// 블랙등록할떄 조회 // 정보 조회 // 회원삭제시 조회
		ArrayList<String> text = new ArrayList<String>();
		ArrayList<String> custom_info = new ArrayList<String>();
		ArrayList<String> custom_info_copy = new ArrayList<String>();
		ArrayList<String> copy = new ArrayList<String>();
		
		if(number == 0){
		this.tTitle =  Custom_Select_View.tTitle;
		this.textarea = Custom_Select_View.textarea;
		Custom_Select_View.textarea.setText("");	
		}else if(number == 1) {
		this.tTitle = Custom_Black_Input_View.tTitle;
		this.textarea = Custom_Black_Input_View.textarea;
		Custom_Black_Input_View.textarea.setText("");
		}else if(number == 2) {
		this.tTitle = Custom_Delete_View.tTitle;
		this.textarea = Custom_Delete_View.textarea;
		Custom_Delete_View.textarea.setText("");
		System.out.println("조회" +tTitle.getText());
		}else if(number == 3) {
			this.tTitle = panelCustomCheck.textCardSearch;
		}
				
		new Custom_Select_Controller().Custom_Card_select(tTitle.getText());
//		new Custom_Select_Controller().showCheck(tTitle.getText());		
		new Custom_Select_Controller().Custom_Name_Select(tTitle.getText());		
				
		text.add("[고객 ID]: ");
		text.add("[고객 이름]: ");
		text.add("[고객 나이]: ");
		text.add("[고객 성별]: ");
		text.add("[고객 폰번호]: ");
		text.add("[고객 이메일]: ");
		text.add("[고객 주소]: ");
		text.add("[고객 카드번호]: ");
		text.add("[Black status]: ");
		System.out.println(Custom_Select_Controller.mo.size());
		System.out.println("카드" + Custom_Select_Controller.c_card + "이름" + Custom_Select_Controller.c_name);
		
		
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
		
		
		
//		if(copy.size() == 0) {
//			
//			Custom_Select_View.textarea.setForeground(Color.RED);
//			Custom_Select_View.textarea.setBackground(Color.black);
//			Custom_Select_View.textarea.setFont(new Font("고딕", Font.BOLD, 11));
//			Custom_Select_View.textarea.setText("존재하지 않는 회원입니다!\n(다시입력해주세요)");
//			
//		}else {
//			Custom_Select_View.textarea = new JTextArea();
//		}
		
	
		custom_info_copy.addAll(Custom_Select_Controller.mo);
		Custom_Select_Controller.mo.removeAll(custom_info_copy);
		
	}
}
