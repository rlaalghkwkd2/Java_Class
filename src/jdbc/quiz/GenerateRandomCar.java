package jdbc.quiz;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenerateRandomCar {

	// Hash�� index�� ���� ������ �ϳ��� ���� ���� ����.
//			for (int i : even) {
//				System.out.println("�ϳ��� ������ ��� : " + i);
//			}

	// ���� ���� ���� �ڵ������� 100�� �����Ǿ� DB�� ����Ǵ� ���Τñ׷��� ��������

	// ���� ��ȣ������ ��ȣ�� ����
	// https://post.naver.com/viewer/postView.nhn?volumeNo=24171702&memberNo=35787715

	// ��ȣ�� ���� ������ �ڿ� ��ȣ�� ���� �����Ǵ� ���� �����Ͽ�
	// ���� ��ü�� ������ �� DB�� �˸°� �����غ�����

	// JAVA�ڵ�� db��ũ������ �����ֽø� �˴ϴ�

	public static void main(String[] args) {
		
		try {
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "123");
			String sql = "INSERT INTO random_car_table values (?, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);

			for(int i = 0; i < 100; i++) {
				Car car = Car.ran();
				pstmt.setString(1, car.getPlateNumber());
				pstmt.setString(2, car.getUsage());
				pstmt.setString(3, car.getCtype());
				pstmt.addBatch();
//				int row = pstmt.executeUpdate();
//				System.out.println(row + "���� ������Ʈ �Ǿ����ϴ�");
			}
			
			// ��Ҵٰ� �ѹ��� executeBatch()�ϸ� �� ������ �������� �迭�� ��ȯ�ȴ�.
			int[] rows = pstmt.executeBatch();
			System.out.println(Arrays.toString(rows));

			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
			System.out.println("�۾� �Ϸ�");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}



//���������� ������ ResultSet�� ���� ���� ��� ��ü
//			ResultSetMetaData rsmd = rs.getMetaData();

// System.out.println("�÷� ���� : " +rsmd.getColumnCount());
// for(int i = 1; i <= rsmd.getColumnCount(); i++) {
//	System.out.println(i + "���� �÷� ����: ");
//					
//	System.out.println("\t�÷��� �̸� : " + rsmd.getColumnName(i) );
//	System.out.println("\t�÷��� Ÿ�� ��ȣ : " + rsmd.getColumnType(i) );
//	System.out.println("\t�÷��� Ÿ��  �̸�: " + rsmd.getColumnTypeName(i) );
//	
//
//				
//	System.out.println("\t�÷� ũ�� : " + rsmd.getColumnDisplaySize(i) );			
//}
