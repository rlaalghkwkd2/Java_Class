package myobj.machine;

public interface ElectronicsEx {
	
	// 전자기기 인터페이스
	// 다음 조건을 참고하여 전자 기기 인터페이스를 작성해보시오.
	
	// 1. 모든 전자기기는 전력 공급을 받을 수 있다.
	// 2. 모든 전자기기는 콘솔에 한번 출력할때 마다
	//    전력 소비량 만큼의 전력을 소비한다.
	// 3. 모든 전자기기는 가지고 있는 동작을 콘솔에 출력한다.
	
	int getPower_Consumption();
	
	default String getEnergy_Grade(int consumption) {
		if (consumption >= 0 && consumption <= 20)
			return "1등급";
		else if (consumption<=40)
			return "2등급";
		else if (consumption<=60)
			return "3등급";
		else if (consumption<=80)
			return "4등급";
		else if (consumption<=100)
			return "5등급";
		else
			return "잘못 입력 했습니다.";
	}
	
	void plug();
	
	void power_On();
	
	void getUse_Battery(int min);
	
	void power_Off();
	
	
	
	
}

