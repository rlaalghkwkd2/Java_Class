package project01.Action;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import project01.panelBlackDelete;
import project01.panelBlackIn;
import project01.panelSearch;
import project01.contoller.Black_Controller;
import project01.contoller.Custom_Select_Controller;

public class Panel_BlackDelete_SelectAction  implements ActionListener{
	Container card_panel;
	JTextField textSearch;
	JTextArea textarea;
	Vector rowData;
	JTable table;
	
	public Panel_BlackDelete_SelectAction(Container card_panel, Vector rowDate, JTextField textSearch, JTable table) {
		this.card_panel = card_panel;
		this.rowData = rowData;
		this.textSearch = textSearch;
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = panelBlackDelete.dtm.getRowCount() - 1; i >= 0; i--) {
			panelBlackDelete.dtm.removeRow(i);
		}
		new Black_Controller().BlackCard_Select(textSearch.getText());
		new Black_Controller().BlackName_Select(textSearch.getText());
		rowData = new Vector();
		ArrayList<String> custom_info = new ArrayList<String>();
		for(int i = 0; i < Black_Controller.mo.size();) {
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			rowData.add(Black_Controller.mo.get(i));
			i++;
			System.out.println("iÀÇ ¼ö" + i);
			if (i != 0 && i % 10 == 0) {
				panelBlackDelete.dtm.addRow(rowData);
				rowData = new Vector();
				continue;
			}
			panelBlackDelete.dtm.addRow(rowData);
		}
		custom_info.addAll(Black_Controller.mo);
		Black_Controller.mo.removeAll(custom_info);
		table.revalidate();
		table.repaint();
		
	}
	}

