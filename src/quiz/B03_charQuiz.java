package quiz;

public class B03_charQuiz {
public static void main(String[] args) {
	//1.
	char a = 'q';
	System.out.println(a == 'q' || a == 'Q');
	
	//2.
	char b = 'a';
	System.out.println(!(b == ' ' || b == '\t'));
	
	//3.
	char c ='9';
	System.out.println(c >= '0' && c <= '9');
	
	//4. 영어 범위
	char d ='Z';
	System.out.println((d >= 'A' && d <= 'Z') 
					 ||(d >= 'a' && d <= 'z'));
	//5. 한글 범위
	char e = '가';
	System.out.println((e >= '가' && e <= '힣')
					 ||(e >= 'ㄱ' && e <= 'ㅎ')
					 ||(e >= 'ㅏ' && e <= 'ㅣ'));
	
	// Hangul Jamo : 0x1100 - 0x11FF
	// Hangul Syllables : 0xAc00 - 0xD7A3
	
	//6. 일본어 범위
	char f ='ヮ';
	System.out.println((f >= 'あ' && f <= 'ん') 
					|| (f >= 'ア' && f <= 'ヴ'));

}
}
