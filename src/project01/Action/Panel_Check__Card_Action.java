package project01.Action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.sun.org.apache.xml.internal.security.Init;

import project.swing_view.Custom_Select_View;
import project01.panelCustomCheck;
import project01.contoller.CustomTable_Select_Controller;
import project01.contoller.Custom_Select_Controller;

public class Panel_Check__Card_Action implements ActionListener {

	Container card_panel;
	JTextField tTitle;
	Vector rowData;
	public Panel_Check__Card_Action(Container card_panel, Vector rowData) {
		this.card_panel = card_panel;
		this.rowData = rowData;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> custom_info = new ArrayList<String>();
		ArrayList<String> custom_info_copy = new ArrayList<String>();
		this.tTitle = panelCustomCheck.textCardSearch;
		new CustomTable_Select_Controller().ShowCustom(tTitle.getText());

		for (int i = 0; i < CustomTable_Select_Controller.mo.size(); i++) {
			custom_info.add(CustomTable_Select_Controller.mo.get(i));
		}

		System.out.println(CustomTable_Select_Controller.mo.size());
		System.out.println("ī��" + CustomTable_Select_Controller.name + "�̸�" + CustomTable_Select_Controller.count);
		System.out.println("������" +custom_info);
			
				
			for(int i = panelCustomCheck.dtm.getRowCount() -1; i>=0; i--) {
				panelCustomCheck.dtm.removeRow(i);
			}
		
			rowData = new Vector();
			for(int i = 0; i < custom_info.size();) {
			System.out.println("i�� ��" + i);
			rowData.add(CustomTable_Select_Controller.mo.get(i));
			i++;
			rowData.add(CustomTable_Select_Controller.mo.get(i));
			i++;
			rowData.add(CustomTable_Select_Controller.mo.get(i));
			i++;
			rowData.add(CustomTable_Select_Controller.mo.get(i));
			i++;
			rowData.add(CustomTable_Select_Controller.mo.get(i));
			i++;
			rowData.add(CustomTable_Select_Controller.mo.get(i));
			i++;
			rowData.add(CustomTable_Select_Controller.mo.get(i));
			i++;
			rowData.add(CustomTable_Select_Controller.mo.get(i));
			i++;
			rowData.add(CustomTable_Select_Controller.mo.get(i));
			i++;
			
			if(i != 0 && i%9 == 0) {
				panelCustomCheck.dtm.addRow(rowData);
				rowData = new Vector();
				continue;
			}
			panelCustomCheck.dtm.addRow(rowData);
		}
		panelCustomCheck.table.revalidate();
		panelCustomCheck.table.repaint();
	
		custom_info_copy.addAll(CustomTable_Select_Controller.mo);
		CustomTable_Select_Controller.mo.removeAll(custom_info_copy);

		
	}
}
