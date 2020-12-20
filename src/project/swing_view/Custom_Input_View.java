package project.swing_view;

import java.awt.BorderLayout;





import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import project.controller.Custom_Registration_Controller;
import project.method.SwingTools_p;
import swing.SwingTools;

public class Custom_Input_View extends JFrame implements ItemListener {
	JTextField Tname = new JTextField(10);
	JTextField Tage = new JTextField(5);
	JTextField Tgender = new JTextField(5);
	JCheckBox sgender[] = new JCheckBox[2];
	String genders[] = { "남", "여" };
	JTextField Temail = new JTextField(20);
	JTextField Temail2 = new JTextField(20);
	JTextField Ttel1 = new JTextField(20);
	JTextField Ttel2 = new JTextField(20);
	JTextField Ttel3 = new JTextField(20);
	JTextField taddr = new JTextField(50);
	String splTel;
	JButton inbtn = new JButton("등록");
	JButton rebtn = new JButton("취소");
	ButtonGroup bg = new ButtonGroup();
	JComboBox<String> jCom;
	JComboBox<String> jcpon;
	String[] mails = {"naver.com", "hanmail", "nate.com", "empas.com", "yahoo.co.kr", "hotmail.com", "gmail.com", "직접입력"};
	String[] pon = {"010","011","019"};
	
//	public void itemStateChanged02(ItemEvent e) {
//		if(e.getStateChange() == ItemEvent.SELECTED)
//			
//	}
//	
	
	
	
