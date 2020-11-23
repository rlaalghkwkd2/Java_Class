package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class D02_LottoSet {
	
	// 1���� 45������ �ߺ����� ���� ���� 6���� �̷���� HashSet�� �����غ��ÿ�.
	
	public static Set<Integer> generate() {
		
		Random ran = new Random();
		Set<Integer> lotto = new HashSet<>();
		
		// Set�� �ߺ����� �߰����� �ʱ� ������ �˾Ƽ� ���̰� �þ�� �ʴ´�.
		while(lotto.size()<6) {
			lotto.add(ran.nextInt(45)+1);
		}
		return lotto;
	}
	
	public static void main(String[] args) {
		System.out.println(generate());
	}
	
	
	
	
	
//	public static void generate(List<Integer> lotto) {
//		for (int i = 1; i <= 45; i++) {
//			lotto.add(i);
//		}
//		Collections.shuffle(lotto);
//	}
//
//	public static void draw(List<Integer> lotto) {
//		HashSet<Integer> draw = new HashSet<>();
//		for (int i = 0; i < 6; i++) {
//			draw.add(lotto.get(i));
//		}
//		System.out.println(draw);
//	}
//
//	public static void main(String[] args) {
//		List<Integer> lotto = new ArrayList<>();
//		generate(lotto);
//		draw(lotto);
//	}
}
