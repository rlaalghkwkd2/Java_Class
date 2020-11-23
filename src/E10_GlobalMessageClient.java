import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class E10_GlobalMessageClient {
	public static void main(String[] args) {
//118.130.22.163
		Socket s;
		try {
			s = new Socket("118.130.22.175", 3444);

			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			while (true) {
				// �������� ������ �޼����� ��ٸ�
				System.out.println(br.readLine());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}