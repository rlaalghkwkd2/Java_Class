package project01;

import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.sun.rowset.internal.Row;


import project01.Action.Panel_Check_Numer_Action;
import project01.Action.Panel_Check__Card_Action;
import project01.contoller.CustomTable_Select_Controller;
import project01.contoller.Custom_Select_Controller;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;

public class panelCustomCheck extends JPanel {
	
	private Image img_logo = new ImageIcon(Frame01.class.getResource("res/search.jpg")).getImage().getScaledInstance(65,
			26, Image.SCALE_SMOOTH);
	
	public static Vector<String> columnNames = new Vector<String>(
			Arrays.asList("결제번호", "신발이름", "신발재고", "신발사이즈", "신발가격", "신발구매일", "포인트 잔액", "신발 시리얼번호", "신발ID"));
	public static DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
	public static JTable table = new JTable(dtm);
	Vector rowData;
	public static JTextField textCardSearch = new JTextField(20);  
	public static JTextField textNameSearch = new JTextField(20);

	public panelCustomCheck() {
		ListSelectionModel select = table.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		dtm = new DefaultTableModel(columnNames, 0) {
//			public boolean isCellEditable(int row, int column) {
//				 row = table.getSelectedRow();
//				 column = table.getSelectedColumn();
//				return false;
//			}
//		};
		
		
		setBackground(new Color(255, 160, 122));
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
	
		setBounds(0, 0, 807, 533);
		setLayout(null);

		
		textCardSearch.setBounds(69, 122, 250, 26);
		add(textCardSearch);

		JButton btnCardSearch = new JButton(new ImageIcon(img_logo));
		btnCardSearch.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		btnCardSearch.setBounds(331, 122, 35, 26);
		add(btnCardSearch);

		JScrollPane scrollPane =new JScrollPane();
		scrollPane.setBounds(12, 158, 783, 363);
		add(scrollPane);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		btnCardSearch.addActionListener(new Panel_Check__Card_Action(this, rowData));
		textCardSearch.addActionListener(new Panel_Check__Card_Action(this, rowData));
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(new Color(255, 245, 238));
		panelTitle.setBounds(2, 2, 803, 69);
		add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uAD6C\uB9E4\uB0B4\uC5ED \uC870\uD68C");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 779, 49);
		panelTitle.add(lblNewLabel);
		
		
		textNameSearch.setBounds(468, 122, 250, 26);
		add(textNameSearch);
		
		JButton btnNameSearch = new JButton(new ImageIcon(img_logo));
		btnNameSearch.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		btnNameSearch.setBounds(730, 122, 35, 26);
		add(btnNameSearch);
		textNameSearch.addActionListener(new Panel_Check_Numer_Action(this, rowData));
		btnNameSearch.addActionListener(new Panel_Check_Numer_Action(this, rowData));
		
		
		JLabel lblnameSearch = new JLabel("\uACB0\uC81C\uBC88\uD638:");
		lblnameSearch.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		lblnameSearch.setBounds(409, 123, 57, 26);
		add(lblnameSearch);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uCE74\uB4DC\uBC88\uD638:");
		lblNewLabel_1_1.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(12, 123, 57, 26);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u203B\uCE74\uB4DC\uBC88\uD638\uB85C \uBA3C\uC800 \uC0C1\uD488\uC744 \uC870\uD68C\uD574\uC8FC\uC2DC\uAE30\uBC14\uB78D\uB2C8\uB2E4.");
		lblNewLabel_2.setFont(new Font("휴먼편지체", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(12, 81, 278, 20);
		add(lblNewLabel_2);
	}
}
