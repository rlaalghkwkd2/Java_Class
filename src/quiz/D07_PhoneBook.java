package quiz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class D07_PhoneBook {
	// # HashMap을 이용한 PhoneBook을 구현해보시오.

	// 1. 그룹 / 전화번호 / 이름을 저장해야 한다.
	// 2. 그룹 이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다.
	// 3. 전화번호 목록에 전화번호를 키로 넣으면 이름이 나온다.

	public HashMap<String, HashMap<String, String>> phoneBook;
	public HashMap<String, String> information;

	public D07_PhoneBook() {
		phoneBook = new HashMap<>();
	}
	// # 구현해야 할 메서드

	// 1. 새로운 그룹을 추가하는 메서드

	public void setGroup(String group) {
		if (!(phoneBook.containsKey(group))) {
			this.phoneBook.put(group, new HashMap<String, String>());
		} else {
			System.out.printf("- \"%s\"는 이미 있는 그룹입니다.\n", group);
			System.out.println();
		}
	}

	// 2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드

	public boolean setinformation(String group, String number, String name) {
		if(!phoneBook.containsKey(group)) {
			System.out.println("존재하지 않는 그룹입니다.");
			return false;
		}
		
		information = phoneBook.get(group);
		if(information.containsKey(number)) {
			System.out.println("- 해당 정보가 수정되었습니다.");
		}else {
			System.out.println("- 새로운 정보를 추가했습니다.");
		}
		phoneBook.get(group).put(number, name);
		System.out.println();
		return true;
	}

	// 3. 등록된 모든 전화번호를 보기좋게 출력하는 메서드
	public void printPhoneBook() {
		for (String group : phoneBook.keySet()) {
			System.out.println("## " + group + "그룹 명단 ##");
			int i = 1;
			for (String num : phoneBook.get(group).keySet()) {
				System.out.println(i +". " + phoneBook.get(group).get(num) + " : " + num);
				i ++;
			}
			System.out.println();
		}
	}

	// 4. 이름의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드

	public void searchName(String name) {
		System.out.println("========================");
		System.out.println("<< 전화번호 찾기 이름 입력 >>");
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
		System.out.println("<< 전화번호 찾기 번호 입력 >>");
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

		phoneBookA.setGroup("거북선");
		phoneBookA.setGroup("제네럴 셔먼호");
		phoneBookA.setinformation("거북선", "010-1234-1234", "이순신");
		phoneBookA.setinformation("거북선", "010-1234-1234", "홍길동");
		phoneBookA.setinformation("거북선", "010-5847-3240", "이순신");
		phoneBookA.setinformation("제네럴 셔먼호", "010-5847-1234", "셔먼");
		phoneBookA.printPhoneBook();
		phoneBookA.setGroup("거북선");

		phoneBookA.searchName("순이신");
		phoneBookA.searchNuber("24");
	}

}
