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
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project.method.SwingTools_p;
import project.swing.Action.Update_btnAction;
import swing.SwingTools;

public class Custom_Update_View extends JFrame implements ItemListener {
	
	public static JTextField tName = new JTextField(10);
	public static JTextField tAge = new JTextField(5);
	public static JTextField tGender = new JTextField(5);
	public static JCheckBox cGender[] = new JCheckBox[2];
	public static String gEnders[] = { "남", "여" };
	public static JTextField tEmail = new JTextField(30);
	public static JTextField tPhone = new JTextField(20);
	public static JTextField tAddr = new JTextField(50);
	public static String splTel;
	public static JButton changebtn = new JButton("수정");
	public static JButton rebtn = new JButton("취소");
	ButtonGroup bg = new ButtonGroup(); // 체크박스에 한개만 체크 할 수 있도록 설정
	String[] table = {"name,","age,","gender,","phone,","email,","addr"};

	
	public Custom_Update_View(String name, String age,String gender, String email, String phone, String addr) {
		this.tName.setText(name);
		this.tAge.setText(age);
		this.tGender.setText(gender);
		this.tEmail.setText(email);
		this.tPhone.setText(phone);
		this.tAddr.setText(addr);
	}	
	
	
	public void Custm_Input(){
		
		
		Container c = this.getContentPane();
		
		JLabel title = new JLabel("ABC 마트 회원 정보 수정", JLabel.CENTER);
		JLabel jname = new JLabel("이름:", JLabel.CENTER);
		JLabel jage = new JLabel("나이:", JLabel.CENTER);
		JLabel jage1 = new JLabel("세", JLabel.CENTER);
		JLabel jgender = new JLabel("성별:", JLabel.CENTER);
		JLabel jemail = new JLabel("E-mail:", JLabel.CENTER);
		JLabel jtel = new JLabel("핸드폰:", JLabel.CENTER);
		JLabel jaddr = new JLabel("주소:", JLabel.CENTER);
		
		JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));

		for (int i = 0; i < cGender.length; i++) {
			cGender[i] = new JCheckBox(gEnders[i]);
			cGender[i].setBorderPainted(true); // 체크박스의 외각선이 보이도록
			
			if(this.tGender.getText().equals("남")) {
				cGender[0] = new JCheckBox(gEnders[0], true);
			}else if(tGender.getText().equals("여")){
				cGender[1] = new JCheckBox(gEnders[1], true);
			}else {
				System.out.println("야");
			}
			
			if (i == 0) {
				cGender[i].setBounds(60, 118, 45, 25);
				add(cGender[i]);
			} else {
				cGender[i].setBounds(110, 118, 45, 25);
				add(cGender[i]);
			}
			cGender[i].addItemListener(this);
		}

		setTitle("ABC마트 회원 등록");
		title.setBounds(0, 0, 400, 30);
		jname.setBounds(10, 40, 50, 20);
		jage.setBounds(10, 80, 50, 20);
		jage1.setBounds(75, 80, 50, 20);
		jgender.setBounds(10, 120, 50, 20);
		jemail.setBounds(10, 160, 50, 20);
		jtel.setBounds(10, 200, 50, 20);
		jaddr.setBounds(10, 240, 50, 20);
		
		bg.add(cGender[0]); bg.add(cGender[1]);
				
		tName.setBounds(60, 38, 80, 25);	
		tAge.setBounds(60, 78, 30, 25);
		tEmail.setBounds(60, 158, 150, 25);
		tPhone.setBounds(60, 198, 150, 25);
		tAddr.setBounds(60, 238, 270, 25);
		
		tName.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		tAge.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		tEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		tPhone.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		tAddr.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // 테두리?
		
		title.setFont(new Font("Serif", Font.BOLD, 20));
		JPanel p1 = new JPanel();
		p1.setOpaque(false);
		p1.setLayout(null);
		p1.add(title);
				
		p1.add(jname);
		p1.add(tName);
		p1.add(jage);
		p1.add(tAge);
		p1.add(jage1);
		p1.add(jgender);
		p1.add(jemail);
		p1.add(tEmail);
		p1.add(jtel);
		p1.add(tPhone);
		p1.add(jaddr);
		p1.add(tAddr);
			
		south.setBackground(Color.black);
		south.setOpaque(false);// 배경 투명
		south.add(changebtn);
		
		changebtn.setFont(new Font("고딕", Font.ITALIC, 20));
		changebtn.setForeground(Color.BLACK);
//		inbtn.setBackground(Color.CYAN);
		
		south.add(rebtn);
		rebtn.setFont(new Font("고딕", Font.ITALIC, 20));
		rebtn.setForeground(Color.RED);
		

		this.setLayout(new BorderLayout(0, 0));
		add(p1, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);

		changebtn.addActionListener(new Update_btnAction(p1));
		
		rebtn.addActionListener(new ActionListener() {					
			@Override
			public void actionPerformed(ActionEvent e) {
			dispose();	
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
		if (e.getSource() == cGender[0]) {
			tGender.setText(gEnders[0]);			
		} else {
			tGender.setText((gEnders[1]));
		}
	}	
}



