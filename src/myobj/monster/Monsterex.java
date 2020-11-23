//package myobj.monster;
//
//import myobj.item.Sword;
//
//public class Monsterex {
//	public String name;
//	public int hp;
//	
//	public Monsterex() {
//		name = "연습용 허수아비";
//		hp = 99999;
//	}
//	
//	public void attacked(Sword sword) {
//		int dmg = sword.damage();
//		hp -= dmg;
//		System.out.printf("%s에게 %d의 데미지!\n", name, dmg);
//		System.out.printf("%s의 남은 체력 : %d\n", name, hp);
//	}
//	
//	public static void main(String[] args) {
//		Sword steel_sword = new Sword();
//		
//		Monster mon = new Monster();
//		
//		mon.attacked(steel_sword);
//		
//		for (int i = 0; i < 10; ++i) {
//			steel_sword.upgrade_weapon();
//		}
//		
//		mon.attacked(steel_sword);
//	}
//}
//
//// 몬스터를 상속받아서 다른 종류를 만들어라 
//
//class Dragon extends Monster{
//	String name;
//	public Dragon() {
//	this.name = "드레곤1";
//	}
//	
//}
//
//class BabyDragon extends Dragon{
//	String name;
//	public BabyDragon() {
//	this.name = "아기드레곤1";
//	}
//	
//}
//
//class Dragon2 extends Monster{
//	String name;
//	public Dragon2() {
//	this.name = "드레곤2";
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
