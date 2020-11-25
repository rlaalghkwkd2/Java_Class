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

	// Hash은 index가 없기 때문에 하나만 꺼낼 수가 없다.
//			for (int i : even) {
//				System.out.println("하나씩 꺼내서 사용 : " + i);
//			}

	// 랜덤 값을 가진 자동차들이 100대 생성되어 DB에 저장되는 프로ㅓ그램을 만들어보세요

	// 차량 번호판차량 번호판 정보
	// https://post.naver.com/viewer/postView.nhn?volumeNo=24171702&memberNo=35787715

	// 번호를 랜덤 생성한 뒤에 번호에 따라 결정되는 것을 적용하여
	// 차량 객체를 생성한 후 DB에 알맞게 저장해보세요

	// JAVA코드와 db스크린샷을 보여주시면 됩니다

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
//				System.out.println(row + "행이 업데이트 되었습니다");
			}
			
			// 모았다가 한번에 executeBatch()하면 각 쿼리의 실행결과가 배열로 반환된다.
			int[] rows = pstmt.executeBatch();
			System.out.println(Arrays.toString(rows));

			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
			System.out.println("작업 완료");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}



//쿼리문으로 가져온 ResultSet에 대한 정보 목록 객체
//			ResultSetMetaData rsmd = rs.getMetaData();

// System.out.println("컬럼 개수 : " +rsmd.getColumnCount());
// for(int i = 1; i <= rsmd.getColumnCount(); i++) {
//	System.out.println(i + "번쨰 컬럼 정보: ");
//					
//	System.out.println("\t컬럼의 이름 : " + rsmd.getColumnName(i) );
//	System.out.println("\t컬럼의 타입 번호 : " + rsmd.getColumnType(i) );
//	System.out.println("\t컬럼의 타입  이름: " + rsmd.getColumnTypeName(i) );
//	
//
//				
//	System.out.println("\t컬럼 크기 : " + rsmd.getColumnDisplaySize(i) );			
//}
