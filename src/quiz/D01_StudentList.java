package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import myobj.Student;

//�л� Ŭ������ ��ҷ� ���� ArrayList��(group) �����ϰ�
// �л��� 30�� �߰� �غ��ÿ�.

// 1. 30���� ������ �ڵ����� �����ǵ��� �����ÿ�.
// 2. �л��� �� ������, ��� ������ ���غ��ÿ�.
// 3. �� ����� ���غ��ÿ�.
// 4. �̸� ���� ��Ģ 
//	  �׽�Ʈ�л� 0000
//	  �׽�Ʈ�л� 0001
//	  �׽�Ʈ�л� 0002


public class D01_StudentList {
	public static void main(String[] args) {
		
		int num_of_students = 30;
		double sum = 0;
		ArrayList<Student> group01 = new ArrayList<Student>();
		for (int i = 0; i < 30; i++) {
			group01.add(new Student());
			sum += group01.get(i).getAvg();
		}
		
		// println �Լ��� ��� �ش� ��ü�� toString() �޼��带 ȣ���Ѵ�.
		System.out.println(group01);
		System.out.println();
		System.out.printf("�� ��� : %.2f",sum/(double)num_of_students);
	}

//	public static ArrayList<Student> View_Add() {
//		ArrayList<Student> group = new ArrayList<Student>();
//		for (int i = 1; i <= 30; i++) {
//			int kor = (int) (Math.random()*50+50);
//			int eng = (int) (Math.random()*50+50);
//			int math = (int) (Math.random()*50+50);
//			Collections.addAll(group, new Student("�׽�Ʈ�л� "+i, kor, eng, math));
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
//	//����
//	public static void main(String[] args) {
//		
//		// �л����� �� �հ� ��� ����
//		ArrayList<Student> group = View_Add();
//		GroupView(group);
//		
//		// �� ���
//		System.out.printf("�� ��� : %.2f", GroupAvg(group));
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
//		System.out.printf("�̸� : %s\n"
//				+ "���� : %d\n"
//				+ "���� : %d\n"
//				+ "���� : %d\n"
//				+ "���� : %d\n"
//				+ "��� : %.2f\n"
//				,name,kor,eng,math,total,avg);
//		System.out.println("-----------------");
//	}
//	
//	public double getAvg() {
//	return this.avg;
//	}

}