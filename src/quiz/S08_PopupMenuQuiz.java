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

	// ȭ�鿡 5���� �ֻ����� ����
	// �˾��޴�, �޴���, ��ư�� REROLL����� �޾ƺ�����

	// ��������ִ� REROLL�� ������ ���� �ֻ����� ���ؾ� �մϴ�
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

		// �̰� �г��� ���̾ƿ����� ���ذ�?�� �������������������̶��ް��Ǿ�
		// �׷� ���� ���� �������� ���̾ƿ��� ���� ���̾ƿ����� �Ǿ�����������

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
				// e.getButton() : ��� ���콺 ��ư�� ���ȴ��� ��ȣ�� �˷��ش�
				if (e.getButton() == MouseEvent.BUTTON3) {
					int x = e.getX();
					int y = e.getY();
					// System.out.printf("(%d, %d) ����\n", x, y);
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
//		setLayout(null);  �ϴ� �츮�� ���̾ƿ��� ���ű⶧���� ���̾ƿ��� �������� �ϸ� �ȴ� ! 
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(500, 500);
		setLocation(700, 200);
		s_panel.add(btn);
//		s_panel.add(btn2);
		add(s_panel, BorderLayout.SOUTH); // �̰� �����ӿ� �ֵ�(�г�, �г��� ��ġ)�ؿ� �̷���
		add(center_panel, BorderLayout.CENTER); // �� �̰Ŵ� �װ��ڳ� �̹����޿°Ÿ� �������̾ƿ����� �Ѵٴ°žˤ��ٿ����޾�

	}

	public static void main(String[] args) {
		new S08_PopupMenuQuiz();
	}

}
