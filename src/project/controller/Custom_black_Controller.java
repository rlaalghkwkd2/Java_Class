package project.controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Custom_black_Controller{

	
	public static Integer id;
	public static String c_name;
	public static Integer c_age;
	public static String c_gender;	
	public static String c_email;	
	public static String c_phone;	
	public static String c_addr;	
	public static String c_card;
	
	public static ArrayList<String> mo = new ArrayList<String>();
	
	public void Custom_black_select(String name) {		
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
			
			String sql = "SELECT * FROM blacklist WHERE B_NAME = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);			
			ResultSet rs = pstmt.executeQuery();	
				while(rs.next()) {
					System.out.printf("고객Number%d\n이름:%s\n나이:%d\n성별:%s\n핸드폰:%s\n이메일:%s\n주소:%s\n카드번호:%s",
				this.id = rs.getInt("c_id"),
				this.c_name = rs.getString("c_name"),
				this.c_age = rs.getInt("c_age"),
				this.c_gender = rs.getString("c_gender"),
				this.c_phone = rs.getString("c_pddr"),
				this.c_email = rs.getString("c_ehone"),
				this.c_addr = rs.getString("c_amail"),
				this.c_card = rs.getString("c_card"),
						this.mo.add(id.toString()),
						this.mo.add(c_name),
						this.mo.add(c_age.toString()),
						this.mo.add(c_gender),
						this.mo.add(c_phone),
						this.mo.add(c_email),
						this.mo.add(c_addr),
						this.mo.add(c_card)	
					);
					System.out.println(mo);
			}
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}		
/////////////////////////////////////////////////////////////////////////				
//	public void black_IdInsert(int c_id) {		
//					
//		Properties props = new Properties();
//	      props.setProperty("JdbcUrl", "jdbc:oracle:thin:@localhost:1521/XEPDB1");
//	      props.setProperty("dataSource.user", "hr");
//	      props.setProperty("dataSource.password", "123");
//	      props.setProperty("dataSource.databaseName", "XEPDB1");
//	      props.put("dataSource.logWriter", new PrintWriter(System.out));
//	      
//	      HikariConfig config = new HikariConfig(props);
//	      HikariDataSource ds = new HikariDataSource(config);   
//	      
//	      try {	    	
//			Connection conn = ds.getConnection();
//			String sql = "INSERT INTO blacklist select*from custom where c_id = ?";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1,c_id);	
//			System.out.println("회원 ID로 블랙리스트 등록 완료");
//			pstmt.executeUpdate();
//			
//			if(pstmt != null) pstmt.close();
//			if(conn != null) conn.close();			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//////////////////////////////////////////////////////////////////////////	      
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
			String sql = "INSERT INTO blacklist values (?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Custom_Controller.id);
			pstmt.setString(2, Custom_Controller.c_name);
			pstmt.setInt(3, Custom_Controller.c_age);
			pstmt.setString(4, Custom_Controller.c_gender);
			pstmt.setString(5, Custom_Controller.c_phone);
			pstmt.setString(6, Custom_Controller.c_email);
			pstmt.setString(7, Custom_Controller.c_addr);
			pstmt.setString(8, Custom_Controller.c_card);
			System.out.println("카드 번호로 블랙리스트 등록 완료");
			pstmt.executeUpdate();
			String black = "BLACK";
			String sql2 = "UPDATE CUSTOM SET black_Whether = '" + black +"' WHERE C_CARD = ?";
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
    }
	      

	
	

