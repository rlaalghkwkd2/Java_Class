package myobj;

import java.util.Random;

public class Student implements Comparable<Student> {
	// 외부 클래스에서 필드의 직접 접근을 허용하지 않는것이 좀 더 객체지향적이다.
	// (외부 클래스는 내가 주는 것만 사용할 수 있게끔 설계하는 것이 이상적이다.)
	private int kor, eng, math;
	private String name;
	final static int NUM_OF_SUBJECTS = 3;
	static int stu_count = 0;

	public Student() {
		Random ran = new Random();
		kor = ran.nextInt(51) + 50;
		eng = ran.nextInt(51) + 50;
		math = ran.nextInt(51) + 50;
		name = String.format("테스트학생%04d", stu_count++);

	}

	public int getTotal() {
		return kor + eng + math;
	}

	public double getAvg() {
		return (kor + eng + math) / (double) NUM_OF_SUBJECTS;
	}

	// ※ toString()은 Object 클래스의 메서드이기 때문에
	// 모든 객체가 가지고 있다.
	@Override
	public String toString() {
		// 이 객체를 문자열로 표현한다면 무엇일까? 에 대한 정의를 하는 메서드

		// String.format()
		// printf처럼 서식을 이용하여 문자열을 생성하는 메서드
		// return "[" + name + "/" + total + "/" + avg + "]";

		// 클래스에 .을 찍고 사용하면 static
		return String.format("\n[ %s / 국 : %3d / 영 : %3d / 수 : %3d / %.2f ]", name, kor, eng, math, getAvg());
	}

	@Override
	public int compareTo(Student next_student) {
		// "이 클래스는 크기 비교를 이런식으로 하겠다."를 정의하는 곳
		// - 양수를 리턴 : 현재 객체가 다음 객체보다 더 큼
		// - 음수를 리턴 : 현재 객체가 다음 객체보다 더 작음
		// - 0을 리턴 : 현재 객체와 다음 객체의 크기가 같음

		if (this.eng > next_student.eng) {
			// 수학 점수가 더 큰 학생이 뒤에 나왔으면 좋겠다.
			return -1;
		} else if (this.eng < next_student.eng) {
			// 수학 점수가 더 작은 학생은 정렬 시 앞으로 나왔으면 좋겠다는 뜻
			return 1;
		} else {
			// 수학 점수가 같을땐 그냥 둔다.
			return 0;
		}

	}
}
