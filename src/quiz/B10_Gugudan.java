package quiz;

public class B10_Gugudan {
	public static void main(String[] args) {
		//	// 1. 구구단을 다음과 같이 가로로 출력해보시오.
		//	System.out.println("---- 가로로 출력 -----");
		//	for (int i = 2; i < 10; i++) {
		//		System.out.printf("%d단 : ",i);
		//		for (int j = 1; j < 10; j++) {
		//			System.out.printf("\t%dx%d=%d",i,j,i*j);
		//		}
		//		System.out.println();
		//	}

		// 2. 구구단을 다음과 같이 세로로 출력해보시오.
		System.out.println("---- 세로로 출력 -----");
		for (int i = 0; i < 10; i++) {
			
			for (int j = 2; j < 10; j++) {
				if(i==0)
					System.out.printf("%d단\t",j);
				else
					System.out.printf("%dx%d=%d\t",j,i,i*(j));
			}
			System.out.println();
		}
	}
}










