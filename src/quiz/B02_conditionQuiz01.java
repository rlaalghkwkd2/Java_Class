package quiz;

public class B02_conditionQuiz01 {
	public static void main(String[] args) {

		/*
		[ 알맞은 비교연산을 만들어보세요 ]

		1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		2. int형 변수 b가 짝수일 때 true		
		3. int형 변수 c가 7의 배수일 때 true
		4. int형 변수 hour가 0이상 24미만이고 12이상일 때 true		
		6. int형 변수 year가 400으로 나누어 떨어지거나 
		   또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
		7. 민수가 철수보다 2살 많으면 true
		8. 민수가 철수보다 생일이 3달 빠르면 true  
 		9. boolean형 변수 powerOn이 false일 때 true
		10. 문자열 참조변수 str이 "yes"일 때 true
		 */

		//[알맞은 비교연산 만들기]
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
		
		// 소문자로 시작하는 타입 - 값을 저장한다.
		// 대문자로 시작하는 타입 - 주소를 저장한다.(참조형)
		
		String str = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		System.out.println(str=="yes");   
		System.out.println(str==str2); // 주소를 통한 비교1
		System.out.println(str==str3); // 주소를 통한 비교2
		System.out.println(str.equals(str3)); // 값를 통한 비교		
		
		// 11. 길이
		double x= 3, y=5, z = 4; //Math.pow(x, 2) + Math.pow(y, 2);
		
		System.out.println((x*x + y*y)==z*z
						||(x*x + z*z)==y*y
						||(y*y + z*z)==x*x);
		// 11. Math 쓸 때,
		System.out.println((Math.pow(x, 2)+Math.pow(y, 2))==Math.pow(z, 2)
						||(Math.pow(x, 2)+Math.pow(z, 2))==Math.pow(y, 2)
						||(Math.pow(y, 2)+Math.pow(z, 2))==Math.pow(x, 2));
		// 11. 각
		int a1 = 50, a2 = 40, a3 = 50;
		System.out.println(a1 + a2 + a3 == 180 && 
				(a1==90 || a2==90|| a3==90) && 
				!(a1==0 || a2==0|| a3==0));


	}
}
