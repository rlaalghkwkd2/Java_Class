import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E06_JSONMe {

	// # JSON
	// - JavaScript���� ����ϴ� MapŸ��
	// - ���ڿ������� Map�� �����ϰ� ǥ���� �� �־ �αⰡ ����
	// - { Key : Value, Key : Value }�� ���¸� ������

	// # JSON Value�� ���Ǵ� �ڹٽ�ũ��Ʈ Ÿ�Ե�
	// - '', "" : String
	// - ����, �Ҽ� : Number
	// - [] : Array
	// - {} : JSON

	// # JAVA���� JSONŸ���� �������� �ʱ� ������
	// �����͵��� JSON ������ ���ڿ��� �������� �Ѵ� (Parsing, Binding)
	
	   
	
	public static void jsonFileToMap(Map<String, Object> map) throws IOException {
		FileReader fr = new FileReader("C:\\java_io\\data.json");
		StringBuilder builder = new StringBuilder();
		StringBuilder builder2 = new StringBuilder();
		Object[] valuerr = null;
		int ch;
		while ((ch = fr.read()) != -1) {
			builder.append((char) ch);
		}
		System.out.println(builder);
		System.out.println("---------------------");
		String str = new String(builder);
		str = str.replace("{\n", "");
		str = str.replace("\n}", "");
		str = str.replace("\"", "");
		str = str.trim();
		String[] sarr = str.split("\n");
		System.out.println("---------------------");
		int i = 0;
		for (String string : sarr) {
			string = string.trim();
			string = string.replace("\t", "");
			string = string.replace(" ", "");
			sarr[i] = string;
			i++;
		}
		System.out.println("---------------------");
		for (String string : sarr) {
			string = string.replace("'", "\"");
			string = string.substring(0, (string.length() - 1));
			String[] starr = string.split(":");
			String key = starr[0];
			String value = starr[1];
			if (value.contains("[")) {
				value = value.replace("[", "");
				value = value.replace("]", "");
				valuerr = value.split(",");
				for (Object string2 : valuerr) {
					
				}
				map.put(key, valuerr);
				continue;
			} else if (value.contains("\"")) {
				value = value.replace("\"", "");
				map.put(key, (String) value);
				continue;
			} else if (value.equals("null")) {
				map.put(key, null);
			} else {
				map.put(key, Integer.parseInt(value));
			}

		}
		if (valuerr[0] instanceof String) {
			String new_name = (String) valuerr[0];
			System.out.println(new_name);
		}
		System.out.println(map.get("programming"));
		System.out.println((Integer)map.get("age"));
		System.out.println("Result : " + map.entrySet());

		fr.close();
		System.out.println("�����б� & Map�ϼ� �Ϸ�");
	}

	public static void mapToJsonFile(Map<String, Object> map) throws IOException {
		StringBuilder builder = new StringBuilder();

		builder.append("{\n");

		int count = 0;
		int size = map.size() - 1;

		for (Map.Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();

			builder.append("\t\"" + key + "\"\t: ");

			if (value == null) {
				builder.append("null");
			} else if (value instanceof String) {
				builder.append("'" + value + "'");
			} else if (value instanceof Object[]) {

				Object[] arr = (Object[]) value;

				if (arr.length == 0) {
					builder.append("[]");
				}

				if (arr instanceof String[]) {
					builder.append("[");

					int len = arr.length - 1;

					int lencount = 0;
					for (Object obj : arr) {
						builder.append("'" + obj + "'");

						if (lencount++ == len) {
							builder.append("]");
						} else {
							builder.append(", ");
						}
					}
				} else {
					builder.append("[");

					int len = arr.length - 1;

					int lencount = 0;
					for (Object obj : arr) {
						builder.append(obj);

						if (lencount++ == len) {
							builder.append("]");
						} else {
							builder.append(", ");
						}
					}
				}

			} else {
				builder.append(value);
			}

			if (count++ == size) {
				builder.append("\n}");
			} else {
				builder.append(",\n");
			}
		}

		// System.out.println(builder);

		FileWriter fw = new FileWriter("C:\\java_io\\data.json");

		fw.write(new String(builder));

		fw.close();

		System.out.println("���Ͼ��� �Ϸ�");
	}

	public static void main(String[] args) {
		// ���� Map�� ����� �����͸� JSON������ ���ڿ��� �����Ͽ� ����غ�����
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "ȫ�浿");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("abc", null);
		map.put("programming", new String[] { "JAVA", "Python", "JS" });
		map.put("lotto", new Integer[] { 1, 2, 3, 4, 5, 6 });

		// instanceof �����ڸ� ���� �ش� ���� Ÿ���� ������ �� �ִ�
		System.out.println(map.get("name") instanceof String);
		System.out.println(map.get("age") instanceof String);
		System.out.println(map.get("age") instanceof Integer);
		System.out.println(map.get("programming") instanceof Object[]);
		/*
		 * �ùٸ� ��� : { "name" : 'ȫ�浿', "age" : 15, "tel" : '010-1234-1234', "programming"
		 * : ['JAVA', 'Python', 'JS'] }
		 */

		// ��� ���� �� �� �ִ� Ÿ��
		Object a = new int[10];
		Object b = new Object[10];

		// �ٽ� �迭�� ����ϱ� ���� �ٿ�ĳ����
		System.out.println(((int[]) a)[0]);
		System.out.println(((Object[]) b)[0]);

		try {
			mapToJsonFile(map);
			HashMap<String, Object> map2 = new HashMap<>();

			// .json���Ͽ� ����� �����͸� JAVA������ ��ȯ�ϴ� �޼��带 ��������
			jsonFileToMap(map2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
