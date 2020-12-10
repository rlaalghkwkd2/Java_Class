package swing.JFrame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import swing.SwingTools;
import swing.btn.actions.ShowCardAction;

public class S07_JMenu_Onwer extends JFrame {

        public S07_JMenu_Onwer() {
                
                JMenuBar bar = new JMenuBar();
                JMenu menu = new JMenu("Menu");
                JMenu sub_menu = new JMenu("동물");
                
//                JMenuItem i1, i2, i3, i4, i5;
//                JMenuItem si1, si2, si3;
//                
//                // 각 메뉴를 선택하면 카드 레이아웃의 사진이 바뀌도록 만들어보세요
//                i1 = new JMenuItem(PictureEnum.APPLE.toString());
//                i2 = new JMenuItem("Banana");
//                i3 = new JMenuItem("Kiwi");
//                i4 = new JMenuItem("Peach");
//                i5 = new JMenuItem("Orange");
//                
//                i1.addActionListener(new ActionListener() {                        
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                                System.out.println("hi");
//                        }
//                        
//                });
//        
//       
//                
//                si1 = new JMenuItem("펭귄");
//                si2 = new JMenuItem("코끼리");
//                si3 = new JMenuItem("사자");
//                
//                menu.add(sub_menu);
//                menu.add(i1);
//                menu.add(i2);                
//                menu.add(i3);
//                menu.add(i4);
//                menu.add(i5);
//                                
//                sub_menu.add(si1);
//                sub_menu.add(si2);
//                sub_menu.add(si3);                
                SwingTools.initTestFrame(this);               
   
                setLayout(new BorderLayout());
                
                JPanel center_panel = new JPanel();
                JLabel pic_label = new JLabel("NO PICTURE");

                center_panel.setLayout(new CardLayout(20, 20));
                /// 이거는 이거 이넘에 있는걸 하나씩 꺼내! 그러고 패널이 카드 패널이니까
                // 한 페널에 사진을 넣는거고 그 사진-이름 이 맞는걸로 뽑아주는거지
                for(PictureEnum picname : PictureEnum.values()) { 
                	center_panel.add(picname.kName, new PictureLabel(picname));
                	JMenuItem item = new JMenuItem(picname.kName);
                	menu.add(item);
                	menu.addSeparator();
                	item.addActionListener(new ShowCardAction(
                			center_panel, 
                			pic_label, 
                			picname.kName)); // 카드이름
                	menu.add(item);
                }
                // 여기는 이해가지? 옹ㄴ데 이넘에서 벨루 하나씩이면 apple 나와 투스트링이면 영어가 나온다구 근데 키 네임을 하면 사과가 나와 바바
                     
                
                bar.add(menu);
                setJMenuBar(bar);
                add(center_panel, BorderLayout.CENTER);
                add(pic_label, BorderLayout.SOUTH);               
                setVisible(true);
        }        
        
        public static void main(String[] args) {
                new S07_JMenu_Onwer();     
                
        }
        
}
