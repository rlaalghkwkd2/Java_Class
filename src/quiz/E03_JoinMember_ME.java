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
	// 1. 사용자가 자신의 개인정보를 입력하면
	// 그 정보를 사용자의 이름으로 된 파일에 저장해보시오.

	// 2. 사용자의 이름을 전달받으면 해당 사용자가
	// 가입된 회원이라면 파일에서 정보를 읽어 출력해주고
	// 아직 가입되지 않은 사람이라면 가입되지 않았다고 출력하는 메서드

	// 3. 저장된 사용자의 정보를 수정할 수 있는 메서드를 구현해보시오.

	// ※ D:\\java_io\\member\\ 디렉토리에 저장할 것.

	public static boolean join() {

		try {
			System.out.print("이름 >> ");
			String name = new Scanner(System.in).next();
			System.out.print("전화번호 >> ");
			String phoneNumber = new Scanner(System.in).next();
			if (!(Pattern.matches("01[01679]-[\\d]{3,4}-[\\d]{4}", phoneNumber)
					&& Pattern.matches("[[^a-z][^A-Z][^가-힣]]", name))) {
				if (!Pattern.matches("[[^a-z][^A-Z][^가-힣]]", name)) {
					System.err.println("이름은 영문자 한글만 가능합니다.");
					return false;
				} else {
					System.err.println("휴대폰 번호는 10-11자리 숫자만 가능합니다.");
				}
				return false;
			}
			System.out.println("<< 회원 가입 >>");
			PrintWriter pw = new PrintWriter(new BufferedWriter(
					new FileWriter("D:\\java_io\\member\\" + name + ".txt"), 4096));
			pw.printf("이름\t:  %s\n전화번호\t:  %s", name, phoneNumber);
			pw.close();
			System.out.printf("이름\t:  %s\n전화번호\t:  %s\n", name, phoneNumber);
			System.out.println("\t---- 회원가입 되었습니다.");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다.");
			return false;
		} catch (UnsupportedEncodingException e) {
			System.err.println("잘못된 인코딩 방식입니다.");
			return false;
		} catch (IOException e) {
			System.err.println("쓰기/닫기 도중 에러 발생");
			return false;
		}
		System.out.println();
		return true;
	}

	public static boolean myPage() throws IOException {
		System.out.print("이름 >> ");
		String name = new Scanner(System.in).next();
		BufferedReader br = null;
		try {
			System.out.println("<< 마이페이지 >>");
			br = new BufferedReader(new FileReader("D:\\java_io\\member\\" + name + ".txt"),
					4096);
			int ch;
			while ((ch = br.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.err.println("가입되지 않았습니다. 회원가입 해주세요.");
			return false;
		} catch (UnsupportedEncodingException e) {
			System.err.println("잘못된 인코딩 방식입니다.");
			return false;
		} catch (IOException e) {
			System.err.println("쓰기/닫기 도중 에러 발생");
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
			System.out.println("<< 정보수정 >>");
			System.out.print("이름 >> ");
			String name = new Scanner(System.in).next();
			FileReader fr = new FileReader("D:\\java_io\\member\\" + name + ".txt");
			BufferedReader br = new BufferedReader(fr, 4096);
			System.out.println("현재 정보");
			int ch;
			while ((ch = br.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
			System.out.print("변경 할 전화번호 입력 \n>> ");
			String phoneNumber = new Scanner(System.in).next();
			FileWriter fw = new FileWriter("D:\\java_io\\member\\" + name + ".txt");

			BufferedWriter bw = new BufferedWriter(fw, 4096);

			PrintWriter pw = new PrintWriter(bw);
			pw.printf("");
			pw.printf("이름\t:  %s\n전화번호\t:  %s", name, phoneNumber);
			if (!(Pattern.matches("01[01679]-[\\d]{3,4}-[\\d]{4}", phoneNumber))) {
				System.err.println("휴대폰 번호는 10-11자리 숫자만 가능합니다.");
				return;
			}
			System.out.println("\t---- 정보가 변경되었습니다.");
			System.out.println();
			pw.close();
			bw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.err.println("가입되지 않았습니다. 회원가입 해주세요.");
		} catch (UnsupportedEncodingException e) {
			System.err.println("잘못된 인코딩 방식입니다.");
		} catch (IOException e) {
			System.err.println("쓰기/닫기 도중 에러 발생");
		} finally {
			System.out.println();
		}
	}

	public static void sideMenu() {
		System.out.println("1.수정 2.나가기");
		int menu = new Scanner(System.in).nextInt();
		if (menu == 1) {
			modify();
			return;
		} else {
			System.out.println("프로그램을 종료합니다.");
			return;
		}
	}

	public static void fullMenu() {
		while (true) {
			System.out.println("HOME");
			System.out.print("1. 로그인 2. 회원가입 3.나가기\n >> ");
			int menu = new Scanner(System.in).nextInt();
			if (!(menu == 1 || menu == 2 || menu == 3)) {
				System.err.println("메뉴를 다시 선택해주세요.");
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
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

	public static void main(String[] args) {
		fullMenu();
	}

}
