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
	// 1. »ç¿ëÀÚ°¡ ÀÚ½ÅÀÇ °³ÀÎÁ¤º¸¸¦ ÀÔ·ÂÇÏ¸é
	// ±× Á¤º¸¸¦ »ç¿ëÀÚÀÇ ÀÌ¸§À¸·Î µÈ ÆÄÀÏ¿¡ ÀúÀåÇØº¸½Ã¿À.

	// 2. »ç¿ëÀÚÀÇ ÀÌ¸§À» Àü´Þ¹ÞÀ¸¸é ÇØ´ç »ç¿ëÀÚ°¡
	// °¡ÀÔµÈ È¸¿øÀÌ¶ó¸é ÆÄÀÏ¿¡¼­ Á¤º¸¸¦ ÀÐ¾î Ãâ·ÂÇØÁÖ°í
	// ¾ÆÁ÷ °¡ÀÔµÇÁö ¾ÊÀº »ç¶÷ÀÌ¶ó¸é °¡ÀÔµÇÁö ¾Ê¾Ò´Ù°í Ãâ·ÂÇÏ´Â ¸Þ¼­µå

	// 3. ÀúÀåµÈ »ç¿ëÀÚÀÇ Á¤º¸¸¦ ¼öÁ¤ÇÒ ¼ö ÀÖ´Â ¸Þ¼­µå¸¦ ±¸ÇöÇØº¸½Ã¿À.

	// ¡Ø D:\\java_io\\member\\ µð·ºÅä¸®¿¡ ÀúÀåÇÒ °Í.

	public static boolean join() {

		try {
			System.out.print("ÀÌ¸§ >> ");
			String name = new Scanner(System.in).next();
			System.out.print("ÀüÈ­¹øÈ£ >> ");
			String phoneNumber = new Scanner(System.in).next();
			if (!(Pattern.matches("01[01679]-[\\d]{3,4}-[\\d]{4}", phoneNumber)
					&& Pattern.matches("[[^a-z][^A-Z][^°¡-ÆR]]", name))) {
				if (!Pattern.matches("[[^a-z][^A-Z][^°¡-ÆR]]", name)) {
					System.err.println("ÀÌ¸§Àº ¿µ¹®ÀÚ ÇÑ±Û¸¸ °¡´ÉÇÕ´Ï´Ù.");
					return false;
				} else {
					System.err.println("ÈÞ´ëÆù ¹øÈ£´Â 10-11ÀÚ¸® ¼ýÀÚ¸¸ °¡´ÉÇÕ´Ï´Ù.");
				}
				return false;
			}
			System.out.println("<< È¸¿ø °¡ÀÔ >>");
			PrintWriter pw = new PrintWriter(new BufferedWriter(
					new FileWriter("D:\\java_io\\member\\" + name + ".txt"), 4096));
			pw.printf("ÀÌ¸§\t:  %s\nÀüÈ­¹øÈ£\t:  %s", name, phoneNumber);
			pw.close();
			System.out.printf("ÀÌ¸§\t:  %s\nÀüÈ­¹øÈ£\t:  %s\n", name, phoneNumber);
			System.out.println("\t---- È¸¿ø°¡ÀÔ µÇ¾ú½À´Ï´Ù.");
		} catch (FileNotFoundException e) {
			System.err.println("ÆÄÀÏÀ» Ã£Áö ¸øÇß½À´Ï´Ù.");
			return false;
		} catch (UnsupportedEncodingException e) {
			System.err.println("Àß¸øµÈ ÀÎÄÚµù ¹æ½ÄÀÔ´Ï´Ù.");
			return false;
		} catch (IOException e) {
			System.err.println("¾²±â/´Ý±â µµÁß ¿¡·¯ ¹ß»ý");
			return false;
		}
		System.out.println();
		return true;
	}

	public static boolean myPage() throws IOException {
		System.out.print("ÀÌ¸§ >> ");
		String name = new Scanner(System.in).next();
		BufferedReader br = null;
		try {
			System.out.println("<< ¸¶ÀÌÆäÀÌÁö >>");
			br = new BufferedReader(new FileReader("D:\\java_io\\member\\" + name + ".txt"),
					4096);
			int ch;
			while ((ch = br.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.err.println("°¡ÀÔµÇÁö ¾Ê¾Ò½À´Ï´Ù. È¸¿ø°¡ÀÔ ÇØÁÖ¼¼¿ä.");
			return false;
		} catch (UnsupportedEncodingException e) {
			System.err.println("Àß¸øµÈ ÀÎÄÚµù ¹æ½ÄÀÔ´Ï´Ù.");
			return false;
		} catch (IOException e) {
			System.err.println("¾²±â/´Ý±â µµÁß ¿¡·¯ ¹ß»ý");
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
			System.out.println("<< Á¤º¸¼öÁ¤ >>");
			System.out.print("ÀÌ¸§ >> ");
			String name = new Scanner(System.in).next();
			FileReader fr = new FileReader("D:\\java_io\\member\\" + name + ".txt");
			BufferedReader br = new BufferedReader(fr, 4096);
			System.out.println("ÇöÀç Á¤º¸");
			int ch;
			while ((ch = br.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
			System.out.print("º¯°æ ÇÒ ÀüÈ­¹øÈ£ ÀÔ·Â \n>> ");
			String phoneNumber = new Scanner(System.in).next();
			FileWriter fw = new FileWriter("D:\\java_io\\member\\" + name + ".txt");

			BufferedWriter bw = new BufferedWriter(fw, 4096);

			PrintWriter pw = new PrintWriter(bw);
			pw.printf("");
			pw.printf("ÀÌ¸§\t:  %s\nÀüÈ­¹øÈ£\t:  %s", name, phoneNumber);
			if (!(Pattern.matches("01[01679]-[\\d]{3,4}-[\\d]{4}", phoneNumber))) {
				System.err.println("ÈÞ´ëÆù ¹øÈ£´Â 10-11ÀÚ¸® ¼ýÀÚ¸¸ °¡´ÉÇÕ´Ï´Ù.");
				return;
			}
			System.out.println("\t---- Á¤º¸°¡ º¯°æµÇ¾ú½À´Ï´Ù.");
			System.out.println();
			pw.close();
			bw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.err.println("°¡ÀÔµÇÁö ¾Ê¾Ò½À´Ï´Ù. È¸¿ø°¡ÀÔ ÇØÁÖ¼¼¿ä.");
		} catch (UnsupportedEncodingException e) {
			System.err.println("Àß¸øµÈ ÀÎÄÚµù ¹æ½ÄÀÔ´Ï´Ù.");
		} catch (IOException e) {
			System.err.println("¾²±â/´Ý±â µµÁß ¿¡·¯ ¹ß»ý");
		} finally {
			System.out.println();
		}
	}

	public static void sideMenu() {
		System.out.println("1.¼öÁ¤ 2.³ª°¡±â");
		int menu = new Scanner(System.in).nextInt();
		if (menu == 1) {
			modify();
			return;
		} else {
			System.out.println("ÇÁ·Î±×·¥À» Á¾·áÇÕ´Ï´Ù.");
			return;
		}
	}

	public static void fullMenu() {
		while (true) {
			System.out.println("HOME");
			System.out.print("1. ·Î±×ÀÎ 2. È¸¿ø°¡ÀÔ 3.³ª°¡±â\n >> ");
			int menu = new Scanner(System.in).nextInt();
			if (!(menu == 1 || menu == 2 || menu == 3)) {
				System.err.println("¸Þ´º¸¦ ´Ù½Ã ¼±ÅÃÇØÁÖ¼¼¿ä.");
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
				System.out.println("ÇÁ·Î±×·¥À» Á¾·áÇÕ´Ï´Ù.");
				return;
			}
		}

	}

	public static void main(String[] args) {
		fullMenu();
	}

}
