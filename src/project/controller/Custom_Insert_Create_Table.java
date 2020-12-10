package project.controller;

import java.io.PrintWriter;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.smartcardio.Card;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.method.Create_card;
import project.swing_view.Custom_Input_View;


public class Custom_Insert_Create_Table {
	Create_card cards = new Create_card();
	Custom_Input_View custom = new Custom_Input_View();
	String name;
	int age;
	String gender;
	String email;
	String tel;
	String addr;
	String card;
	String black;
	
public void Custom_insert_create_table_info(String name, int age, String gender, String email, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.tel = tel;
		this.addr = addr;
		this.card = cards.inputCard();
	 
		Properties props = new Properties();
	      props.setProperty("JdbcUrl", "jdbc:oracle:thin:@localhost:1521/XEPDB1");
	      props.setProperty("dataSource.user", "hr");
	      props.setProperty("dataSource.password", "123");
	      props.setProperty("dataSource.databaseName", "XEPDB1");
	      props.put("dataSource.logWriter", new PrintWriter(System.out));

	      HikariConfig config = new HikariConfig(props);
	      HikariDataSource ds = new HikariDataSource(config);     
	      try {
	    	boolean flag = false;
	    	
			Connection conn = ds.getConnection();
			String sql = "INSERT INTO custom values(custom_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?)";		
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,this.name);
			pstmt.setInt(2, this.age);
			pstmt.setString(3, this.gender);
			pstmt.setString(4, this.tel);
			pstmt.setString(5, this.email);
			pstmt.setString(6, this.addr);
			pstmt.setString(7, this.card);
			pstmt.setString(7, this.card);
			pstmt.setString(8, "No_Black");
			flag = true;
			System.out.println("신규 회원 등록 완료");
			
			pstmt.executeUpdate();
						
			String sql2 = "CREATE TABLE ABC"+ this.card			
			+" (sh_name varchar(40),"
			+"SH_COUNT NUMBER(3),"
			+"sh_size NUMBER(3),"
			+"sh_price number(10),"
			+"Purchase_day DATE,"
			+"current_point NUMBER (20) not null)";
			
//			+" CONSTRAINT Purchaseday_nn"+this.card+" NOT NULL,"
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			System.out.println("회원 정보 저장소 생성");
			pstmt2.executeUpdate();
						
			if(pstmt != null) pstmt.close();
			if(pstmt2 != null) pstmt.close();
			if(conn != null) conn.close();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	}

	



	}
