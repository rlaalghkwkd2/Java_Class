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

public class Custom_UpdatdAction_Controller {

	public static Integer id;
	public static String c_name;
	public static Integer c_age;
	public static String c_gender;	
	public static String c_email;	
	public static String c_phone;	
	public static String c_addr;	
	public static String c_card;	
	
	public static ArrayList<String> mo = new ArrayList<String>();
	
	public void Custom_Update_Action(String card) {
		
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
			String sql = "SELECT name,age,gender,phone,email,addr from custom where card = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, card);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("��Number%d\n�̸�:%s\n����:%d\n����:%s\n�ڵ���:%s\n�̸���:%s\n�ּ�:%s"
						,
						this.id = rs.getInt("id"),
						this.c_name = rs.getString("name"),
						this.c_age = rs.getInt("age"),
						this.c_gender = rs.getString("gender"),
						this.c_phone = rs.getString("phone"),
						this.c_email = rs.getString("email"),
						this.c_addr = rs.getString("addr"),
						this.c_card = rs.getString("card"),
								this.mo.add(c_name),
								this.mo.add(c_age.toString()),
								this.mo.add(c_gender),
								this.mo.add(c_phone),
								this.mo.add(c_email),
								this.mo.add(c_addr)																		
									);
						System.out.println(mo);
						System.out.println("ȸ�� ī���ȣ�� ���� ��ȸ");		
			}
			
			
			
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
