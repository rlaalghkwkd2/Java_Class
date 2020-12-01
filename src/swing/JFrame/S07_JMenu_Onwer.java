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
                
                for(PictureEnum picname : PictureEnum.values()) {
                	center_panel.add(picname.toString(), new PictureLabel(picname));
                	JMenuItem item = new JMenuItem(picname.kName);
                	menu.add(item);
                	
                	item.addActionListener(new ShowCardAction(
                			center_panel, 
                			pic_label, 
                			picname.kName));
                }
                     
                
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
