package quiz;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_ImageButtonQuizTest extends JFrame {

   public S02_ImageButtonQuizTest(int image_cols, int image_rows) {

      ArrayList<JButton> btns;
      btns = new ArrayList<>(image_cols * image_rows);

      try {
         BufferedImage source = ImageIO.read(new File("C:\\Users\\seunghwan\\Pictures\\Saved Pictures\\1fby-6t-555d.png"));

         System.out.println("이미지 전체 너비: " + source.getWidth());
         System.out.println("이미지 전체 높이: " + source.getHeight());

         System.out.println("각 이미지 너비: " + source.getWidth() / image_cols);
         System.out.println("각 이미지 높이: " + source.getHeight() / image_rows);

         int btn_width = source.getWidth() / image_cols;
         int btn_height = source.getHeight() / image_rows;
         int bcol = 0;
         int brow = 0;
         
         for (int col = 0; col < image_cols; ++col) {
            for (int row = 0; row < image_rows; ++row) {
               Image cropped_image = source.getSubimage(col * btn_width, row * btn_height, btn_width, btn_height);

               JButton btn = new JButton();

               btn.setSize(source.getWidth() / image_cols, source.getHeight() / image_rows);
               
               btn.setLocation(bcol * btn_width, brow * btn_height);
               if (row % 30 == 0) {
                  bcol = 0;
                  brow++;
                  btn.setLocation(bcol * btn_width, brow * btn_height);
               }
               bcol++;

               // getScaledInstance로 이미지 크기 조절이 가능하다
               btn.setIcon(new ImageIcon(cropped_image.getScaledInstance(source.getWidth() / image_cols,
                     source.getHeight() / image_rows, Image.SCALE_SMOOTH)));

               btns.add(btn);
            }
         }

      } catch (IOException e) {
         e.printStackTrace();
      }

      for (JButton btn : btns) {
         add(btn);
      }

      setLayout(null);
      setLocation(0, 0);
      setSize(1000, 1000);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
      new S02_ImageButtonQuizTest(1, 566);
   }
}