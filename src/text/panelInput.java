package text;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.border.LineBorder;

import org.json.simple.parser.Yytoken;

import com.sun.javafx.embed.swing.Disposer;

import project.controller.Custom_Registration_Controller;
import project.swing.Action.Black_deleteAction;
import project.swing_view.Custom_Black_Input_View;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;

public class panelInput extends JPanel implements ItemListener {
	public static JTextField tName;
	private panelSearch panelSearch;
//	private Frame01 Frame01;

	private JTextField ponclean;
	private JTextField ponfirst;
	private JTextField ponlast;
	private JTextField tAddr;
	private JComboBox eMailBox;
	private JComboBox ponBox;
//	public static ArrayList<String> peple = new ArrayList<String>();
	JTextField tGender = new JTextField(5);
	public static JCheckBox checkMan = new JCheckBox("³²");
	public static JCheckBox checkWomen = new JCheckBox("¿©");
	private JTextField tEmail01;
	private JTextField tEmail02;
	private JTextField textAge;
	JButton btnExit;
	ButtonGroup bg = new ButtonGroup();
	private Image img_logo = new ImageIcon(Frame01.class.getResource("res/abc.jpg")).getImage().getScaledInstance(335,
			529, Image.SCALE_SMOOTH);
	
	String[] ponlist = { "010", "011", "019" };
	String[] maillist = { "naver.com", "hanmail", "nate.com", "empas.com", "yahoo.co.kr", "hotmail.com", "gmail.com",
			"Á÷Á¢ÀÔ·Â", "" };

	public panelInput() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));

		setBounds(0, 0, 807, 533);
		panelSearch = new panelSearch();
		setBackground(new Color(0, 102, 51));
		setLayout(null);

		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0, 255, 153));
		panelMenu.setBounds(2, 3, 803, 528);
		add(panelMenu);
		panelMenu.setLayout(null);

		JLabel lblTitle = new JLabel("ABC \uB9C8\uD2B8\uD68C\uC6D0 \uB4F1\uB85D");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(90, 10, 221, 81);
		panelMenu.add(lblTitle);

		JLabel lblName = new JLabel("\uC774\uB984: ");
		lblName.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(48, 112, 41, 24);
		panelMenu.add(lblName);

		JLabel lblGender = new JLabel("\uC131\uBCC4:");
		lblGender.setToolTipText("");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblGender.setBounds(48, 214, 41, 24);
		panelMenu.add(lblGender);

		JLabel lblPhone = new JLabel("\uD578\uB4DC\uD3F0: ");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblPhone.setBounds(33, 265, 60, 24);
		panelMenu.add(lblPhone);

		JLabel lblEmeail = new JLabel("Email:");
		lblEmeail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmeail.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblEmeail.setBounds(41, 316, 48, 21);
		panelMenu.add(lblEmeail);

		JLabel lblAddr = new JLabel("\uC8FC\uC18C:");
		lblAddr.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddr.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblAddr.setBounds(48, 367, 41, 24);
		panelMenu.add(lblAddr);

		tName = new JTextField();
		tName.setBounds(100, 113, 73, 26);
		panelMenu.add(tName);
		tName.setColumns(10);

		checkMan.setBounds(100, 214, 43, 26);
		
		checkWomen.setBounds(153, 214, 43, 26);
		panelMenu.add(checkMan);
		panelMenu.add(checkWomen);
		
		
		

		ponfirst = new JTextField();
		ponfirst.setColumns(10);
		ponfirst.setBounds(189, 267, 73, 26);
		panelMenu.add(ponfirst);

		ponclean = new JTextField(10);
		panelMenu.add(ponclean);

		ponlast = new JTextField();
		ponlast.setColumns(10);
		ponlast.setBounds(277, 267, 73, 26);
		panelMenu.add(ponlast);

		tAddr = new JTextField();
		tAddr.setColumns(10);
		tAddr.setBounds(100, 366, 250, 26);
		panelMenu.add(tAddr);

		DefaultComboBoxModel<String> ponDe = new DefaultComboBoxModel<String>(ponlist);
		 ponBox = new JComboBox(ponDe);
		ponBox.setSelectedItem(ponlist[0]);
		ponBox.setBounds(100, 266, 73, 26);
		panelMenu.add(ponBox);
		ponBox.addActionListener(new ComboBoxInput(panelMenu, ponclean, ponlist));
