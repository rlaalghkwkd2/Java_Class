package crypto;

public class CaesarHacker {

	// ��ȣ���� charset�� �˰����� ������ȣ ������� �˰� �ִٰ� ������ ���·�
	// ��ȣ���� �̿��Ͽ� ���� ���� �غ��ÿ�.
	
	// �� ��ȣ�� �������� ���� �� ���� 3������ ��� �����ڰ� �˰� �ִٰ� �����Ѵ�.
	
	char[] list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	static String encryption = "dddrH%@#xVUTNPdd!����";
	
	
	public static void main(String[] args) {
		
		
		for (int key= 0; key < encryption.length(); key++) {
			// ��� key���� �����غ��� ���� ���� ������ �� �ִ�.
			CaesarCipher cipher = new CaesarCipher(key);
			
			System.out.println(cipher.decryption(encryption));
		}
		
	}
	
	
	
	
	
	
	
}
