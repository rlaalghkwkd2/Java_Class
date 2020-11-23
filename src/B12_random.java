import java.util.Random;

public class B12_random {
	public static void main(String[] args) {
// # JAVA에서 무작위 숫자 생성하기
		// 1. Math.random()
		// - double타입의 0 <= x < 1.0인 랜덤 소수를 생성한다.
		// - 이 소수를 이용하여 원하는 숫자를 만들어서 사용할 수 있따.

// # 원하는 숫자를 만드는 절차 (ex : 80 ~ 100 = 21)
		// (1) 원하는 숫자의 개수를 곱한다. (ex : *21)
		// 		0 <= x < 1.0 * 21
		// (2) 원하는 숫자 중 가장 작은 숫자를 더한다. (ex : +80 )
		// 		0 + 80 <= x < 21 + 80
		// (3) 소수점 아래를 삭제한다. (ex : (int)화 해버린다.)
		// 		(int)(80 <= x < 100.0)

// 2. Random 클래스를 이용
		// - 생성할 때 원하는 시드번호를 선택할 수 있다.
		// - 같은 시드 번호로 생성하면 같은 값이 나온다.
		// - 시드 번호를 전달하지 않으면 무작위로 시드가 선택된다.

// # 새로운 랜덤 시드 생성
		Random ran = new Random(10);
		Random ran2 = new Random(10);

// # Random.nextInt(bound) : 원하는 범위의 정수를 반환한다.
		// - 0 ~ bound미만의 정수를 반환한다.
		// - bound를 전달하지 않으면 int범위 전체에서 랜덤 정수가 선택된다.

		System.out.println(ran.nextInt(30)); // 0 ~ 29
		System.out.println(ran2.nextInt()); // int 전체 범위
		System.out.println(ran2.nextInt(21) + 80);// 80 ~ 100 중 선택

		// 연습 문제 : 3000이상 5000이하의 랜덤 정수를 100번 뽑고
		// 그 동안 나왔던 가장 큰수와 가장 작은 수를 출력 해보기.

// 해설
		int max1 = 0, min1 = 0;

		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 2001 + 3000);

			// 처음에는 비교대상이 없으므로 그냥 저장
			if (i == 0) {
				max1 = num;
				min1 = num;
			} else {
				// 현재 저장된 값보다 더 크면 max값을 갱신
				// max = max < num ? num : max;
				max1 = Math.max(max1, num);
				// if(num>max1)
				//	max1 = num;

				// 현재 저장된 값보다 더 작으면 min값을 갱신
				// min1 = min1 > num ? num : min1;
				min1 = Math.min(min1, num);
				// else if(num>min1)
				//	min1 = num;
			}
		}
		System.out.printf("최댓값 : %d, 최소값 : %d\n", max1, min1);

// 내 답
		int min = 5001, max = 0;
		for (int i = 0; i < 10; i++) {
			int rand = (int) (Math.random() * 2001 + 3000);
			System.out.println((i + "번 " + rand));
			if (rand > max)
				max = rand;
			else if (rand < min)
				min = rand;
		}
		System.out.println("최댓값 :" + max);
		System.out.println("최소값 :" + min);
	}
}
