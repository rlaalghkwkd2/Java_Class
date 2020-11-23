import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class D07_HashMap {
	// # Map
	// - Key/Value�� �� ��Ʈ�� �̷�� �ڷᱸ��
	// - Key���� ���� Value�� ã�� �ڷᱸ��
	// - Key�� �ߺ��� ������� �ʴ´�.

	public static void main(String[] args) {
		// Map�� Key/Value���� �̷�� ������ ���׸��� �� �� �޴´�.
		Map<String, String> map1 = new HashMap<>();

		// put�޼��带 �̿��� �����͸� �����Ѵ�.
		// - Key�� �ش� �������� ī����(�Ӽ�, property, attribute)�� �ǹ��Ѵ�.
		// - Value�� �ش� �׸��� ���� �����Ѵ�.
		map1.put("�̸�", "������");
		map1.put("����", "5��");
		map1.put("����", "���޶�Ͼ�");
		map1.put("����", "ġ�Ϳ�"); // ���� Key�� ����ϸ� ���� �����ȴ�.
		map1.put("������ ����", "5��");

		// # get�޼��忡 Key���� ������ ���ϴ� �׸��� value�� ������.
		System.out.println(map1.get("����"));

		// # �ݺ������� Map Ȱ���ϱ�
		// - keySet : Key��� �̷���� Set�� ��ȯ�Ѵ�. Key�� �ߺ��� ����.
		// - values : Value��� �̷���� Collection�� ��ȯ�Ѵ�.
		// - entrySet : Entry<K,V>��� �̷���� Set�� ��ȯ�Ѵ�.

		System.out.println("map1�� key�� : " + map1.keySet());
		System.out.println("map1�� value�� : " + map1.values());
		System.out.println("map1�� entry�� : " + map1.entrySet());

		// # keySet���� ������
		for (String key : map1.keySet()) {
			System.out.println(key + " - " + map1.get(key));
		}

		// # values�� ������
		// - Key�� Value�� ã�� ���� ������ Value�� Key�� ã�°��� �Ұ����ϴ�.
		for (String value : map1.values()) {
			System.out.println(value);
		}

		// # entrySet���� ������
		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " / " + entry.getValue());
		}
		
		//  - ���� �� ������ ����. 
		 HashMap<String, String> map2 = new HashMap<>();
		 map2.put("TEST1","ABC");
		 map2.put("TEST2","ABCD");
		 map2.put("TEST3","ABCDE");
		 
		
		// # containsKey
		System.out.println(map1.containsKey("������ ����"));
		System.out.println(map1.containsKey("������ ���� "));
		
		// # containsValue
		System.out.println(map1.containsValue("5��"));
		
		// # putAll�� �ٸ� Map�� �����͸� �߰��� �� �ִ�.
		map1.putAll(map2);
		System.out.println(map1);
		
		// # remove�޼���� ���ϴ� �����͸� ���� �� �ִ�.
		//  - Key�� ������ ����� ��� : ��� ������ ���� ��ȯ�Ѵ�.
		//  - Key�� Value��θ� ������ �ִ� ��� : ��Ȯ�ϰ� ���� ��ġ�� �� �����Ѵ�.
		map1.remove("����","6��");
		System.out.println(map1);
		map1.remove("����","5��");
		System.out.println(map1);
		System.out.println(map1.size());
		
		// # get�޼��带 ����ϴٰ� ������ Ȥ�� Ű�� ���� ��� null�� ��ȯ�Ǿ�
		//  NullpointerException�� �߻��� ������ �ִ�.
		
		// # getOrDefault�޼��带 �̿��� null���� ��ȯ�Ǵ� ��Ȳ�̶�� �⺻����
		// 	��ȯ���� �� �ִ�.
		System.out.println(map1.getOrDefault("������ �̸�", "�⺻��").charAt(1));
		System.out.println(map1.get("������ ����"));
		
		// # MapŸ�� ���ο� MapŸ�� �ֱ�
		HashMap<String, HashMap<String, String>> phon_book = new HashMap<>();
		
		// ���ο� �ؽ����� �ν��Ͻ��� ������ �����ϸ�, Ű������ �ش� �ؽ����� ���� �� �ִ�.
		phon_book.put("�п�",new HashMap<>());
		phon_book.put("����",new HashMap<>());
		phon_book.put("����б�",new HashMap<>());
		phon_book.put("���б�",new HashMap<>());
		phon_book.put("���Ƹ�",new HashMap<>());
		
		HashMap<String,String> group_map = phon_book.get("�п�");
		
		// �ߺ��Ǵ� ���� Ű������ ����� �� ���� ������
		// Ű������ �̸����ٴ� ��ȭ��ȣ ���� ���� ����ϴ� ���� ����.
		group_map.put("010-1234-1234", "�踻��");
		group_map.put("010-5678-5678", "�踻��");
		System.out.println(phon_book);
		
// {����={}, ���б�={}, ���Ƹ�={}, �п�={010-5678-5678=�踻��, 010-1234-1234=�踻��}, ����б�={}}

	
	
	
	
	}

}
