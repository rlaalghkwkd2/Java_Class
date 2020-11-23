package myobj.boardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class FiveDice {

   private Random ran;
   private List<Integer> dices; // 5���� �ֻ��� ���� ����� ����Ʈ
   private List<Integer> counts; // �� ���ڰ� ����� �����ߴ��� ���� �� ����Ʈ

   private String made;

   private static int NUM_OF_DICE = 5;
   private static int DICE_FACET = 6;

   private final static Set<Set<Integer>> LARGE_CASES;
   private final static Set<Set<Integer>> SMALL_CASES;

   Scanner sc = new Scanner(System.in);

   static {
      LARGE_CASES = new HashSet<>(2);

      for (int i = 1; i <= 2; ++i) {
         Set<Integer> large = new HashSet<>(5);
         Collections.addAll(large, i, i + 1, i + 2, i + 3, i + 4);
         LARGE_CASES.add(large);
      }

      SMALL_CASES = new HashSet<>(3);

      for (int i = 1; i <= 3; ++i) {
         Set<Integer> small = new HashSet<>(4);
         Collections.addAll(small, i, i + 1, i + 2, i + 3);
         SMALL_CASES.add(small);
      }
   }

   public FiveDice() {
      ran = new Random();
      made = "UNCHECKED";
      // �ֻ����� 5�� �̻����� �þ�� �ʱ� ������ �÷��� �뷮�� 5�� �����Ѵ�
      // �� ArrayList�� �ʱ� �뷮�� ���� ���ԵǸ� �˾Ƽ� �뷮�� 1.5�辿 ������Ų��
      dices = new ArrayList<>(NUM_OF_DICE);
      counts = new ArrayList<>(DICE_FACET);

      Collections.addAll(dices, 0, 0, 0, 0, 0);
      Collections.addAll(counts, 0, 0, 0, 0, 0, 0);
   }

   public void print() {
      System.out.print(dices + " : ");

      if (made.equals("UNCHECKED")) {
         made = check();
      }
      System.out.println(made);
   }

   private void count() {
      for (int i = 0; i < DICE_FACET; ++i) {
         int dice_num = i + 1;
         counts.set(i, Collections.frequency(dices, dice_num));
      }
   }

   private String check() {
      // check by counts
      if (counts.contains(5)) {
         return "FIVE DICE!!!";
      } else if (counts.contains(4)) {
         return "FOUR DICE!!";
      } else if (counts.contains(2) && counts.contains(3)) {
         return "FULL HOUSE!!!";
      }

      // check by dices
      for (Set<Integer> ls : LARGE_CASES) {
         if (dices.containsAll(ls)) {
            return "LARGE STRAIGHT!!!";
         }
      }

      for (Set<Integer> ss : SMALL_CASES) {
         if (dices.containsAll(ss)) {
            return "SMALL STRAIGHT!!";
         }
      }
      return "NO MATCHES";
   }

   public void roll() {
      
      made = "UNCHECKED";
      
      for (int i = 0; i < NUM_OF_DICE; ++i) {
         dices.set(i, ran.nextInt(DICE_FACET) + 1);
      }
      count();
      print();

   }

   void newChiose() {

      System.out.println("�ٽû�����? Y / N");
      String re = sc.next();
      if (re.equals("Y") || re.equals("y")) {
         System.out.println("�ٲٰ���� ���� �ֻ��� ����: ");
         int num = sc.nextInt();

         for (int i = 0; i <= num; i++)
            dices.set(num - 1, ran.nextInt(DICE_FACET) + 1);
         count();
         System.out.print(dices + " : ");
         System.out.println(check());

      } else if (re.equals("N") || re.equals("n")) {
         print();
      }
   }

   public void reroll(Set<Integer> rerolls) {

      if (rerolls.size() == 0) {
         System.out.println("NOTHING CHANGES");
         return;
      }

      made = "UNCHECKED";
      
      for (int i : rerolls) {
         int to_chage = ran.nextInt(DICE_FACET) + 1;
         dices.set(i - 1, to_chage);
         System.out.printf("DICE %d HAS DHANGED : %d\n", i, to_chage);

      }
      count();
      print();
   }
}