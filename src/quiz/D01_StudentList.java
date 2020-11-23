package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import myobj.Student;

//학생 클래스를 요소로 갖는 ArrayList를(group) 생성하고
// 학생을 30명 추가 해보시오.

// 1. 30명의 점수가 자동으로 설정되도록 만들어보시오.
// 2. 학생의 총 점수와, 평균 점수를 구해보시오.
// 3. 반 평균을 구해보시오.
// 4. 이름 생성 규칙 
//	  테스트학생 0000
//	  테스트학생 0001
//	  테스트학생 0002


public class D01_StudentList {
	public static void main(String[] args) {
		
		int num_of_students = 30;
		double sum = 0;
		ArrayList<Student> group01 = new ArrayList<Student>();
		for (int i = 0; i < 30; i++) {
			group01.add(new Student());
			sum += group01.get(i).getAvg();
		}
		
		// println 함수는 사실 해당 객체의 toString() 메서드를 호출한다.
		System.out.println(group01);
		System.out.println();
		System.out.printf("반 평균 : %.2f",sum/(double)num_of_students);
	}

//	public static ArrayList<Student> View_Add() {
//		ArrayList<Student> group = new ArrayList<Student>();
//		for (int i = 1; i <= 30; i++) {
//			int kor = (int) (Math.random()*50+50);
//			int eng = (int) (Math.random()*50+50);
//			int math = (int) (Math.random()*50+50);
//			Collections.addAll(group, new Student("테스트학생 "+i, kor, eng, math));
//		}
//		return group;
//	}
//	
//	public static void GroupView(ArrayList<Student> group) {		
//		for (int i = 0; i < group.size(); i++) {
//			group.get(i).getView();
//		}
//	}
//	
//	public static double GroupAvg(ArrayList<Student> group) {
//		double sum_avg = 0;
//		for (int i = 0; i < group.size(); i++) {
//			sum_avg += group.get(i).getAvg();
//		}
//		return sum_avg/30;
//	}
//
//	
//	//메인
//	public static void main(String[] args) {
//		
//		// 학생들의 총 합과 평균 점수
//		ArrayList<Student> group = View_Add();
//		GroupView(group);
//		
//		// 반 평균
//		System.out.printf("반 평균 : %.2f", GroupAvg(group));
//	}
//	
//	
//}
//
//class Student {
//	int kor, eng, math;
//	int total;
//	double avg;
//	String name;
//
//	public Student(String name, int kor, int eng, int math) {
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		
//		this.total = kor + eng + math;
//		this.avg = total/3.0;
//	}
//	
//	public void getView() {
//		System.out.println("-----------------");
//		System.out.printf("이름 : %s\n"
//				+ "국어 : %d\n"
//				+ "영어 : %d\n"
//				+ "수학 : %d\n"
//				+ "총합 : %d\n"
//				+ "평균 : %.2f\n"
//				,name,kor,eng,math,total,avg);
//		System.out.println("-----------------");
//	}
//	
//	public double getAvg() {
//	return this.avg;
//	}

}