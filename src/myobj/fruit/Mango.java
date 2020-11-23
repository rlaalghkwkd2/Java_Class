package myobj.fruit;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Mango implements Comparable<Mango> {

	public int calorie;
	public int sugar;
	public int id;
	private static int mango_id = 0;
	/**
	 * �񱳴�� ���� 
	 * 
	 *  
	 */
	public Mango(int calorie, int sugar, int id) {
		this.calorie = calorie;
		this.sugar = sugar;
		this.id = id;
	}
	
	public Mango() {
		Random ran = new Random();
		calorie = ran.nextInt(1000) + 1;
		sugar = ran.nextInt(100) + 1;
		
		// �ش� �ν��Ͻ��� �����ϰ� �������� �� �ִ� ��
		id = mango_id++;
		System.out.printf("%d�� ���� �����Ǿ����ϴ�.\n",hashCode()+1);
	}
	
	@Override
	public int hashCode() {
		// �� ��ü�� �����ϰ� �����Ϸ��� ��� �ؾ��ұ��?�� �����ϴ� ��
		// (�⺻ ������ �� �ν��Ͻ��� �ּҰ��� �ؽ�ȭ �Ѵ�.)
		 return id;
	}

	public String toString() {
		return String.format("%06d : %3d / %2d\n", id, calorie, sugar);
	}

	@Override
	public int compareTo(Mango next_calorie) {
		int calorie_result = this.calorie - next_calorie.calorie;

		return calorie_result == 0 ? this.sugar - next_calorie.sugar : this.calorie - next_calorie.calorie;
	}
}
