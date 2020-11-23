package jdbc;

public class ConnectSteps {
	
	// # jdbc
	//	- Java Database Connectivity
	//	- DB에 쿼리문을 전달하여 실행하고 결과를 받아올 수 있는 Java ApI
	//	- Java 부분의 소스는 어떤 DB를 사용하더라도 항상 일정하다
	//	- DB를 제작한 쪽에서 jdbc의 형식에 맞추기 떄문에 프로그래머들은 편리하게 사용할 수 있다
	
	// # OJDBC
	//	- Oracle 데이터베이스를 설치하면 제공되는 JDBC
	//	- sqldeveloper/jdbc/lib에 있다.
	
	public static void main(String[] args) {
		// ※ 어떤 DB를 사용하더라도 밟게되는 똑같은 절차들
		// 1. Class.forName(drivername)으로 해당 DB사의 jdbc드라이버를 로드한다
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("성공적으로 로드되었습니다");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 경로가 틀렷습니다");
			e.printStackTrace();
		}
	}
}
