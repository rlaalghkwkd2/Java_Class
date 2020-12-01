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
			"image/사과.jpg",
			"image/바나나.jpg",
			"image/배.jpg",
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
		// - 프레임 위에 추가로 붙일 수 있는 컨테이너
		// - 컨테이너 역할을 하는 컴포넌트
		
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

		// 1. center_panel에 이미지를 몇 장 더 추가해 보세요
		// 2. south_panel에 fisrt, last, prev 버튼을 추가해보세요

		// # MVC 
		// 1. Model
		//	데이터를 꺼내거나 저장할 떄 사용하는 클래스
		//	주로, 데이터의 형태를 정의하는 클래스를 말한다.
		// 2. View
		//	사용자에게 제공할 화면을 구성하는 클래스들을 따로 지칭하는 말.
		// 3. Controller
		//	사용자의 입력을 처리하는데 필요한 클래스들을 따로 지칭하는 말
		//	비즈니스 로직 - 비즈니스마다 달라지는 처리들을 비즈니스 로직이라고 한다
		//	DAO(Data Access Object) - 데이터베이스 (또는 파일 시스템)의 데이터를 접근하는 기능들
		
		// 사용자 -> View -> Controller -> Model -> Database
		
		// 1. lastAction, fristAction, prevAction들이 컨트롤러로 분류 될 수 있다.
		// 2. 현재 소스는 화면을 표현하는 코드(View)와 로직을 담당하는 코드(Controller)가 혼재하고 있다.
		// 3. 만약 여러 화면에 lastAction과 기능이 똑같은 버튼을 추가하는데 Controller에 해당하는 익명 구현체가 분할되어있지 않다면 복붙을 할 것이다.
		// 4. 똑같은 소스가 여러군대에 존재하게 되므로 코드 수정시에 문제가 발생한다.
		
		this.setLayout(new BorderLayout(0, 0));
		this.add(center_panel, BorderLayout.CENTER);
		this.add(south_panel, BorderLayout.SOUTH);

		// center_panel은 cardlayout
		center_panel.add("apple", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/사과.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));

		center_panel.add("banana", new JLabel(new ImageIcon(
				ImageIO.read(new File("image/바나나.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));

		// 문제 풀이 1.
		center_panel.add("banana", new JLabel(
				new ImageIcon(ImageIO.read(new File("image/배.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));
		center_panel.add("melon", new JLabel(new ImageIcon(
				ImageIO.read(new File("image/melon.jpg")).getScaledInstance(300, 300, Image.SCALE_SMOOTH))));
		// south_panel은 flowlayout
		south_panel.add(first_btn);
		south_panel.add(next_btn);
		south_panel.add(prev);
		south_panel.add(last_btn);
		

	}

	public static void main(String[] args) throws IOException {
		new S05_JPanel();
	}

}
