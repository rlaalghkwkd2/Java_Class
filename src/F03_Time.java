import java.sql.Date;
import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class F03_Time {

	public static void main(String[] args) {
		// # java.time�� �ð� ��ü���� set�� ����.

		// 1. now()�� ���� ���� �� �ð��� ������ ���� �ν��Ͻ��� �����ϱ�

		// ��¥�� ����
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		
		// �ð��� ����
		LocalTime now = LocalTime.now();
		System.out.println(now);

		// ��¥�� �ð��� ����
		LocalDateTime datetime = LocalDateTime.now(ZoneId.of("US/Samoa"));
		System.out.println(datetime);

		// ��¥�� �ð��� �浵�� ����
		ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("US/Samoa"));
		System.out.println(zoned);

		// 2. of()�� �̿��ؼ� �ش� ��¥/�ð��� �ν��Ͻ��� �����ϱ�
		LocalDate birthday = LocalDate.of(1995, 11, 25);
		System.out.println(birthday);

		LocalTime birthtime = LocalTime.of(5, 5, 5, 1234);
		System.out.println(birthtime);

		LocalDateTime birthdatetime = LocalDateTime.of(birthday, birthtime);

		ZonedDateTime birthdayzoned = ZonedDateTime.of(birthdatetime, ZoneId.of("Asia/Seoul"));
		System.out.println(birthdayzoned);

		Instant start_time = Instant.now();

		System.out.println(start_time);

		// InstantŬ������ isAfter, isBefore�� �̿��ؼ� �ð��񱳸� �� ���ִ�.
		Instant end_time = Instant.now();
		System.out.println(start_time.isAfter(end_time));
		System.out.println(start_time.isBefore(end_time));
		System.out.println(start_time.until(end_time, ChronoUnit.MILLIS));

		// ��¥/�ð� ����ϱ�
		today = LocalDate.now();

		// Calendar Ŭ������ ������ �ν��Ͻ� �� ��ü�� �ٲ� �� �־�����,
		// java.time�� Ŭ�������� �ش� �ν��Ͻ��� ������� ����ä�� �ν��Ͻ��� �����Ͽ� ��ȯ

		System.out.println("����: " + today);
		System.out.println("���� - 5��: " + today.minusYears(5));
		System.out.println("���� - 3����: " + today.minusMonths(5));
		System.out.println("���� - 5��: " + today.minusDays(5));
		System.out.println("���� - 4��: " + today.minusWeeks(4));

		System.out.println("--------------------");
		System.out.println("���� + 5��: " + today.plusYears(5));
		System.out.println("���� + 3����: " + today.plusMonths(3));
		System.out.println("���� + 5��: " + today.plusDays(5));
		System.out.println("���� + 4��: " + today.plusWeeks(4));

		System.out.println("--------------------");
		System.out.println("1990�� ���÷� ����: " + today.withYear(1990));
		System.out.println("3�� ���÷� ����: " + today.withMonth(3));
		System.out.println("�̹� ���� 5���� ���� ����: " + today.withDayOfMonth(5));
		System.out.println("������ 5���� ���� ���� " + today.withDayOfYear(5));
		
		
		// ���ڿ� ��ȯ  ���ڿ��� ��¥/�ð� ��ü�� ��ȯ (�Ľ�, Parsing) ��û �߿�!!!
		
		// yyyy-MM-dd�� ���� �⺻������ ��¥ ���ڿ�
		LocalDate test1 = LocalDate.parse("1234-12-12");
		System.out.println(test1.plusDays(5));
		
		// DateTimeFormatter.ofPattern()�� �̿��� ���ϴ� ������ ������ �� �ִ�
		LocalDateTime test2 = LocalDateTime.parse("2021�� 05�� 05�� 19�� 05�� 35��",DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��"));
		

		System.out.println("��������" + test2);

		// �̹� ������ ���ϵ��� ����� ���ǵǾ��ִ�
		test2 = LocalDateTime.parse("2011-12-03T10:15:30+01:00",DateTimeFormatter.ISO_DATE_TIME);		
		System.out.println(test2.plusHours(5));
		
		// java.time ��ü�� ���ڿ��� ��ȯ�ϱ�
		
		// format() �޼��带 �̿��Ѵ�.
		// ��¥ ��ü�����ڿ� ��ȯ�� ���� DateTimeFormatter�� ����Ѵ�
		ZonedDateTime zdt = ZonedDateTime.now();
		
		System.out.println("BASIC_ISO_DATE: " + zdt.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println("ISO_DATE: " +zdt.format(DateTimeFormatter.ISO_DATE));
		System.out.println("ISO_ZONED_DATE_TIME: " + zdt.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
		
		System.out.println("ISO_WEEK_DATE: " + zdt.format(DateTimeFormatter.ISO_WEEK_DATE));
		
		// # java.time to java.sql.Date
		
		// - DB�� ���� �� ����Ѵ�
		LocalDate locald = LocalDate.of(1967, 06, 22);
		Date date = Date.valueOf(locald);
		java.sql.Time time = java.sql.Time.valueOf(LocalTime.of(3, 44, 30, 9981234));
		java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf(LocalDateTime.of(2020, 11, 26, 15, 45, 59, 123456));
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(timestamp);
	}
}
