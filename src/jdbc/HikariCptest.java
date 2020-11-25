package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCptest {

	
	public static void main(String[] args) {
		
		
	      // HikariConfig ��ü�� ������ ���� �� DataSource �����ڿ� ����
//      HikariConfig config =  new  HikariConfig ();
//      config . setJdbcUrl ( " jdbc:oracle:thin:@localhost:1521/XEPDB1 " );
//      config . setUsername ( " hr " );
//      config . setPassword ( " 1234 " );
//      config . addDataSourceProperty ( " cachePrepStmts " , " true " );
//      config . addDataSourceProperty ( " prepStmtCacheSize " , " 250 " );
//      config . addDataSourceProperty ( " prepStmtCacheSqlLimit " , " 2048 " );
		
		
//2. Config ����� �������� �ϴ¹�      
//      HikariDataSource ds = new HikariDataSource();
//      ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
//      ds.setUsername("hr");
//      ds.setPassword("1234");
		
//3. ���� ���Ͽ� ����� ���� �̿��ϴ� ���
      //Map, ��ųʸ�, Property, Entry, JSON.. �����͸� Key=Value���·� �ٷ�� �͵�
      
      //3.2 ������Ʈ ������ ��θ� ã�ư� �� (/ or \\)
      HikariConfig config = new HikariConfig("some/path/hikari.properties");
      HikariDataSource ds = new HikariDataSource(config);
		
		try {
			Connection conn = ds.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%10s\t%10s\t%10d\t%10d\n",
						rs.getString("last_name"),
						rs.getString("first_name"),
						rs.getInt("salary"), 
						rs.getInt("department_id"));
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
			// slf4j ���̺� 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
