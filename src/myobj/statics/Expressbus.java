package myobj.statics;

public class Expressbus {

	int reserved_seat;
	int empty_seat;
	int ticket_price;
	int driving_hours;
	String destination;

	final static int VIPSEAT;
	final static int TRUNK_SIZE;

	static {
		VIPSEAT = 24;
		TRUNK_SIZE = 50;
	}

	public Expressbus(String destination, int driving_hours, int reserved, int carrier) {
		this.reserved_seat += reserved;
		this.empty_seat = VIPSEAT - reserved_seat;
		this.ticket_price = 8450 * driving_hours;
		this.destination = destination;
	}

	public void situation() {
		System.out.println("---------------------");
		System.out.printf("   %sÇà ¹ö½º ÁÂ¼® ÇöÈ²\n", destination);
		System.out.println("---------------------");
		System.out.printf("     ¹ö½º ÁÂ¼® : %d\n", VIPSEAT);
		System.out.printf("     ¿¹¾à ÁÂ¼® : %2d\n", reserved_seat);
		System.out.printf("      ºó ÁÂ¼® : %1d\n", empty_seat);
		System.out.println("---------------------");
		System.out.printf("   ¹ö½º ¿ä±Ý : %,d\n", ticket_price);
		System.out.println("---------------------");

	}

	public static void main(String[] args) {
		System.out.println("¹ö½º Á¤º¸");
		System.out.println("ÃÑ ÁÂ¼® ¼ö : " + Expressbus.VIPSEAT);
		System.out.println("Æ®··Å© Å©±â : " + Expressbus.TRUNK_SIZE);

		Expressbus person = new Expressbus("ºÎ»ê", 4, 1, 1);
		person.situation();

	}
}
