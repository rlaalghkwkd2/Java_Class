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
	 * 비교대상 망고를 
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
		
		// 해당 인스턴스를 유일하게 구분해줄 수 있는 값
		id = mango_id++;
		System.out.printf("%d번 망고가 생성되었습니다.\n",hashCode()+1);
	}
	
	@Override
	public int hashCode() {
		// 이 객체를 유일하게 구분하려면 어떻게 해야할까요?를 정의하는 곳
		// (기본 동작은 이 인스턴스의 주소값을 해시화 한다.)
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
