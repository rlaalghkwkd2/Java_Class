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
	// - JavaScript에서 사용하는 Map타입
	// - 문자열만으로 Map을 간결하게 표현할 수 있어서 인기가 많다
	// - { Key : Value, Key : Value }의 형태를 가진다

	// # JSON Value에 사용되는 자바스크립트 타입들
	// - '', "" : String
	// - 숫자, 소수 : Number
	// - [] : Array
	// - {} : JSON

	// # JAVA에는 JSON타입을 지원하지 않기 때문에
	// 데이터들을 JSON 형태의 문자열로 만들어줘야 한다 (Parsing, Binding)
	
	   
	
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
		System.out.println("파일읽기 & Map완성 완료");
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

		System.out.println("파일쓰기 완료");
	}

	public static void main(String[] args) {
		// 다음 Map에 저장된 데이터를 JSON형태의 문자열로 생성하여 출력해보세요
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("abc", null);
		map.put("programming", new String[] { "JAVA", "Python", "JS" });
		map.put("lotto", new Integer[] { 1, 2, 3, 4, 5, 6 });

		// instanceof 연산자를 통해 해당 값의 타입을 구분할 수 있다
		System.out.println(map.get("name") instanceof String);
		System.out.println(map.get("age") instanceof String);
		System.out.println(map.get("age") instanceof Integer);
		System.out.println(map.get("programming") instanceof Object[]);
		/*
		 * 올바른 출력 : { "name" : '홍길동', "age" : 15, "tel" : '010-1234-1234', "programming"
		 * : ['JAVA', 'Python', 'JS'] }
		 */

		// 모든 것이 들어갈 수 있는 타입
		Object a = new int[10];
		Object b = new Object[10];

		// 다시 배열로 사용하기 위해 다운캐스팅
		System.out.println(((int[]) a)[0]);
		System.out.println(((Object[]) b)[0]);

		try {
			mapToJsonFile(map);
			HashMap<String, Object> map2 = new HashMap<>();

			// .json파일에 저장된 데이터를 JAVA맵으로 변환하는 메서드를 만들어보세요
			jsonFileToMap(map2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
