package myobj.fruit;

public class Grape {

	// 색깔, 갯수, 당도 
	
	public int podo;
	public int skin;
	public String color;
	
	public Grape(int num) {
		this.podo = 23;
		this.skin = 0;
		System.out.println(podo-num+"개 남음");
	}
	
	
	public Grape() {
		System.out.println("기본 생성자");
	}
	
	
	
	
	
	public void eat(int num) {
		System.out.println("포도를 먹었습니다.");
		this.podo -= num;
		if(podo==0) {
			System.out.println("남은 포도가 없습니다.");
			return;
		}
		this.skin = num;
		System.out.printf("%d개 남고, 껍질이 %d개가 나왔습니다."
				,this.podo, this.skin);
	}
	
	
	
	
	
	
}
