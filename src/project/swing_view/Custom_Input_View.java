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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project.controller.Custom_Insert_Create_Table;
import project.method.SwingTools_p;
import swing.SwingTools;

public class Custom_Input_View extends JFrame implements ItemListener {
	JTextField Tname = new JTextField(10);
	JTextField Tage = new JTextField(5);
	JTextField Tgender = new JTextField(5);
	JCheckBox sgender[] = new JCheckBox[2];
	String genders[] = { "��", "��" };
	JTextField Temail = new JTextField(30);
	JTextField Ttel = new JTextField(20);
	JTextField taddr = new JTextField(50);
	String splTel;
	JButton inbtn = new JButton("���");
	JButton rebtn = new JButton("���");

	public void Coustm_Input() throws IOException {

		Container c = this.getContentPane();
		
		JLabel title = new JLabel("ABC ��Ʈ ȸ�� ����ϱ�", JLabel.CENTER);
		
		JLabel name = new JLabel("�̸�:", JLabel.CENTER);
		JLabel age = new JLabel("����:", JLabel.CENTER);
		JLabel age1 = new JLabel("��", JLabel.CENTER);
		JLabel gender = new JLabel("����:", JLabel.CENTER);
		JLabel email = new JLabel("E-mail:", JLabel.CENTER);
		JLabel tel = new JLabel("�ڵ���:", JLabel.CENTER);
		JLabel addr = new JLabel("�ּ�:", JLabel.CENTER);
		
		JLabel image = new JLabel(
				new ImageIcon(ImageIO.read(new File("image/abc.jpg")).getScaledInstance(400, 330, Image.SCALE_SMOOTH)));

		JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));

		for (int i = 0; i < sgender.length; i++) {
			sgender[i] = new JCheckBox(genders[i]);
			sgender[i].setBorderPainted(true); // üũ�ڽ��� �ܰ����� ���̵���

			if (i == 0) {
				sgender[i].setBounds(60, 118, 45, 25);
				add(sgender[i]);
			} else {
				sgender[i].setBounds(110, 118, 45, 25);
				add(sgender[i]);
			}
			sgender[i].addItemListener(this);
		}

		setTitle("ABC��Ʈ ȸ�� ���");
		title.setBounds(0, 0, 400, 30);
		name.setBounds(10, 40, 50, 20);
		age.setBounds(10, 80, 50, 20);
		age1.setBounds(80, 90, 50, 20);
		gender.setBounds(10, 120, 50, 20);
		email.setBounds(10, 160, 50, 20);
		tel.setBounds(10, 200, 50, 20);
		addr.setBounds(10, 240, 50, 20);
		image.setBounds(0,0, 400, 330);

		Tname.setBounds(60, 38, 80, 25);	
		Tage.setBounds(60, 78, 30, 25);
		Temail.setBounds(60, 158, 150, 25);
		Ttel.setBounds(60, 198, 150, 25);
		taddr.setBounds(60, 238, 270, 25);
		
		Tname.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // �׵θ�?
		Tage.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // �׵θ�?
		Temail.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // �׵θ�?
		Ttel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // �׵θ�?
		taddr.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // �׵θ�?
		
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

		p1.add(email);
		p1.add(Temail);
		p1.add(tel);
		p1.add(Ttel);
		p1.add(addr);
		p1.add(taddr);

		south.setBackground(Color.black);
		south.setOpaque(false);
		south.add(inbtn);
		inbtn.setFont(new Font("���", Font.ITALIC, 20));
		inbtn.setForeground(Color.BLACK);
//		inbtn.setBackground(Color.CYAN);
		inbtn.setOpaque(false); // ��� ����

		p1.add(image);
		south.add(rebtn);
		rebtn.setFont(new Font("���", Font.ITALIC, 20));
		rebtn.setForeground(Color.RED);
		rebtn.setOpaque(false); // ��� ����

		this.setLayout(new BorderLayout(0, 0));
		add(p1, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);

		inbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {						
				new Custom_Insert_Create_Table().Custom_insert_create_table_info(
						Tname.getText(),
						Integer.parseInt(Tage.getText()),
						Tgender.getText(),						
						Temail.getText(),
						Ttel.getText(),
						taddr.getText());						
			}
		});

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
		// getStateChange()�ǹ̴� üũ�� ���ִٸ� SELECTED:üũ / DESELECTED
		if (e.getStateChange() == ItemEvent.SELECTED)
			selected = 1;
		else
			selected = -1;
		if (e.getSource() == sgender[0]) {
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



