package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectPractice {

   // 사용자로부터 부서번호를 입력받으면 
   // 해당 부서의 모든 사원들의 정보를 조회해서 콘솔에 출력해보세요
   
   public static void main(String[] args) {
      
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("[ojdbc] 성공적으로 로드되었습니다");
         
         Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1",
               "hr",
               "123");
         System.out.println("연결성공");
         
//         PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees WHERE department_id IN (?, ?, ?)");
         PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees WHERE department_id = ?");
         Scanner sc = new Scanner(System.in);
         System.out.print("사원 번호를 입력하세요 \n >");
         int a = sc.nextInt();
         pstmt.setInt(1, a);
         
         ResultSet rs = pstmt.executeQuery();
         System.out.println("EMPLOYEE_ID\tLAST_NANE\tFIRST_NAME     \tEMAIL\t\tPHONE_NUMBER\tHIRE_DATE\t\tJOB_ID\t\tSALARY\t\tDEPARTMENT_ID\n");
         while(rs.next()) {
            System.out.printf("%-9d\t%-9s\t%-9s\t%-9s\t%-9s\t%-9s\t%-9s\t%-9d\t%-9d\n",
                  rs.getInt("employee_id"),
                  rs.getString("last_name"), rs.getString("first_name"),rs.getString("email"),
                  rs.getString("phone_number"),rs.getString("hire_date"),rs.getString("job_id"),                  
                  rs.getInt("salary"), rs.getInt("department_id"),
                  rs.getString("last_name"));
         }
         
         
         if (rs != null)
            rs.close();
         if (pstmt != null)
            pstmt.close();
         if (conn != null)
            conn.close();
         
         
      } catch (ClassNotFoundException e) {

         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
   }
}