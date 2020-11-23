package quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import myobj.fruit.Mango;

public class D04_MaxMango {
	// Į�θ��� �������� �����Ǵ� ���� Ŭ������ �ϳ� �����ϰ�
	// 100���� ���� �� ���� Į�θ��� ���� ���� �����غ��ÿ�

	public static void main(String[] args) {
		List<Mango> mangos = new LinkedList<>();
		for (int i = 0; i < 100; i++) {
			mangos.add(new Mango());
		}
		Collections.sort(mangos);
		System.out.println(mangos);
		Mango most_delicious = Collections.max(mangos);
		System.out.println(most_delicious.toString());
		System.out.println("���� ���ִ� ������ Į�θ� : " + most_delicious.calorie);
		System.out.println("���� ���ִ� ������ Į�θ� : " + most_delicious.sugar);
	}

}
