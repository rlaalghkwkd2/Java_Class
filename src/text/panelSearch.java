package text;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import project.controller.CustomCheck_Controller;
import project.controller.Custom_Select_Controller;
import text.Action.Panel_SearchAction;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class panelSearch extends JPanel {

	 private JTextField textSearch = new JTextField(20);
	static Vector<String> columnNames = new Vector<String>(
			Arrays.asList("번호", "이름", "나이", "성별", "핸드폰", "이메일", "주소", "카드번호", "블랙유무"));
	public static DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
	JTable table = new JTable(dtm);
	Vector rowData;
	private final JPanel panelTitle = new JPanel();
	private final JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC870\uD68C");

	public panelSearch() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));

		setBounds(0, 0, 807, 533);
		setLayout(null);

		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(12, 158, 783, 363);
		add(scrollpane);
		table.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 13));
		scrollpane.setViewportView(table);
		textSearch.addActionListener(new Panel_SearchAction(this, rowData, textSearch, table));
		textSearch.setBounds(12, 122, 250, 26);
		add(textSearch);

		JButton btnNewButton = new JButton("\uC870\uD68C");
		btnNewButton.addActionListener(new Panel_SearchAction(this, rowData, textSearch, table));

		btnNewButton.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 13));
		btnNewButton.setBounds(278, 122, 73, 26);
		add(btnNewButton);
		panelTitle.setBackground(Color.GRAY);
		panelTitle.setBounds(2, 2, 803, 69);

		add(panelTitle);
		panelTitle.setLayout(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 783, 49);

		panelTitle.add(lblNewLabel);
		ShowTable();
	}

	public void ShowTable() {
		new Custom_Select_Controller().allSelect();
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
			if (i != 0 && i % 9 == 0) {
				dtm.addRow(rowData);
				rowData = new Vector();
				continue;
			}
			dtm.addRow(rowData);
		}
		custom_info.addAll(Custom_Select_Controller.mo);
		Custom_Select_Controller.mo.removeAll(custom_info);
		table.revalidate();
		table.repaint();
	}

}
