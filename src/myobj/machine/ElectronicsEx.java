package myobj.machine;

public interface ElectronicsEx {
	
	// ���ڱ�� �������̽�
	// ���� ������ �����Ͽ� ���� ��� �������̽��� �ۼ��غ��ÿ�.
	
	// 1. ��� ���ڱ��� ���� ������ ���� �� �ִ�.
	// 2. ��� ���ڱ��� �ֿܼ� �ѹ� ����Ҷ� ����
	//    ���� �Һ� ��ŭ�� ������ �Һ��Ѵ�.
	// 3. ��� ���ڱ��� ������ �ִ� ������ �ֿܼ� ����Ѵ�.
	
	int getPower_Consumption();
	
	default String getEnergy_Grade(int consumption) {
		if (consumption >= 0 && consumption <= 20)
			return "1���";
		else if (consumption<=40)
			return "2���";
		else if (consumption<=60)
			return "3���";
		else if (consumption<=80)
			return "4���";
		else if (consumption<=100)
			return "5���";
		else
			return "�߸� �Է� �߽��ϴ�.";
	}
	
	void plug();
	
	void power_On();
	
	void getUse_Battery(int min);
	
	void power_Off();
	
	
	
	
}

