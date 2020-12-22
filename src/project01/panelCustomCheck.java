package project01;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.sun.rowset.internal.Row;

import project.swing.Action.Select_btnAction;
import project01.Action.Panel_Check_Action;
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

public class panelCustomCheck extends JPanel {
	
	private Image img_logo = new ImageIcon(Frame01.class.getResource("res/search.jpg")).getImage().getScaledInstance(65,
			26, Image.SCALE_SMOOTH);
	public static JTextField tTitle = new JTextField(20);  
	
	public static Vector<String> columnNames = new Vector<String>(
			Arrays.asList("신발이름", "신발재고", "신발사이즈", "신발가격", "신발구매일", "포인트잔액"));
	public static DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
	public static JTable table = new JTable(dtm);
	Vector rowData;

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

		
		tTitle.setBounds(12, 122, 250, 26);
		add(tTitle);

		JButton btnNewButton = new JButton(new ImageIcon(img_logo));
		btnNewButton.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		btnNewButton.setBounds(274, 121, 65, 26);
		add(btnNewButton);

		JScrollPane scrollPane =new JScrollPane();
		scrollPane.setBounds(12, 158, 783, 363);
		add(scrollPane);
		table.setEnabled(false);
		scrollPane.setViewportView(table);

		btnNewButton.addActionListener(new Panel_Check_Action(this, rowData));
		tTitle.addActionListener(new Panel_Check_Action(this, rowData));
		
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
	}
}
