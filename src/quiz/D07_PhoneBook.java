package quiz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class D07_PhoneBook {
	// # HashMap�� �̿��� PhoneBook�� �����غ��ÿ�.

	// 1. �׷� / ��ȭ��ȣ / �̸��� �����ؾ� �Ѵ�.
	// 2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�.
	// 3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű�� ������ �̸��� ���´�.

	public HashMap<String, HashMap<String, String>> phoneBook;
	public HashMap<String, String> information;

	public D07_PhoneBook() {
		phoneBook = new HashMap<>();
	}
	// # �����ؾ� �� �޼���

	// 1. ���ο� �׷��� �߰��ϴ� �޼���

	public void setGroup(String group) {
		if (!(phoneBook.containsKey(group))) {
			this.phoneBook.put(group, new HashMap<String, String>());
		} else {
			System.out.printf("- \"%s\"�� �̹� �ִ� �׷��Դϴ�.\n", group);
			System.out.println();
		}
	}

	// 2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���

	public boolean setinformation(String group, String number, String name) {
		if(!phoneBook.containsKey(group)) {
			System.out.println("�������� �ʴ� �׷��Դϴ�.");
			return false;
		}
		
		information = phoneBook.get(group);
		if(information.containsKey(number)) {
			System.out.println("- �ش� ������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("- ���ο� ������ �߰��߽��ϴ�.");
		}
		phoneBook.get(group).put(number, name);
		System.out.println();
		return true;
	}

	// 3. ��ϵ� ��� ��ȭ��ȣ�� �������� ����ϴ� �޼���
	public void printPhoneBook() {
		for (String group : phoneBook.keySet()) {
			System.out.println("## " + group + "�׷� ��� ##");
			int i = 1;
			for (String num : phoneBook.get(group).keySet()) {
				System.out.println(i +". " + phoneBook.get(group).get(num) + " : " + num);
				i ++;
			}
			System.out.println();
		}
	}

	// 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���

	public void searchName(String name) {
		System.out.println("========================");
		System.out.println("<< ��ȭ��ȣ ã�� �̸� �Է� >>");
		System.out.println("------------------------");
		for (String group : phoneBook.keySet()) {
			for (Entry<String, String> en : phoneBook.get(group).entrySet()) {
				int count = 0;
				for (int i = 0, len = en.getValue().length(); i < len; i++) {
					for (int j = 0; j < name.length(); j++) {
						if (en.getValue().charAt(i) == name.charAt(j)) {
							count++;
						}
						else {
							continue;
						}
					}
				}
				if (count == name.length()) {
					System.out.println(en.getValue());
					System.out.println(en.getKey());
				}
			}
		}
		System.out.println("========================");
		System.out.println();
	}

	public void searchNuber(String number) {
		System.out.println("========================");
		System.out.println("<< ��ȭ��ȣ ã�� ��ȣ �Է� >>");
		System.out.println("------------------------");

		for (String group : phoneBook.keySet()) {
			for (Entry<String, String> en : phoneBook.get(group).entrySet()) {
				int count = 0;
				for (int i = 0, len = en.getKey().length(); i < len; i++) {
					for (int j = 0; j < number.length(); j++) {
						if (en.getKey().charAt(i) == number.charAt(j)) {
							if (count == number.length()) {
								break;
							}
							count++;
						}
						else {
							continue;
						}
					}
				}
				if (count == number.length()) {
					System.out.println(en.getKey());
				}
			}
		}
		System.out.println("========================");
		System.out.println();
	}

	public static void main(String[] args) {

		D07_PhoneBook phoneBookA = new D07_PhoneBook();

		phoneBookA.setGroup("�źϼ�");
		phoneBookA.setGroup("���׷� �Ÿ�ȣ");
		phoneBookA.setinformation("�źϼ�", "010-1234-1234", "�̼���");
		phoneBookA.setinformation("�źϼ�", "010-1234-1234", "ȫ�浿");
		phoneBookA.setinformation("�źϼ�", "010-5847-3240", "�̼���");
		phoneBookA.setinformation("���׷� �Ÿ�ȣ", "010-5847-1234", "�Ÿ�");
		phoneBookA.printPhoneBook();
		phoneBookA.setGroup("�źϼ�");

		phoneBookA.searchName("���̽�");
		phoneBookA.searchNuber("24");
	}

}
