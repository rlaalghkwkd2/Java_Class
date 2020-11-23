package quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import myobj.fruit.Mango;

public class D04_MaxMango {
	// 칼로리가 랜덤으로 설정되는 망고 클래스를 하나 생성하고
	// 100개의 망고 중 가장 칼로리가 높은 망고를 선택해보시오

	public static void main(String[] args) {
		List<Mango> mangos = new LinkedList<>();
		for (int i = 0; i < 100; i++) {
			mangos.add(new Mango());
		}
		Collections.sort(mangos);
		System.out.println(mangos);
		Mango most_delicious = Collections.max(mangos);
		System.out.println(most_delicious.toString());
		System.out.println("가장 맛있는 망고의 칼로리 : " + most_delicious.calorie);
		System.out.println("가장 맛있는 망고의 칼로리 : " + most_delicious.sugar);
	}

}
