package project01.contoller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import javax.swing.JTextArea;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Custom_Select_Controller {
	public static Integer id;
	public static String c_name;
	public static Integer c_age;
	public static String c_gender;	
	public static String c_email;	
	public static String c_phone;	
	public static String c_addr;	
	public static String c_card;	
	public static String black_Whether;
	
	public static ArrayList<String> dataSize = new ArrayList<String>();
	public static ArrayList<String> mo = new ArrayList<String>();

	
	public  void Custom_Card_select(String card) {
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
			String sql = "SELECT * FROM CUSTOM WHERE card = ?"; 
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, card);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("고객Number%d\n이름:%s\n나이:%d\n성별:%s\n핸드폰:%s\n이메일:%s\n주소:%s\n카드번호:%s\nblack_Whether%s"
						,
			this.id = rs.getInt("id"),
			this.c_name = rs.getString("name"),
			this.c_age = rs.getInt("age"),
			this.c_gender = rs.getString("gender"),
			this.c_phone = rs.getString("phone"),
			this.c_email = rs.getString("email"),
			this.c_addr = rs.getString("addr"),
			this.c_card = rs.getString("card"),
			this.black_Whether = rs.getString("black_Whether"),
					this.mo.add(id.toString()),
					this.mo.add(c_name),
					this.mo.add(c_age.toString()),
					this.mo.add(c_gender),
					this.mo.add(c_phone),
					this.mo.add(c_email),
					this.mo.add(c_addr),
					this.mo.add(c_card),											
					this.mo.add(black_Whether)			
						);
//			System.out.println(mo);
			System.out.println("회원 카드번호로 정보 조회");
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
	
	
	public void Custom_Name_Select(String name) {
		
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
			String sql = "SELECT * from CUSTOM WHERE name = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("고객Number%d\n이름:%s\n나이:%d\n성별:%s\n핸드폰:%s\n이메일:%s\n주소:%s\n카드번호:%s\nblack_Whether%s"
						,
			this.id = rs.getInt("id"),
			this.c_name = rs.getString("name"),
			this.c_age = rs.getInt("age"),
			this.c_gender = rs.getString("gender"),
			this.c_phone = rs.getString("phone"),
			this.c_email = rs.getString("email"),
			this.c_addr = rs.getString("addr"),
			this.c_card = rs.getString("card"),
			this.black_Whether = rs.getString("black_Whether"),
					this.mo.add(id.toString()),
					this.mo.add(c_name),
					this.mo.add(c_age.toString()),
					this.mo.add(c_gender),
					this.mo.add(c_phone),
					this.mo.add(c_email),
					this.mo.add(c_addr),
					this.mo.add(c_card),											
					this.mo.add(black_Whether)
				);
//				System.out.println(mo);
				System.out.println("회원 이름으로 정보 조회");
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
	
	   public void allSelect() {
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
				String sql = "SELECT * FROM CUSTOM";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					
				this.id = rs.getInt("id");
				this.c_name = rs.getString("name");
				this.c_age = rs.getInt("age");
				this.c_gender = rs.getString("gender");
				this.c_phone = rs.getString("phone");
				this.c_email = rs.getString("email");
				this.c_addr = rs.getString("addr");
				this.c_card = rs.getString("card");
				this.black_Whether = rs.getString("black_Whether");
						this.mo.add(id.toString());
						this.mo.add(c_name);
						this.mo.add(c_age.toString());
						this.mo.add(c_gender);
						this.mo.add(c_phone);
						this.mo.add(c_email);
						this.mo.add(c_addr);
						this.mo.add(c_card);									
						this.mo.add(black_Whether);			


				} 		
//				System.out.println(mo);
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
	
	   
	  
	
	
	
}















