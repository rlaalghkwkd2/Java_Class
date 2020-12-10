package quiz;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import swing.SwingTools;
import swing.JFrame.DiceEnum;
import swing.JFrame.DiceLabel;
import swing.JFrame.PictureEnum;
import swing.JFrame.PictureLabel;
import swing.btn.actions.DiceAcction;
import swing.btn.actions.ShowCardAction;
import swing.comp.Dice;

public class S08_PopupMenuQuiz extends JFrame {

	// 화면에 5개의 주사위를 띄우고
	// 팝업메뉴, 메뉴바, 버튼에 REROLL기능을 달아보세요

	// 어느곳에있는 REROLL을 누르던 간에 주사위가 변해야 합니다
	ArrayList<DiceEnum> ims = new ArrayList<>();
	JMenuBar bar = new JMenuBar();
	JButton btn = new JButton("Reroll");
	JPopupMenu po = new JPopupMenu("Edit");
	JMenu menu = new JMenu("Menu");
	JMenuItem re = new JMenuItem("Reroll");
	JPanel center_panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
	JPanel s_panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));

	public S08_PopupMenuQuiz() {

//		JButton btn2 = new JButton("Reroll");

		// 이건 패널의 레이아웃설정 애해가?아 이해햇으ㅇㅇㅇㅇ라벨이랑햇갈렷엉
		// 그럼 문제 지금 프레임의 레이아웃이 무슨 레이아웃으로 되어있을깤ㅋㅋ

		btn.setSize(20, 20);
//		btn2.setSize(20, 20);

		for (DiceEnum d : DiceEnum.values()) {
			ims.add(d);
		}

		JLabel[] image = { new DiceLabel(ims.get((int) (Math.random() * 6))),
				new DiceLabel(ims.get((int) (Math.random() * 6))), new DiceLabel(ims.get((int) (Math.random() * 6))),
				new DiceLabel(ims.get((int) (Math.random() * 6))), new DiceLabel(ims.get((int) (Math.random() * 6))) };

		for (JLabel jLabel : image) {
			center_panel.add(jLabel);
		}

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JLabel jLabel : image) {
					Collections.shuffle(ims);
					jLabel.setIcon(ims.get(0).getImageicon());
				}

			}
		});

		re.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JLabel jLabel : image) {
					Collections.shuffle(ims);
					jLabel.setIcon(ims.get(0).getImageicon());
				}
			}
		});

		JFrame f = this;

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				System.out.println("MBTN NUMBER: "+ e.getButton());				
				// e.getButton() : 어느 마우스 버튼이 눌렸는지 번호로 알려준다
				if (e.getButton() == MouseEvent.BUTTON3) {
					int x = e.getX();
					int y = e.getY();
					// System.out.printf("(%d, %d) 눌림\n", x, y);
					po.show(f, x, y);
				}
			}
		});

		center_panel.setSize(500, 500);

		menu.add(re); //
		bar.add(menu);
		setJMenuBar(bar);
		setVisible(true);
		po.add(re);
//		setLayout(null);  일단 우리가 레이아웃을 쓸거기때문에 레이아웃을 없음으로 하면 안대 ! 
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(500, 500);
		setLocation(700, 200);
		s_panel.add(btn);
//		s_panel.add(btn2);
		add(s_panel, BorderLayout.SOUTH); // 이건 프레임에 애드(패널, 패널의 위치)밑에 이렇게
		add(center_panel, BorderLayout.CENTER); // 흠 이거는 그거자나 이미지받온거를 보더레이아웃으로 한다는거알ㄷ겟옹잘햇엉

	}

	public static void main(String[] args) {
		new S08_PopupMenuQuiz();
	}

}
