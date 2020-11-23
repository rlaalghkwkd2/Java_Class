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

	// ���� ����Ʈ�� �̿��� �� ������ �� �������� �����ϴ� Map�� �����غ��ÿ�
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