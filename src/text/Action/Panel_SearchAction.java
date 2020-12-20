package text.Action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;

import project.controller.CustomCheck_Controller;
import project.controller.Custom_Select_Controller;
import text.panelSearch;

public class Panel_SearchAction implements ActionListener{

	Container card_panel;
	Vector rowData;
	JTextField textSearch;
	JTable table;
	public Panel_SearchAction(Container card_panel,Vector rowDate, JTextField textSearch, JTable table) {
		this.card_panel = card_panel;
		this.rowData = rowData;
		this.textSearch = textSearch;
		this.table = table;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = panelSearch.dtm.getRowCount() - 1; i >= 0; i--) {
			panelSearch.dtm.removeRow(i);
		}
		new Custom_Select_Controller().Custom_Card_select(textSearch.getText());
		new Custom_Select_Controller().Custom_Name_Select(textSearch.getText());
		rowData = new Vector();
		ArrayList<String> custom_info = new ArrayList<String>();
		for(int i = 0; i < Custom_Select_Controller.mo.size();) {
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
			System.out.println("iÀÇ ¼ö" + i);
			if (i != 0 && i % 9 == 0) {
				panelSearch.dtm.addRow(rowData);
				rowData = new Vector();
				continue;
			}
			panelSearch.dtm.addRow(rowData);
		}
		custom_info.addAll(Custom_Select_Controller.mo);
		Custom_Select_Controller.mo.removeAll(custom_info);
		table.revalidate();
		table.repaint();
		}
	}
