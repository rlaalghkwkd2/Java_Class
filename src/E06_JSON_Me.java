import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class E06_JSON_Me {

	// # JSON
	// - JacaScript에서 사용하는 Map타입
	// - 문자열만으로 Map을 간결하게 표현할 수 있어서 인기가 많다.
	// - { Key : Value, Key : Value }의 형태를 가진다.

	// # JSON Value에 사용되는 자바스트립트 타입들
	// - '', "" : String
	// - 숫자, 소수 : Number
	// - [] : Array
	// - {} : JSON

	// # JAVA에서는 JSON타입을 지원하지 않기 때문에 데이터들을
	// JSON 형태의 문자열로 만들어줘야 한다.(Parsing,Binding)

	public static String instanceOf(Object value) {
		StringBuilder result = new StringBuilder();
		if (value instanceof Integer) {
			result.append(value);
		} else if (value instanceof String) {
			result.append("'" + value + "'");
		}

		else if (value instanceof Double) {
			result.append(value);
		}

		else if (value instanceof Object[]) {
			Object[] down = (Object[]) value;
			int j = 0;
			for (Object obj : down) {
				if (j == 0) {
					result.append("[");
				}
				result.append(instanceOf(obj));
				
				if (j++ == down.length-1) {
					result.append("]");
				}else {
					result.append(", ");
				}
			}
		}else {
			result.append(value);
		}
		return result.toString();
	}

	public static void main(String[] args) {

		// 다음 Map에 저장된 데이터를 JSON형태의 문자열로 생성하여 출력해보시오.

		// 문제
		HashMap<String, Object> map = new HashMap<>();
		Object[] arr = { "JAVA", "Python", "JS" };
		map.put("name", "홍길동");
		map.put("age", 15);
		map.put("ABC", null);
		map.put("tel", "010-1234-1234");
		map.put("programming", arr);
		map.put("programming2", new Integer[][] {{1, 2, 3 }, {2, 6, 7}});

		int i = 0;
		StringBuilder result = new StringBuilder();

		for (String key : map.keySet()) {
			// System.out.println(key + ": " + (map.get(key) instanceof Object[]));
			if (i == 0) {
				result.append("{\n");
			}
			result.append(String.format("   \"%-12s\"" + " : ", key));
			result.append(instanceOf(map.get(key)));
			
			if (i++ == map.size()-1) {
				result.append("\n}");
			}else{
				result.append(",\n");
			}
		}

		try (FileOutputStream fout = new FileOutputStream("C:\\java_io\\JSON2.json");
				BufferedOutputStream bout = new BufferedOutputStream(fout);
				PrintWriter pw = new PrintWriter(bout);) {
			pw.print(result);
			System.out.println(result);
			System.out.println("[System]파일 생성 완료!");
		} catch (Exception e) {

		}

		// 모든 것이 들어갈 수 있는 타입
		Object a = new int[10];
		Object b = new Object[10];
		
		// 다시 배열로 사용하기 위해 다운캐스팅
		System.out.println(((int[])a)[0]);
		System.out.println(((Object[])b)[0]);
		
		
	}
}
