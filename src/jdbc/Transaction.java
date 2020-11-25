package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transaction {

   public static void main(String[] args) {

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "123");

         // �ڵ� Ŀ���� �⺻������ Ȱ��ȭ �Ǿ� �����Ƿ�
         // Ʈ������ ��� ���ؼ��� �ڵ� Ŀ���� ��Ȱ��ȭ �ؾ��Ѵ�.
         conn.setAutoCommit(false);

         String sql1 = "UPDATE coffees SET cprice = cprice + 500 WHERE cfid <= 800";
         PreparedStatement pstmt1 = conn.prepareStatement(sql1);

         int row = pstmt1.executeUpdate();
         System.out.println(row + "���� ���߽��ϴ�.");

         String sql2 = "SELECT AVG(cprice) FROM coffees";
         PreparedStatement pstmt2 = conn.prepareStatement(sql2);

         ResultSet rs = pstmt2.executeQuery();

         double avg_price = 0;
         if (rs.next()) {
            avg_price = rs.getDouble(1);
         }
         
         System.out.println("��� Ŀ�ǰ��� " + avg_price + "�Դϴ�.");
         if(avg_price < 3000) {
            System.out.println("Ŀ�ǰ��� �÷Ƚ��ϴ�.");
            conn.commit();
         }else {
            System.out.println("Ŀ�ǰ� �λ��� ����߽��ϴ�.");
            conn.rollback();
         }

         if (pstmt1 != null)
            pstmt1.close();
         if (conn != null)
            conn.close();
         System.out.println("���� ��");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }

}