//		ponclean.setText(ponBox.getSelectedItem().toString());

		tEmail01 = new JTextField();
		tEmail01.setColumns(10);
		tEmail01.setBounds(100, 316, 90, 26);
		panelMenu.add(tEmail01);

		tEmail02 = new JTextField();
		tEmail02.setColumns(10);
		tEmail02.setBounds(211, 316, 90, 26);

		panelMenu.add(tEmail02);
		JLabel eMailGol = new JLabel("@");
		eMailGol.setHorizontalAlignment(SwingConstants.CENTER);
		eMailGol.setBounds(188, 316, 23, 25);

		panelMenu.add(eMailGol);

		DefaultComboBoxModel<String> eMdef = new DefaultComboBoxModel<String>(maillist);

		 eMailBox = new JComboBox(eMdef);
//		eMailBox.setSelectedItem("");
		eMailBox.setBounds(312, 316, 90, 26);
		panelMenu.add(eMailBox);
		eMailBox.addActionListener(new ComboBoxInput(panelMenu, tEmail02, maillist));
//		tEmail02.setText(eMailBox.getSelectedItem().toString());
		
		JLabel lblYear = new JLabel("\uB098\uC774:");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setFont(new Font("¸¼Àº °íµñ Semilight", Font.PLAIN, 15));
		lblYear.setBounds(48, 163, 41, 24);
		panelMenu.add(lblYear);

	

	

		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(100, 164, 73, 26);
		panelMenu.add(textAge);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(470, 0, 335, 528);
		panelMenu.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(img_logo));

		JButton btnInput = new JButton("\uB4F1\uB85D");
		btnInput.setForeground(new Color(0, 0, 0));
		btnInput.setBackground(new Color(255, 255, 255));
		btnInput.setBounds(131, 487, 88, 32);
		panelMenu.add(btnInput);
		btnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Custom_Registration_Controller().Custom_insert_create_table_info(tName.getText(),
						Integer.parseInt(textAge.getText()),
						tGender.getText(),
						ponclean.getText() + "-" + ponfirst.getText() + "-" + ponlast.getText(),
						tEmail01.getText() + "@" + tEmail02.getText(), tAddr.getText());
				tName.setText("");
				textAge.setText("");
				tEmail01.setText("");
				tEmail02.setText("");
				eMailBox.setSelectedItem(maillist[0]);
				ponBox.setSelectedItem(ponlist[0]);
				ponfirst.setText("");
				ponlast.setText("");
				tAddr.setText("");
				System.out.println(tGender.getText());
				if(tGender.getText().equals("³²")) {
					checkMan.setSelected(false);		
					
				}else {		
					checkWomen.setSelected(false);
					
				}
				

			}
		});
		
	
		btnExit = new JButton("\uCDE8\uC18C");
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setBackground(new Color(255, 255, 255));
		btnExit.setBounds(223, 487, 88, 32);
		panelMenu.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("\uC138");
		lblNewLabel.setBounds(177, 164, 20, 26);
		panelMenu.add(lblNewLabel);
//		bg.add(checkMan);
//		bg.add(checkWomen);
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InputCleanSet();
			}
		});
		
		checkMan.addItemListener(this);
		checkWomen.addItemListener(this);
	}
	
	public void InputCleanSet() {
		tName.setText("");
		textAge.setText("");
		tEmail01.setText("");
		tEmail02.setText("");
		eMailBox.setSelectedItem(maillist[0]);
		ponBox.setSelectedItem(ponlist[0]);
		tAddr.setText("");
		ponfirst.setText("");
		ponlast.setText("");
		checkMan.setSelected(false);
		checkWomen.setSelected(false);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int selected = 0;
		// getStateChange()ÀÇ¹Ì´Â Ã¼Å©°¡ µÇÀÖ´Ù¸é SELECTED:Ã¼Å© / DESELECTED
		if (e.getStateChange() == ItemEvent.SELECTED) {
			selected = 1;
			if(e.getSource() == checkMan) {
				checkWomen.setSelected(false);
			}else {
				checkMan.setSelected(false);
			}
		}
		else
			selected = -1;
		if(e.getSource() == checkMan) {
			tGender.setText("³²");
			System.out.println("³²");
		} else if(e.getSource() == checkWomen){
			tGender.setText("¿©");	
			System.out.println("¿©");
		}

	}

	

}
