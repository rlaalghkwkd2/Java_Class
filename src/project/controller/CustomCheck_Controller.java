package project.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.TimeZone;
import java.sql.ResultSet;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


public class CustomCheck_Controller  {
	

	public static String name;
	public static Integer count;
	public static Integer size;
	public static Integer price;
	public static String purchaseDay;
	public static Integer currentPoint;
	public static String card;
	public static ArrayList<String> mo = new ArrayList<String>();
	
	
	public void ShowCustom(String card) {
	
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
				String sql = "SELECT * FROM ABC" +card;
				
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.printf("이름%s\n재고%d\n사이즈%d\n가격%d\n날짜%s\n포인트%d",
						this.name = rs.getString("sh_name"),
						this.count = rs.getInt("sh_count"),
						this.size = rs.getInt("sh_size"),
						this.price = rs.getInt("sh_price"),
						this.purchaseDay = rs.getString("purchase_day"),
						this.currentPoint = rs.getInt("current_point"),					
						this.mo.add(name),				
						this.mo.add(count.toString()),					
						this.mo.add(size.toString()),					
						this.mo.add(price.toString()),					
						this.mo.add(purchaseDay),				
						this.mo.add(currentPoint.toString())
							);
					System.out.println(mo);
				}			
				
				if(rs != null) 
					rs.close();				
				if(pstmt != null) 
					pstmt.close();				
				if(conn != null) 
					conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
}




	
}
