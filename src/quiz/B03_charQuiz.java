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
	
	//4. ���� ����
	char d ='Z';
	System.out.println((d >= 'A' && d <= 'Z') 
					 ||(d >= 'a' && d <= 'z'));
	//5. �ѱ� ����
	char e = '��';
	System.out.println((e >= '��' && e <= '�R')
					 ||(e >= '��' && e <= '��')
					 ||(e >= '��' && e <= '��'));
	
	// Hangul Jamo : 0x1100 - 0x11FF
	// Hangul Syllables : 0xAc00 - 0xD7A3
	
	//6. �Ϻ��� ����
	char f ='��';
	System.out.println((f >= '��' && f <= '��') 
					|| (f >= '��' && f <= '��'));

}
}
