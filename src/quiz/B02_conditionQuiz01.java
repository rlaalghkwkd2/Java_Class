package quiz;

public class B02_conditionQuiz01 {
	public static void main(String[] args) {

		/*
		[ �˸��� �񱳿����� �������� ]

		1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		2. int�� ���� b�� ¦���� �� true		
		3. int�� ���� c�� 7�� ����� �� true
		4. int�� ���� hour�� 0�̻� 24�̸��̰� 12�̻��� �� true		
		6. int�� ���� year�� 400���� ������ �������ų� 
		   �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
		7. �μ��� ö������ 2�� ������ true
		8. �μ��� ö������ ������ 3�� ������ true  
 		9. boolean�� ���� powerOn�� false�� �� true
		10. ���ڿ� �������� str�� "yes"�� �� true
		 */

		//[�˸��� �񱳿��� �����]
		// 1. 
		int a= 13;
		System.out.println(a > 10 && a < 20);
		// 2. 
		int b= 4;
		System.out.println(b%2 ==0);
		// 3. 
		int c=14;
		System.out.println(c%7==0);
		// 4. 
		int hour = 16;
		System.out.println(!(hour<0 || hour> 24) && hour>=12 );
		// 5. 
		int d = 36, e =66; 
		System.out.println(e-d==30||d-e==30);
		// 6.
		int year = 2020;
		System.out.println(year%400==0 || 
							(year % 4 ==0 && year % 100 !=0));
		// 7. 
		int m_age = 38, c_age = 36;
		System.out.println(m_age>1 && c_age<3);
		// 8. 
		int m_birth = 4, c_birth = 7;
		System.out.println(m_birth-c_birth==3);
		// 9.
		boolean powerOn =false ;
		System.out.println(!powerOn);
		
		// 10.
		
		// �ҹ��ڷ� �����ϴ� Ÿ�� - ���� �����Ѵ�.
		// �빮�ڷ� �����ϴ� Ÿ�� - �ּҸ� �����Ѵ�.(������)
		
		String str = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		System.out.println(str=="yes");   
		System.out.println(str==str2); // �ּҸ� ���� ��1
		System.out.println(str==str3); // �ּҸ� ���� ��2
		System.out.println(str.equals(str3)); // ���� ���� ��		
		
		// 11. ����
		double x= 3, y=5, z = 4; //Math.pow(x, 2) + Math.pow(y, 2);
		
		System.out.println((x*x + y*y)==z*z
						||(x*x + z*z)==y*y
						||(y*y + z*z)==x*x);
		// 11. Math �� ��,
		System.out.println((Math.pow(x, 2)+Math.pow(y, 2))==Math.pow(z, 2)
						||(Math.pow(x, 2)+Math.pow(z, 2))==Math.pow(y, 2)
						||(Math.pow(y, 2)+Math.pow(z, 2))==Math.pow(x, 2));
		// 11. ��
		int a1 = 50, a2 = 40, a3 = 50;
		System.out.println(a1 + a2 + a3 == 180 && 
				(a1==90 || a2==90|| a3==90) && 
				!(a1==0 || a2==0|| a3==0));


	}
}
