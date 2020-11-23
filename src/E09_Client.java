import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class E09_Client {

	public static void main(String[] args) {

		// E08에 접속하는 프로그램
//		while (true) {
			try {
				Socket s = new Socket("localhost", 3456);
				System.out.println("연결에 성공했습니다.");
				PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

				System.out.println("Enter를 누르면 서버로 메세지를 전송합니다.");

				out.println("[Client] dddd!");
				out.close();
				s.close();

				System.out.println("메세지를 성공적으로 전송했습니다.");
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

//		}

	}

}