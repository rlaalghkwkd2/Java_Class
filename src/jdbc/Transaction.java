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

         // 자동 커밋이 기본적으로 활성화 되어 있으므로
         // 트렌젝션 제어를 위해서는 자동 커밋을 비활성화 해야한다.
         conn.setAutoCommit(false);

         String sql1 = "UPDATE coffees SET cprice = cprice + 500 WHERE cfid <= 800";
         PreparedStatement pstmt1 = conn.prepareStatement(sql1);

         int row = pstmt1.executeUpdate();
         System.out.println(row + "행이 변했습니다.");

         String sql2 = "SELECT AVG(cprice) FROM coffees";
         PreparedStatement pstmt2 = conn.prepareStatement(sql2);

         ResultSet rs = pstmt2.executeQuery();

         double avg_price = 0;
         if (rs.next()) {
            avg_price = rs.getDouble(1);
         }
         
         System.out.println("평균 커피값이 " + avg_price + "입니다.");
         if(avg_price < 3000) {
            System.out.println("커피값을 올렸습니다.");
            conn.commit();
         }else {
            System.out.println("커피값 인상을 취소했습니다.");
            conn.rollback();
         }

         if (pstmt1 != null)
            pstmt1.close();
         if (conn != null)
            conn.close();
         System.out.println("실행 끝");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }

}