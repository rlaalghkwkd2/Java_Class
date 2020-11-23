package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D07_countFruits {

	private enum Fruit {
		APPLE, BANANA, ORNAGE, KIWI;
	}

	// 다음 리스트를 이용해 각 과일이 몇 개인지를 저장하는 Map을 생성해보시오
	static List<Fruit> fruits;
	static Map<Fruit, Integer> fruitMap;

	static {
		fruits = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			fruits.add(Fruit.values()[(int) (Math.random() * 4)]);
		}

		fruitMap = new HashMap<>();

		for (Fruit fruit : Fruit.values()) {
			int freq = Collections.frequency(fruits, fruit);
			fruitMap.put(fruit, freq);
		}
//		for (int i = 0; i < 4; i++) {
//		fruitMap.put(Fruit.values()[i], Collections.frequency(fruits, Fruit.values()[i]));
//		}
	}

	static void print() {
		System.out.println(fruits);
		System.out.println("FruitsMap : " + fruitMap);
	}

	public static void main(String[] args) {
		print();
	}

}