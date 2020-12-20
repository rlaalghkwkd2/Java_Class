package text;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import project.controller.Custom_Deletes_Controller;
import project.controller.Custom_Select_Controller;
import text.Action.Panel_SearchAction;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class panelCustomDelete extends JPanel {
	
	public static JTextField textSearch = new JTextField(20);
	static Vector<String> columnNames = new Vector<String>(
			Arrays.asList("번호", "이름", "나이", "성별", "핸드폰", "이메일", "주소", "카드번호", "블랙유무"));
	public static DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
	JTable table = new JTable(dtm);
	Vector rowData;


	public panelCustomDelete() {
		setBounds(0, 0, 807, 533);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC0AD\uC81C");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 807, 64);
		add(lblNewLabel);
		
		textSearch = new JTextField();	
		textSearch.setBounds(12, 110, 250, 26);
		add(textSearch);
		
		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(12, 160, 783, 41);
		
		add(scrollpane);
		scrollpane.setViewportView(table);
		
		JButton btnSearch = new JButton("\uC870\uD68C");
		btnSearch.addActionListener(new Panel_SearchAction(this, rowData, textSearch, table));
		btnSearch.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 13));
		btnSearch.setBounds(274, 108, 73, 26);
		add(btnSearch);
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Custom_Deletes_Controller().Delete(textSearch.getText());
				for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
					dtm.removeRow(i);
					textSearch.setText("");				
				}	
				
			}
		});
		btnDelete.setBounds(722, 497, 73, 26);
		add(btnDelete);
		
		
		
		
		
		btnSearch.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				infoTable();		
			}
		});
		
	
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
