package crypto;

public class CaesarCipher extends Cipher {

	// # 암호란?
	// - 비밀 메세지를 주고받기 위한 것
	// - 암호화(Encryption)
	// 평문(일반 메세지)를 암호문(비밀 메세지)로 바꾸는 것
	// - 복호화(Decryption)
	// 암호문을 평문으로 되돌리는 것
	// - 키(Key)
	// 암호화와 복호화에 사용되는 비밀 값

	// # 시저(카이사르) 암호
	// - 알파벳을 키(Key)값 만큼 오른쪽으로 이동시키는 암호 방식
	// - 암호화 : 평문을 키 값 만큼 오른쪽으로 이동시킨다.
	// - 복호화 : 암호문을 키 값 만큼 왼쪽으로 이동시킨다.

	// ex : ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abvdefghijklmnopqrs...

	// * Key 값이 3인 경우 암호화 (+3)
	// "Hello, World!" => "Khoorc#Zruog$";

	// * Key 값이 3인 경우 복호화 (-3)
	// "Khoorc#Zruog$" => "Hello, World!"

	// 문제
	char[] list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();
	int key ;

	final static int ENCRYPTION_CODE = 1;
	final static int DECRYPTION_CODE = -1;

	public CaesarCipher(int key) {
		this.key = key % list.length;
	}

	public int getValue(char digit) { // 문자에 맞는 인덱스를 반환해주는 함수
		for (int i = 0; i < list.length; i++) {
			if (list[i] == digit)
				return i;
		}
		return -1;
	}

	public int[] getIndex(String str) { // 인덱스 배열
		int[] index = new int[str.length()];
		for (int i = 0; i < str.length(); i++) { // index에 받은 인덱스를 담음
			index[i] = getValue(str.charAt(i));
		}
		return index;
	}

	public String getCoding(String coding, int code) { // 사용자 문자의 인덱스에 key값을 계산해서 문자열로 반환
		StringBuilder encoding = new StringBuilder(); // 예외 상황 처리.
		getIndex(coding); // 리스트 문자가 없을 경우, 길이가 넘을 경우, 마이너스가 될 경우
		for (int i = 0; i < coding.length(); i++) {

			int index = getIndex(coding)[i] + key * code;
			int listlen = list.length;

			if (getIndex(coding)[i] == -1) {
				encoding.append(coding.charAt(i));
			} else if (index > listlen) {
				int result = index % listlen;   // 암호화 사용 시
				encoding.append(list[result]);
			} else if (index < 0) {
				encoding.append(list[listlen - (Math.abs(index)) % listlen]);
			} else {
				encoding.append(list[index]);
			}
		}
		return encoding.toString();
	}

	public String encryption(String plain_text) { // 암호화
		// 매개변수로 받은 평문을 암호화 하여 리턴하는 함수를 구현해보시오.
		return getCoding(plain_text, ENCRYPTION_CODE);
	}

	public String decryption(String crypto_text) { // 복호화
		// 매개변수로 받은 암호문을 복호화 하여 리턴하는 함수를 구현해보시오.
		return getCoding(crypto_text, DECRYPTION_CODE);
	}

}
