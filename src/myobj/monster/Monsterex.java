//package myobj.monster;
//
//import myobj.item.Sword;
//
//public class Monsterex {
//	public String name;
//	public int hp;
//	
//	public Monsterex() {
//		name = "������ ����ƺ�";
//		hp = 99999;
//	}
//	
//	public void attacked(Sword sword) {
//		int dmg = sword.damage();
//		hp -= dmg;
//		System.out.printf("%s���� %d�� ������!\n", name, dmg);
//		System.out.printf("%s�� ���� ü�� : %d\n", name, hp);
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
//// ���͸� ��ӹ޾Ƽ� �ٸ� ������ ������ 
//
//class Dragon extends Monster{
//	String name;
//	public Dragon() {
//	this.name = "�巹��1";
//	}
//	
//}
//
//class BabyDragon extends Dragon{
//	String name;
//	public BabyDragon() {
//	this.name = "�Ʊ�巹��1";
//	}
//	
//}
//
//class Dragon2 extends Monster{
//	String name;
//	public Dragon2() {
//	this.name = "�巹��2";
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
