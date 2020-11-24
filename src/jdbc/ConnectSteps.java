package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectSteps {

	// # jdbc
	// - Java Database Connectivity
	// - DB�� �������� �����Ͽ� �����ϰ� ����� �޾ƿ� �� �ִ� Java ApI
	// - Java �κ��� �ҽ��� � DB�� ����ϴ��� �׻� �����ϴ�
	// - DB�� ������ �ʿ��� jdbc�� ���Ŀ� ���߱� ������ ���α׷��ӵ��� ���ϰ� ����� �� �ִ�

	// # OJDBC
	// - Oracle �����ͺ��̽��� ��ġ�ϸ� �����Ǵ� JDBC
	// - sqldeveloper/jdbc/lib�� �ִ�.

	public static void main(String[] args) {
		// �� � DB�� ����ϴ��� ��ԵǴ� �Ȱ��� ������
		// 1. Class.forName(drivername)���� �ش� DB���� jdbc����̹��� �ε��Ѵ�

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("[ojdbc] ���������� �ε�Ǿ����ϴ�");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "123");
			System.out.println("���� �����߽��ϴ�.");

			// 3. ��ȯ�� ���ῡ ����� �������� �غ��Ѵ�.(;�� ������� �ʴ´�)
			PreparedStatement pstmt = conn.prepareStatement(
					"SELECT * FROM employees " + "WHERE department_id IN (?, ?, ?, ?) AND " + "last_name LIKE ?");

			// 3-1. �غ��� ������ ?�� �ִٸ� setType�� ���� ���� ä���� �Ѵ�.
			pstmt.setInt(1, 10);
			pstmt.setInt(2, 20);
			pstmt.setInt(3, 30);
			pstmt.setInt(4, 50);
			pstmt.setString(5, "%a%");

			// 3-2. �غ�� ������ �����Ѵ�.
			// ������ SELECT���� ��� ����� Set���� �޾ƿ´�.
			ResultSet rs = pstmt.executeQuery();

			// 2. DriverManager Ŭ������ ���� DB���� ������ ����
			// - DriverManager.getConnection() �޼��忡
			// - DB���� �ּҿ� ���̵�/�н����带 �����ϸ� ������ ��ȯ�ȴ�.

			// 4. ��ȯ�� ����� ����Ѵ�.
			System.out.println("LAST_NANE\tFIRST_NAME\tSALARY\tDEPARTMENT_ID\n");
			while (rs.next()) {
				System.out.printf("%10s\t%10s\t%10d\t%10d\n", rs.getString("last_name"), rs.getString("first_name"),
						rs.getInt("salary"), rs.getInt("department_id"));
				rs.getString("last_name");
			}

			// 5. ���ῡ ���� ��� ��ü�� ������� �ݾ��ش�
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			System.out.println("�к��� �������߽��ϴ�.");
		} catch (ClassNotFoundException e) {
			System.out.println("[ojdbc] Ŭ���� ��ΰ� Ʋ�ǽ��ϴ�");
		}

	}
}
