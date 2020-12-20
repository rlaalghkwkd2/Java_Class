package text;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import project.controller.Custom_Select_Controller;
import project.controller.Custom_black_Controller;
import project.swing_view.Custom_Black_Input_View;



public class BlackInbtn implements ActionListener{
	Container card_panel;
	JTextField tTitle;
	String card;
	
	public BlackInbtn(Container card_panel) {
		this.card_panel = card_panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.tTitle = panelBlackIn.textcard;	
		card = this.tTitle.getText();
		
		new Custom_Select_Controller().Custom_Card_select(card);
		new Controller().black_CardInsert(card);
		System.out.println("블랙리스트 등록 완료");
		
		
		panelBlackIn.reason.setText("");
		panelBlackIn.textcard.setText("");
		
		
		
		new JLabel("블랙리스트 정상 등록 완료!");
		
	}

}
