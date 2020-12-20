package text;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.sun.rowset.internal.Row;

import project.controller.CustomCheck_Controller;
import project.controller.Custom_Select_Controller;
import project.swing.Action.Chack_btn;
import project.swing.Action.Select_btnAction;

import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class panelCustomCheck extends JPanel {
	
	public static JTextField tTitle = new JTextField(20);
	public static Vector<String> columnNames = new Vector<String>(
			Arrays.asList("신발이름", "신발재고", "신발사이즈", "신발가격", "신발구매일", "포인트잔액"));
	public static DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
	public static JTable table = new JTable(dtm);
	Vector rowData;

	public panelCustomCheck() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
	
		setBounds(0, 0, 807, 533);
		setLayout(null);

		tTitle.setBounds(12, 109, 250, 26);
		add(tTitle);

		JButton btnNewButton = new JButton("조회");
		btnNewButton.setBounds(280, 108, 60, 26);
		add(btnNewButton);

		JScrollPane scrollPane =new JScrollPane();
		scrollPane.setBounds(12, 158, 783, 363);
		add(scrollPane);
		scrollPane.setViewportView(table);

		btnNewButton.addActionListener(new Chack_btn(this, rowData));
		tTitle.addActionListener(new Chack_btn(this, rowData));
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(Color.GRAY);
		panelTitle.setBounds(2, 2, 803, 69);
		add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uAD6C\uB9E4\uB0B4\uC5ED \uC870\uD68C");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 779, 49);
		panelTitle.add(lblNewLabel);
	}
}
