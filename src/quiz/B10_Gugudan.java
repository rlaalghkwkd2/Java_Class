package quiz;

public class B10_Gugudan {
	public static void main(String[] args) {
		//	// 1. �������� ������ ���� ���η� ����غ��ÿ�.
		//	System.out.println("---- ���η� ��� -----");
		//	for (int i = 2; i < 10; i++) {
		//		System.out.printf("%d�� : ",i);
		//		for (int j = 1; j < 10; j++) {
		//			System.out.printf("\t%dx%d=%d",i,j,i*j);
		//		}
		//		System.out.println();
		//	}

		// 2. �������� ������ ���� ���η� ����غ��ÿ�.
		System.out.println("---- ���η� ��� -----");
		for (int i = 0; i < 10; i++) {
			
			for (int j = 2; j < 10; j++) {
				if(i==0)
					System.out.printf("%d��\t",j);
				else
					System.out.printf("%dx%d=%d\t",j,i,i*(j));
			}
			System.out.println();
		}
	}
}