	public void Coustm_Input() throws IOException {
		
		Container c = this.getContentPane();
		
		
		
		JLabel title = new JLabel("ABC 마트 회원 등록하기", JLabel.CENTER);
		
		JLabel name = new JLabel("이름:", JLabel.CENTER);
		JLabel age = new JLabel("나이:", JLabel.CENTER);
		JLabel age1 = new JLabel("세", JLabel.CENTER);
		JLabel gender = new JLabel("성별:", JLabel.CENTER);
		JLabel email = new JLabel("E-mail:", JLabel.CENTER);
		JLabel tel = new JLabel("핸드폰:", JLabel.CENTER);
		JLabel addr = new JLabel("주소:", JLabel.CENTER);		
		JLabel image = new JLabel(
				new ImageIcon(ImageIO.read(new File("image/abc.jpg")).getScaledInstance(450, 330, Image.SCALE_SMOOTH)));
		JLabel gol = new JLabel("@",JLabel.CENTER);
		JLabel m1 = new JLabel("─",JLabel.CENTER);
		JLabel m2 = new JLabel("─",JLabel.CENTER);
		m2.setFont(new Font("Serif", Font.BOLD, 10));
		m1.setFont(new Font("Serif", Font.BOLD, 10));
		
		JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
	
		
		
		for (int i = 0; i < sgender.length; i++) {
			sgender[i] = new JCheckBox(genders[i]);
			sgender[i].setBorderPainted(true); // 체크박스의 외각선이 보이도록

			if (i == 0) {
				sgender[i].setBounds(60, 118, 45, 25);
				add(sgender[i]);
			} else {
				sgender[i].setBounds(110, 118, 45, 25);
				add(sgender[i]);
			}
			sgender[i].addItemListener(this);
		}
				
		bg.add(sgender[0]);
		bg.add(sgender[1]);

		
		
		DefaultComboBoxModel<String> dcbmDomain = new DefaultComboBoxModel<String>(mails);
		jCom = new JComboBox<String>(dcbmDomain);
		jCom.setSelectedItem("직접입력");
		DefaultComboBoxModel<String> dcbmDomain1 = new DefaultComboBoxModel<String>(pon);
		jcpon = new JComboBox<String>(dcbmDomain1);
		jcpon.setSelectedItem("010");
		Ttel1.setText(jcpon.getSelectedItem().toString());
		setTitle("ABC마트 회원 등록");
		title.setBounds(0, 0, 400, 30);
		name.setBounds(10, 40, 50, 20);
		age.setBounds(10, 80, 50, 20);
		age1.setBounds(75, 80, 50, 20);
		gender.setBounds(10, 120, 50, 20);
		email.setBounds(10,	200, 50, 20);
		tel.setBounds(10, 160, 50, 20);
		addr.setBounds(10, 240, 50, 20);
		image.setBounds(0,0, 450, 330);

		Tname.setBounds(60, 38, 80, 25);	
		Tage.setBounds(60, 78, 30, 25);
		jcpon.setBounds(60, 158, 75, 25);
//		Ttel1.setBounds(60, 158, 75, 25);
		Ttel2.setBounds(158, 158, 75, 25);
		Ttel3.setBounds(257, 158, 75, 25);
		m1.setBounds(135, 158, 20, 25);
		m2.setBounds(235, 158, 20, 25);
		
		jCom.setBounds(333, 198, 100, 25);
		Temail.setBounds(60, 198, 126, 25);
		Temail2.setBounds(204, 198, 126, 25);
		gol.setBounds(185, 198, 20, 25);
		
		
		taddr.setBounds(60, 238, 270, 25);
		
		Tname.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		Tage.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		Temail.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		Ttel1.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		Ttel2.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		Ttel3.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		taddr.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		
		title.setFont(new Font("Serif", Font.BOLD, 20));
		JPanel p1 = new JPanel();
		p1.setOpaque(false);
		p1.setLayout(null);
		p1.add(title);
		p1.add(name);
		p1.add(Tname);
		p1.add(age);
		p1.add(Tage);
		p1.add(age1);
		p1.add(gender);
		p1.add(jCom);
		p1.add(gol);
		p1.add(email);		
		p1.add(Temail);
		p1.add(Temail2);
		p1.add(tel);
		p1.add(Ttel1);
		p1.add(m1);
		p1.add(m2);
		p1.add(Ttel2);
		p1.add(Ttel3);
		p1.add(jcpon);
		p1.add(addr);
		p1.add(taddr);

		south.setBackground(Color.black);
		south.setOpaque(false);
		south.add(inbtn);
		inbtn.setFont(new Font("고딕", Font.ITALIC, 20));
		inbtn.setForeground(Color.BLACK);
//		inbtn.setBackground(Color.CYAN);
		inbtn.setOpaque(false); // 배경 투명

		p1.add(image);
		south.add(rebtn);
		rebtn.setFont(new Font("고딕", Font.ITALIC, 20));
		rebtn.setForeground(Color.RED);
		rebtn.setOpaque(false); // 배경 투명

		this.setLayout(new BorderLayout(0, 0));
		add(p1, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);

		inbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {						
				new Custom_Registration_Controller().Custom_insert_create_table_info(
						Tname.getText(),
						Integer.parseInt(Tage.getText()),
						Tgender.getText(),						
						Temail.getText() + "@" +Temail2.getText(),
						Ttel1.getText() +"-" + Ttel2.getText() + "-" + Ttel3.getText(),
						taddr.getText());						
			}
		});

		rebtn.addActionListener(new ActionListener() {					
			@Override
			public void actionPerformed(ActionEvent e) {
			dispose();	
			}
		});

		
////////////////////////////JCombobox 액션///////////////////////////		
		
		
		jCom.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> t = (JComboBox<String>)e.getSource();
				int idx = t.getSelectedIndex();
				Temail2.setText(mails[idx]);
				
			}
		});
		jcpon.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> t = (JComboBox<String>)e.getSource();
				int idx = t.getSelectedIndex();
				Ttel1.setText(pon[idx]);
				System.out.println(Ttel1.getText());

			}
		});	
		SwingTools_p.initTestFrame(this);

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		int selected = 0;
		// getStateChange()의미는 체크가 되있다면 SELECTED:체크 / DESELECTED
		if (e.getStateChange() == ItemEvent.SELECTED)
			selected = 1;
		else
			selected = -1;
		if (e.getSource() == sgender[0]) {	
			System.out.println("야");
			System.out.println(sgender[0]);
			Tgender.setText(genders[0]);			
		} else {
			Tgender.setText((genders[1]));
		}
	}
	

	public static void main(String[] args) throws IOException {

		Custom_Input_View c =new Custom_Input_View();
	c.Coustm_Input();
	
		

	}

	
}



