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
	
	//4. ¿µ¾î ¹üÀ§
	char d ='Z';
	System.out.println((d >= 'A' && d <= 'Z') 
					 ||(d >= 'a' && d <= 'z'));
	//5. ÇÑ±Û ¹üÀ§
	char e = '°¡';
	System.out.println((e >= '°¡' && e <= 'ÆR')
					 ||(e >= '¤¡' && e <= '¤¾')
					 ||(e >= '¤¿' && e <= '¤Ó'));
	
	// Hangul Jamo : 0x1100 - 0x11FF
	// Hangul Syllables : 0xAc00 - 0xD7A3
	
	//6. ÀÏº»¾î ¹üÀ§
	char f ='«î';
	System.out.println((f >= 'ª¢' && f <= 'ªó') 
					|| (f >= '«¢' && f <= '«ô'));

}
}
