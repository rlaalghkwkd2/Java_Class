
public class B10_innerLoop {
	public static void main(String[] args) {
		// # 반복문 내	부에 반복문 사용하기
		for (int i = 0; i < 10; i++) {
			System.out.printf("=====================바깥 반복문 %d\n",i);
			for (int j = 0; j < 5; j++) {
				System.out.printf("--------------안쪽 반복문 %d-%d\n",i,j);
				for (int k = 0; k < 2; k++) {
					System.out.printf("+++++제일 안쪽 반복문 %d-%d-%d\n",i,j,k);
				}
			}
		}
		
		// # 다중 반복문으로 구구단 출력하기
		//  - 2단 - 9단
		//  - 각 단마다 x1 - x9
		for (int i = 2; i < 10; i++) {
			System.out.printf("----- %d단 -----\n",i);
			System.out.println();
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}

}
