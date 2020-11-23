package crypto;

public class CaesarHacker {

	// 암호문과 charset과 알고리즘이 시저암호 방식임을 알고 있다고 가정한 상태로
	// 암호문을 이용하여 평문을 추출 해보시오.
	
	// ※ 암호의 강력함을 논할 때 위의 3가지는 모두 공격자가 알고 있다고 가정한다.
	
	char[] list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	static String encryption = "dddrH%@#xVUTNPdd!가나";
	
	
	public static void main(String[] args) {
		
		
		for (int key= 0; key < encryption.length(); key++) {
			// 모든 key값을 대입해보면 평문을 쉽게 추측할 수 있다.
			CaesarCipher cipher = new CaesarCipher(key);
			
			System.out.println(cipher.decryption(encryption));
		}
		
	}
	
	
	
	
	
	
	
}
