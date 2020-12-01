package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import swing.btn.actions.NextCardBtnAction;

public class S05_JPanel extends JFrame {

	
	
	static String[] paths = {
			"image/���.jpg",
			"image/�ٳ���.jpg",
			"image/��.jpg",
			"image/melon.jpg"			
	};
	
	final static ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();

	static {
		for (String path : paths) {
			setImgeIcon(path);
		}
	}
	

	

	
	private static void setImgeIcon(String path) {
		try {
			images.add(new ImageIcon(ImageIO.read(new File(path)).getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public S05_JPanel() throws IOException {
		SwingTools.initTestFrame(this);

		// # JPanel
		// - ������ ���� �߰��� ���� �� �ִ� �����̳�
		// - �����̳� ������ �ϴ� ������Ʈ
		
		Container c = this.getContentPane();

		JPanel south_panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		JPanel center_panel = new JPanel(new CardLayout(10, 10));

		JButton next_btn = new JButton("next");
		next_btn.addActionListener(new NextCardBtnAction(center_panel));

		JButton first_btn = new JButton("first");
		first_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).first(center_panel);

			}
		});

		JButton last_btn = new JButton("last");
		last_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).last(center_panel);

			}
		});

		JButton prev = new JButton("prev");
		prev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).previous(center_panel);
			}
		});

		// 1. center_panel�� �̹����� �� �� �� �߰��� ������
		// 2. south_panel�� fisrt, last, prev ��ư�� �߰��غ�����

		// # MVC 
		// 1. Model
		//	�����͸� �����ų� ������ �� ����ϴ� Ŭ����
		//	�ַ�, �������� ���¸� �����ϴ� Ŭ������ ���Ѵ�.
		// 2. View
		//	����ڿ��� ������ ȭ���� �����ϴ� Ŭ�������� ���� ��Ī�ϴ� ��.
		// 3. Controller
		//	������� �Է��� ó���ϴµ� �ʿ��� Ŭ�������� ���� ��Ī�ϴ� ��
		//	����Ͻ� ���� - ����Ͻ����� �޶����� ó������ ����Ͻ� �����̶�� �Ѵ�
		//	DAO(Data Access Object) - �����ͺ��̽� (�Ǵ� ���� �ý���)�� �����͸� �����ϴ� ��ɵ�
		
		// ����� -> View -> Controller -> Model -> Database
		
		// 1. lastAction, fristAction, prevAction���� ��Ʈ�ѷ��� �з� �� �� �ִ�.
		// 2. ���� �ҽ��� ȭ���� ǥ���ϴ� �ڵ�(View)�� ������ ����ϴ� �ڵ�(Controller)�� ȥ���ϰ� �ִ�.
		// 3. ���� ���� ȭ�鿡 lastAction�� ����� �Ȱ��� ��ư�� �߰��ϴµ� Controller�� �ش��ϴ� �͸� ����ü�� ���ҵǾ����� �ʴٸ� ������ �� ���̴�.
		// 4. �Ȱ��� �ҽ��� �������뿡 �����ϰ� �ǹǷ� �ڵ� �����ÿ� ������ �߻��Ѵ�.
		
		this.setLayout(new BorderLayout(0, 0));
		this.add(center_panel, BorderLayout.CENTER);
		this.add(south_panel, BorderLayout.SOUTH);

		// center_panel�� cardlayout
		center_panel.add("apple", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/���.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));

		center_panel.add("banana", new JLabel(new ImageIcon(
				ImageIO.read(new File("image/�ٳ���.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));

		// ���� Ǯ�� 1.
		center_panel.add("banana", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/��.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));
		center_panel.add("melon", new JLabel(new ImageIcon(
				ImageIO.read(new File("image/melon.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));
		// south_panel�� flowlayout
		south_panel.add(first_btn);
		south_panel.add(next_btn);
		south_panel.add(prev);
		south_panel.add(last_btn);
		

	}

	public static void main(String[] args) throws IOException {
		new S05_JPanel();
	}

}
