
public class C08_innerClass {
	public static void main(String[] args) {
		AppleBox box = new AppleBox(20);
		
		System.out.println(box.box[0].color);
	
		// 외부에서 다른 클래스의 inner클래스 사용하기 (거의안함)
		AppleBox.Apple apple01 = new AppleBox(10).new Apple();
		
		System.out.println(apple01.color);
		System.out.println(apple01.size);
	}
}

// # outer class
//  - 접근 제어자가 default와 public만 사용할 수 있다.
class AppleBox {
	Apple[] box;

	public AppleBox(int size) {
		box = new Apple[size];
		for (int i = 0; i < box.length; i++) {
			// 같은 클래스 내부의 클래스이기 때문에 this를 생략하고 사용할 수 있다.
			box[i] = this.new Apple();
		}
	}

	// # inner class
	//  - AppleBox의 인스턴스가 생기기 전에는 inner class Apple이 존재하지 않는다.
	//  - 접근 제어자를 자유롭게 사용할 수 있다.
	//  - outer class의 필드에 따라 달라지는 클래스를 작성할 수 있다.(동적클래스 작성)
	public class Apple {
		int color;
		int size;
	}
	
}