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
						{"101","사원","15000"},
						{"102","부지","12000"}
						};
	String column[] = {"번호","직책","월급"};
	JTable jt = new JTable(data,column);
	JButton b = new JButton("클릭");
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
				JOptionPane.showMessageDialog(f, "선택도" + Data + "입니다");
				
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
//		 String  a= "야";
//		 String b = "오";
//		 String c= "이";
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
			
			// 2-2. 제목열만 먼저 추가 후, 1개 레코드의 Vector 객체를 별도로 추가하는 방법
			Vector<String> columnNames = 
					new Vector<String>(Arrays.asList("번호", "이름", "나이"));
			// 제목열 Vector 객체를 DefaultTableModel 객체에 추가 => 행번호 0으로 설정
			DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
			
			// 1개 레코드를 Vector 객체에 추가
			Vector rowData = new Vector();
			rowData.add(1);
			rowData.add("홍길동");
			rowData.add(20);
			
			// DefaultTableModel 객체의 addRow() 메서드를 사용하면 1개 레코드 추가
			dtm.addRow(rowData);
			
			rowData = new Vector();
			rowData.add(2);
			rowData.add("이순신");
			rowData.add(44);
			
			// DefaultTableModel 객체의 addRow() 메서드를 사용하면 1개 레코드 추가
			dtm.addRow(rowData);
			
			// JTable 에 DefaultTableModel 객체 추가
			table.setModel(dtm);
			
			
			setVisible(true);
		}
			
		
		}
	
	
		

