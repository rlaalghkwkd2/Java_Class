package project01;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import project01.Action.Panel_Search_Action;
import project01.contoller.Custom_Deletes_Controller;
import project01.contoller.Custom_Select_Controller;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class panelCustomDelete extends JPanel {
	private Image img_logo = new ImageIcon(Frame01.class.getResource("res/search.jpg")).getImage().getScaledInstance(65,
			26, Image.SCALE_SMOOTH);
	public static JTextField textSearch = new JTextField(20);
	static Vector<String> columnNames = new Vector<String>(
			Arrays.asList("번호", "이름", "나이", "성별", "핸드폰", "이메일", "주소", "카드번호", "블랙유무"));
	public static DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
	JTable table = new JTable(dtm);
	Vector rowData;


	public panelCustomDelete() {
		
	
		setBackground(new Color(255, 160, 122));
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(0, 0, 807, 533);
		setLayout(null);
		
		textSearch = new JTextField();	
		textSearch.setBounds(12, 124, 250, 26);
		add(textSearch);
		
		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(12, 160, 783, 41);
		
		add(scrollpane);
		table.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		scrollpane.setViewportView(table);
		
		JButton btnSearch = new JButton(new ImageIcon(img_logo));
		btnSearch.addActionListener(new Panel_Search_Action(this, rowData, textSearch, table));
		btnSearch.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		btnSearch.setBounds(263, 124, 35, 26);
		add(btnSearch);
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Custom_Deletes_Controller().Delete(textSearch.getText());
				for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
					dtm.removeRow(i);
					textSearch.setText("");				
				}					
			}
		});
		btnDelete.setBounds(722, 497, 65, 26);
		add(btnDelete);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(new Color(255, 245, 238));
		panelTitle.setBounds(2, 2, 803, 69);
		add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uC815\uBCF4 \uC0AD\uC81C \uBC0F \uB4F1\uB85D\uD574\uC81C");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 779, 49);
		panelTitle.add(lblNewLabel);
		btnSearch.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				infoTable();		
			}
		});
		
	
		table.setCellSelectionEnabled(true);
		ListSelectionModel select = table.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		dtm = new DefaultTableModel(columnNames, 0) {
//			public boolean isCellEditable(int row, int column) {
//				 row = table.getSelectedRow();
//				 column = table.getSelectedColumn(); 
//				return false;
//			}
//		};
		
	}

	public void infoTable() {
		new Custom_Select_Controller().Custom_Card_select(textSearch.getText());
		ArrayList<String> custom_info = new ArrayList<String>();
		for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
			dtm.removeRow(i);
		}
		
		rowData = new Vector();
		for (int i = 0; i < Custom_Select_Controller.mo.size();) {
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			rowData.add(Custom_Select_Controller.mo.get(i));
			i++;
			dtm.addRow(rowData);
		}
		custom_info.addAll(Custom_Select_Controller.mo);
		Custom_Select_Controller.mo.removeAll(custom_info);
		table.revalidate();
		table.repaint();
		
		
	}
}
