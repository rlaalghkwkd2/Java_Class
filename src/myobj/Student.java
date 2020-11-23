package myobj;

import java.util.Random;

public class Student implements Comparable<Student> {
	// �ܺ� Ŭ�������� �ʵ��� ���� ������ ������� �ʴ°��� �� �� ��ü�������̴�.
	// (�ܺ� Ŭ������ ���� �ִ� �͸� ����� �� �ְԲ� �����ϴ� ���� �̻����̴�.)
	private int kor, eng, math;
	private String name;
	final static int NUM_OF_SUBJECTS = 3;
	static int stu_count = 0;

	public Student() {
		Random ran = new Random();
		kor = ran.nextInt(51) + 50;
		eng = ran.nextInt(51) + 50;
		math = ran.nextInt(51) + 50;
		name = String.format("�׽�Ʈ�л�%04d", stu_count++);

	}

	public int getTotal() {
		return kor + eng + math;
	}

	public double getAvg() {
		return (kor + eng + math) / (double) NUM_OF_SUBJECTS;
	}

	// �� toString()�� Object Ŭ������ �޼����̱� ������
	// ��� ��ü�� ������ �ִ�.
	@Override
	public String toString() {
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���

		// String.format()
		// printfó�� ������ �̿��Ͽ� ���ڿ��� �����ϴ� �޼���
		// return "[" + name + "/" + total + "/" + avg + "]";

		// Ŭ������ .�� ��� ����ϸ� static
		return String.format("\n[ %s / �� : %3d / �� : %3d / �� : %3d / %.2f ]", name, kor, eng, math, getAvg());
	}

	@Override
	public int compareTo(Student next_student) {
		// "�� Ŭ������ ũ�� �񱳸� �̷������� �ϰڴ�."�� �����ϴ� ��
		// - ����� ���� : ���� ��ü�� ���� ��ü���� �� ŭ
		// - ������ ���� : ���� ��ü�� ���� ��ü���� �� ����
		// - 0�� ���� : ���� ��ü�� ���� ��ü�� ũ�Ⱑ ����

		if (this.eng > next_student.eng) {
			// ���� ������ �� ū �л��� �ڿ� �������� ���ڴ�.
			return -1;
		} else if (this.eng < next_student.eng) {
			// ���� ������ �� ���� �л��� ���� �� ������ �������� ���ڴٴ� ��
			return 1;
		} else {
			// ���� ������ ������ �׳� �д�.
			return 0;
		}

	}
}
