import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class E09_Client {

	public static void main(String[] args) {

		// E08�� �����ϴ� ���α׷�
//		while (true) {
			try {
				Socket s = new Socket("localhost", 3456);
				System.out.println("���ῡ �����߽��ϴ�.");
				PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

				System.out.println("Enter�� ������ ������ �޼����� �����մϴ�.");

				out.println("[Client] dddd!");
				out.close();
				s.close();

				System.out.println("�޼����� ���������� �����߽��ϴ�.");
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

//		}

	}

}