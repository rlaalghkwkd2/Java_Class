package crypto;

public class CaesarCipher extends Cipher {

	// # ��ȣ��?
	// - ��� �޼����� �ְ�ޱ� ���� ��
	// - ��ȣȭ(Encryption)
	// ��(�Ϲ� �޼���)�� ��ȣ��(��� �޼���)�� �ٲٴ� ��
	// - ��ȣȭ(Decryption)
	// ��ȣ���� ������ �ǵ����� ��
	// - Ű(Key)
	// ��ȣȭ�� ��ȣȭ�� ���Ǵ� ��� ��

	// # ����(ī�̻縣) ��ȣ
	// - ���ĺ��� Ű(Key)�� ��ŭ ���������� �̵���Ű�� ��ȣ ���
	// - ��ȣȭ : ���� Ű �� ��ŭ ���������� �̵���Ų��.
	// - ��ȣȭ : ��ȣ���� Ű �� ��ŭ �������� �̵���Ų��.

	// ex : ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abvdefghijklmnopqrs...

	// * Key ���� 3�� ��� ��ȣȭ (+3)
	// "Hello, World!" => "Khoorc#Zruog$";

	// * Key ���� 3�� ��� ��ȣȭ (-3)
	// "Khoorc#Zruog$" => "Hello, World!"

	// ����
	char[] list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();
	int key ;

	final static int ENCRYPTION_CODE = 1;
	final static int DECRYPTION_CODE = -1;

	public CaesarCipher(int key) {
		this.key = key % list.length;
	}

	public int getValue(char digit) { // ���ڿ� �´� �ε����� ��ȯ���ִ� �Լ�
		for (int i = 0; i < list.length; i++) {
			if (list[i] == digit)
				return i;
		}
		return -1;
	}

	public int[] getIndex(String str) { // �ε��� �迭
		int[] index = new int[str.length()];
		for (int i = 0; i < str.length(); i++) { // index�� ���� �ε����� ����
			index[i] = getValue(str.charAt(i));
		}
		return index;
	}

	public String getCoding(String coding, int code) { // ����� ������ �ε����� key���� ����ؼ� ���ڿ��� ��ȯ
		StringBuilder encoding = new StringBuilder(); // ���� ��Ȳ ó��.
		getIndex(coding); // ����Ʈ ���ڰ� ���� ���, ���̰� ���� ���, ���̳ʽ��� �� ���
		for (int i = 0; i < coding.length(); i++) {

			int index = getIndex(coding)[i] + key * code;
			int listlen = list.length;

			if (getIndex(coding)[i] == -1) {
				encoding.append(coding.charAt(i));
			} else if (index > listlen) {
				int result = index % listlen;   // ��ȣȭ ��� ��
				encoding.append(list[result]);
			} else if (index < 0) {
				encoding.append(list[listlen - (Math.abs(index)) % listlen]);
			} else {
				encoding.append(list[index]);
			}
		}
		return encoding.toString();
	}

	public String encryption(String plain_text) { // ��ȣȭ
		// �Ű������� ���� ���� ��ȣȭ �Ͽ� �����ϴ� �Լ��� �����غ��ÿ�.
		return getCoding(plain_text, ENCRYPTION_CODE);
	}

	public String decryption(String crypto_text) { // ��ȣȭ
		// �Ű������� ���� ��ȣ���� ��ȣȭ �Ͽ� �����ϴ� �Լ��� �����غ��ÿ�.
		return getCoding(crypto_text, DECRYPTION_CODE);
	}

}
