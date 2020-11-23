package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.regex.Pattern;

public class E03_JoinMember_ME {
	// 1. ����ڰ� �ڽ��� ���������� �Է��ϸ�
	// �� ������ ������� �̸����� �� ���Ͽ� �����غ��ÿ�.

	// 2. ������� �̸��� ���޹����� �ش� ����ڰ�
	// ���Ե� ȸ���̶�� ���Ͽ��� ������ �о� ������ְ�
	// ���� ���Ե��� ���� ����̶�� ���Ե��� �ʾҴٰ� ����ϴ� �޼���

	// 3. ����� ������� ������ ������ �� �ִ� �޼��带 �����غ��ÿ�.

	// �� D:\\java_io\\member\\ ���丮�� ������ ��.

	public static boolean join() {

		try {
			System.out.print("�̸� >> ");
			String name = new Scanner(System.in).next();
			System.out.print("��ȭ��ȣ >> ");
			String phoneNumber = new Scanner(System.in).next();
			if (!(Pattern.matches("01[01679]-[\\d]{3,4}-[\\d]{4}", phoneNumber)
					&& Pattern.matches("[[^a-z][^A-Z][^��-�R]]", name))) {
				if (!Pattern.matches("[[^a-z][^A-Z][^��-�R]]", name)) {
					System.err.println("�̸��� ������ �ѱ۸� �����մϴ�.");
					return false;
				} else {
					System.err.println("�޴��� ��ȣ�� 10-11�ڸ� ���ڸ� �����մϴ�.");
				}
				return false;
			}
			System.out.println("<< ȸ�� ���� >>");
			PrintWriter pw = new PrintWriter(new BufferedWriter(
					new FileWriter("D:\\java_io\\member\\" + name + ".txt"), 4096));
			pw.printf("�̸�\t:  %s\n��ȭ��ȣ\t:  %s", name, phoneNumber);
			pw.close();
			System.out.printf("�̸�\t:  %s\n��ȭ��ȣ\t:  %s\n", name, phoneNumber);
			System.out.println("\t---- ȸ������ �Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� ���߽��ϴ�.");
			return false;
		} catch (UnsupportedEncodingException e) {
			System.err.println("�߸��� ���ڵ� ����Դϴ�.");
			return false;
		} catch (IOException e) {
			System.err.println("����/�ݱ� ���� ���� �߻�");
			return false;
		}
		System.out.println();
		return true;
	}

	public static boolean myPage() throws IOException {
		System.out.print("�̸� >> ");
		String name = new Scanner(System.in).next();
		BufferedReader br = null;
		try {
			System.out.println("<< ���������� >>");
			br = new BufferedReader(new FileReader("D:\\java_io\\member\\" + name + ".txt"),
					4096);
			int ch;
			while ((ch = br.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.err.println("���Ե��� �ʾҽ��ϴ�. ȸ������ ���ּ���.");
			return false;
		} catch (UnsupportedEncodingException e) {
			System.err.println("�߸��� ���ڵ� ����Դϴ�.");
			return false;
		} catch (IOException e) {
			System.err.println("����/�ݱ� ���� ���� �߻�");
			return false;
		} finally {
			if(br!=null)
				br.close();
			System.out.println();
		}
		return true;
	}

	public static void modify() {
		try {
			System.out.println("<< �������� >>");
			System.out.print("�̸� >> ");
			String name = new Scanner(System.in).next();
			FileReader fr = new FileReader("D:\\java_io\\member\\" + name + ".txt");
			BufferedReader br = new BufferedReader(fr, 4096);
			System.out.println("���� ����");
			int ch;
			while ((ch = br.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
			System.out.print("���� �� ��ȭ��ȣ �Է� \n>> ");
			String phoneNumber = new Scanner(System.in).next();
			FileWriter fw = new FileWriter("D:\\java_io\\member\\" + name + ".txt");

			BufferedWriter bw = new BufferedWriter(fw, 4096);

			PrintWriter pw = new PrintWriter(bw);
			pw.printf("");
			pw.printf("�̸�\t:  %s\n��ȭ��ȣ\t:  %s", name, phoneNumber);
			if (!(Pattern.matches("01[01679]-[\\d]{3,4}-[\\d]{4}", phoneNumber))) {
				System.err.println("�޴��� ��ȣ�� 10-11�ڸ� ���ڸ� �����մϴ�.");
				return;
			}
			System.out.println("\t---- ������ ����Ǿ����ϴ�.");
			System.out.println();
			pw.close();
			bw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.err.println("���Ե��� �ʾҽ��ϴ�. ȸ������ ���ּ���.");
		} catch (UnsupportedEncodingException e) {
			System.err.println("�߸��� ���ڵ� ����Դϴ�.");
		} catch (IOException e) {
			System.err.println("����/�ݱ� ���� ���� �߻�");
		} finally {
			System.out.println();
		}
	}

	public static void sideMenu() {
		System.out.println("1.���� 2.������");
		int menu = new Scanner(System.in).nextInt();
		if (menu == 1) {
			modify();
			return;
		} else {
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}
	}

	public static void fullMenu() {
		while (true) {
			System.out.println("HOME");
			System.out.print("1. �α��� 2. ȸ������ 3.������\n >> ");
			int menu = new Scanner(System.in).nextInt();
			if (!(menu == 1 || menu == 2 || menu == 3)) {
				System.err.println("�޴��� �ٽ� �������ּ���.");
			}
			switch (menu) {
			case 1:
				try {
					myPage();
					if (myPage()) {
						sideMenu();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				return;
			case 2:
				join();
				if (join()) {
					sideMenu();
				}
				return;
			default:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}

	}

	public static void main(String[] args) {
		fullMenu();
	}

}
