package jdbc;

public class ConnectSteps {
	
	// # jdbc
	//	- Java Database Connectivity
	//	- DB�� �������� �����Ͽ� �����ϰ� ����� �޾ƿ� �� �ִ� Java ApI
	//	- Java �κ��� �ҽ��� � DB�� ����ϴ��� �׻� �����ϴ�
	//	- DB�� ������ �ʿ��� jdbc�� ���Ŀ� ���߱� ������ ���α׷��ӵ��� ���ϰ� ����� �� �ִ�
	
	// # OJDBC
	//	- Oracle �����ͺ��̽��� ��ġ�ϸ� �����Ǵ� JDBC
	//	- sqldeveloper/jdbc/lib�� �ִ�.
	
	public static void main(String[] args) {
		// �� � DB�� ����ϴ��� ��ԵǴ� �Ȱ��� ������
		// 1. Class.forName(drivername)���� �ش� DB���� jdbc����̹��� �ε��Ѵ�
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("���������� �ε�Ǿ����ϴ�");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� ��ΰ� Ʋ�ǽ��ϴ�");
			e.printStackTrace();
		}
	}
}
