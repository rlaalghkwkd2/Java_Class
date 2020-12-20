package text;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Properties;
import java.util.TimeZone;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.controller.Custom_Select_Controller;
import project.swing_view.Custom_Black_Input_View;

public class Controller {

	public void black_CardInsert(String card) {
	    
    	Properties props = new Properties();
	      props.setProperty("JdbcUrl", "jdbc:oracle:thin:@localhost:1521/XEPDB1");
	      props.setProperty("dataSource.user", "hr");
	      props.setProperty("dataSource.password", "123");
	      props.setProperty("dataSource.databaseName", "XEPDB1");
	      props.put("dataSource.logWriter", new PrintWriter(System.out));
	      
	      HikariConfig config = new HikariConfig(props);
	      HikariDataSource ds = new HikariDataSource(config);   
	      
	      try {	    	    				
	    	  Connection conn = ds.getConnection();
			String sql = "INSERT INTO blacklist values (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Custom_Select_Controller.id);
			pstmt.setString(2, Custom_Select_Controller.c_name);
			pstmt.setInt(3, Custom_Select_Controller.c_age);
			pstmt.setString(4, Custom_Select_Controller.c_gender);
			pstmt.setString(5, Custom_Select_Controller.c_phone);
			pstmt.setString(6, Custom_Select_Controller.c_email);
			pstmt.setString(7, Custom_Select_Controller.c_addr);
			pstmt.setString(8, Custom_Select_Controller.c_card);
//			pstmt.setString(9, Custom_Black_Input_View.reason.getText());
			pstmt.setString(9, panelBlackIn.reason.getText());
			pstmt.setString(10, getDate());
			
			System.out.println("카드 번호로 블랙리스트 등록 완료");
			pstmt.executeUpdate();
			String black = "BLACK";
			String sql2 = "UPDATE CUSTOM SET black_Whether = '" + black +"' WHERE CARD = ?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, card);
			System.out.println("회원 관리 저장소 BLACK 변환 완료");
			pstmt2.executeUpdate();
			
			if(pstmt != null) pstmt.close();
			if(pstmt2 != null) pstmt2.close();
			if(conn != null) conn.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	      
	     
}
	
	 public String getDate() {
   	  TimeZone korea = TimeZone.getTimeZone("Asia/Seoul");
   	  Calendar korea_time = Calendar.getInstance(korea);
   	  int korea_year = korea_time.get(Calendar.YEAR);
   	  int korea_month = korea_time.get(Calendar.MONTH) + 1;
   	  int korea_date = korea_time.get(Calendar.DATE);
   	  return korea_year + "/" + korea_month + "/" + korea_date;
     }
}
