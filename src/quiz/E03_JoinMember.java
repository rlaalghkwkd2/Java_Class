package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class E03_JoinMember {

	// 1. ����ڰ� �ڽ��� �������� ������ �Է��ϸ�
	// �� ������ ������� �̸����� �� ���Ͽ� �����غ�����

	// 2. ������� �̸��� ���޹����� �ش� ����ڰ�
	// (1) ���Ե� ȸ���̶�� ���Ͽ��� ������ �о� ���
	// (2) ���� ���Ե��� ���� ����̶�� ���Ե��� �ʾҴٰ� ���
	// ���ִ� �޼��带 �ۼ��غ�����

	// 3. ����� ������� ������ ������ �� �ִ� �޼��带 �����غ�����

	// �� D:\\java_io\\member\\ ���丮�� ������ ��
	static class Member {
		String name;
		int age;
		String blood_type;
		String tel;

		public Member(String name, int age, String blood_type, String tel) {
			this.name = name;
			this.age = age;
			this.blood_type = blood_type;
			this.tel = tel;
		}

		public Member update(Member to_update) {
			return new Member(this.name, to_update.age == -1 ? this.age : to_update.age,
					to_update.blood_type == null ? this.blood_type : to_update.blood_type,
					to_update.tel == null ? this.tel : to_update.tel);
		}

		@Override
		public String toString() {
			return String.format("%s/%d/%s/%s", name, age, blood_type, tel);
		}
	}

	public static boolean checkNotMember(String name) throws IOException {
		String dir = "D:\\java_io\\member\\";
		String filename = name + ".txt";

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(dir + filename));

			String[] data = br.readLine().split("/");
			System.out.printf("<< '%s'���� ����>>\n", data[0]);
			System.out.println("�̸� : " + data[0]);
			System.out.println("���� : " + data[1]);
			System.out.println("������ : " + data[2]);
			System.out.println("Tel : " + data[3]);

			return false;
		} catch (FileNotFoundException e) {
			System.out.println("[System] - ȸ�������� �����մϴ�");
			return true;
		} finally {
			if (br != null)
				br.close();
		}
	}

	public static void modify(Member to_update) throws IOException {
		// to_update�� �̸��� �������� ���� �������� �����ǰ� �������� �����ǵ��� �����
		String dir = "D:\\java_io\\member";
		String filename = to_update.name + ".txt";
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			// �켱 ���� �����͸� �о���δ�.
			br = new BufferedReader(new FileReader(dir + filename));
			String[] data = br.readLine().split("/");
			
			Member before = new Member(
					data[0],
					Integer.parseInt(data[1]),
					data[2],
					data[3]);

			// �⺻�����͸� ���ο� �����ͷ� �����.
			Member after = before.update(to_update);
			// �ϼ��� �����͸� ���Ͽ� ���о��.
			pw = new PrintWriter(
					new BufferedWriter(new FileWriter(dir + filename)));

			// MemberŬ������ toString�� �̿��Ѵ�.
			pw.print(after);

		} finally {
			if (pw != null)
				pw.close();
			if (br != null)
				br.close();
		}
	}



	public static void save(Member info) throws IOException {
		String dir = "D:\\java_io\\member\\";
		String filename = info.name + ".txt";

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(dir + filename)));

		pw.print(info);

		pw.close();
	}

	public static void main(String[] args) throws IOException {
//		modify(new Member("�踻��", 24, "O", "010-6548-6578"));

		try {
			// InputStreamReader : InputStream�� ���ڷ� ��ȯ (byte -> char)
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("�̸� > ");
			String name = br.readLine();

			if (checkNotMember(name)) {
				System.out.print("���� > ");
				int age = Integer.parseInt(br.readLine());

				System.out.print("������ > ");
				String blood_type = br.readLine();

				System.out.print("��ȭ��ȣ > ");
				String tel = br.readLine();

				save(new Member(name, age, blood_type, tel));

				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}