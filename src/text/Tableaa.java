package text;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

public class Tableaa extends JFrame{
	
	JTable table = new JTable();
	
	static String brr[][] = new String[10][10];
	String data [][] = {
						{"101","���","15000"},
						{"102","����","12000"}
						};
	String column[] = {"��ȣ","��å","����"};
	JTable jt = new JTable(data,column);
	JButton b = new JButton("Ŭ��");
	JTextField a = new JTextField(20);
	JTextField c = new JTextField(20);
	public void aa() {
		JFrame f = this;
		jt.setCellSelectionEnabled(true);
		ListSelectionModel select = jt.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		select.addListSelectionListener(new ListSelectionListener() {		
			@Override
			public void valueChanged(ListSelectionEvent e) {
				String Data = null;
				int[] row = jt.getSelectedRows();
				int[] columns = jt.getSelectedColumns();
				for(int i = 0; i < row.length; i++) {
					for(int j = 0; j < columns.length; j++) {
						Data = (String)jt.getValueAt(row[i], columns[j]);
					}
				}
				JOptionPane.showMessageDialog(f, "���õ�" + Data + "�Դϴ�");
				
			}
		});
		b.setBounds(100, 100, 100, 100);
		a.setBounds(50, 50, 50, 50);
		c.setBounds(30, 30, 30, 30);
		b.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
						
						String brr[][] = {{a.getText(),c.getText()}};
						System.out.println(brr[0][0] + brr[0][1]);
					}
			
		});
		JScrollPane sp = new JScrollPane(jt);
//		add(b);
		add(sp);
//		add(a);
//		add(c);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		public static void main(String[] args) {
			new Tableaa().ss();
//		 String  a= "��";
//		 String b = "��";
//		 String c= "��";
//		 
//			for(int i = 0; i< 1; i++) {
//				for(int j = 0; j < 3; j++) {
//					brr[i][j] = "di";
//					System.out.println(brr[0][1] + brr[0][2]);
//				}
				
//			}
		
		
			}
		
		public void ss() {
			
			setBounds(600, 400, 300, 200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 10, 260, 141);
			panel.add(scrollPane);
			
			table = new JTable();
			scrollPane.setViewportView(table);
			
			// 2-2. ���񿭸� ���� �߰� ��, 1�� ���ڵ��� Vector ��ü�� ������ �߰��ϴ� ���
			Vector<String> columnNames = 
					new Vector<String>(Arrays.asList("��ȣ", "�̸�", "����"));
			// ���� Vector ��ü�� DefaultTableModel ��ü�� �߰� => ���ȣ 0���� ����
			DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
			
			// 1�� ���ڵ带 Vector ��ü�� �߰�
			Vector rowData = new Vector();
			rowData.add(1);
			rowData.add("ȫ�浿");
			rowData.add(20);
			
			// DefaultTableModel ��ü�� addRow() �޼��带 ����ϸ� 1�� ���ڵ� �߰�
			dtm.addRow(rowData);
			
			rowData = new Vector();
			rowData.add(2);
			rowData.add("�̼���");
			rowData.add(44);
			
			// DefaultTableModel ��ü�� addRow() �޼��带 ����ϸ� 1�� ���ڵ� �߰�
			dtm.addRow(rowData);
			
			// JTable �� DefaultTableModel ��ü �߰�
			table.setModel(dtm);
			
			
			setVisible(true);
		}
			
		
		}
	
	
		

