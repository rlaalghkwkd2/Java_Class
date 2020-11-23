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
	// - JacaScript���� ����ϴ� MapŸ��
	// - ���ڿ������� Map�� �����ϰ� ǥ���� �� �־ �αⰡ ����.
	// - { Key : Value, Key : Value }�� ���¸� ������.

	// # JSON Value�� ���Ǵ� �ڹٽ�Ʈ��Ʈ Ÿ�Ե�
	// - '', "" : String
	// - ����, �Ҽ� : Number
	// - [] : Array
	// - {} : JSON

	// # JAVA������ JSONŸ���� �������� �ʱ� ������ �����͵���
	// JSON ������ ���ڿ��� �������� �Ѵ�.(Parsing,Binding)

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

		// ���� Map�� ����� �����͸� JSON������ ���ڿ��� �����Ͽ� ����غ��ÿ�.

		// ����
		HashMap<String, Object> map = new HashMap<>();
		Object[] arr = { "JAVA", "Python", "JS" };
		map.put("name", "ȫ�浿");
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
			System.out.println("[System]���� ���� �Ϸ�!");
		} catch (Exception e) {

		}

		// ��� ���� �� �� �ִ� Ÿ��
		Object a = new int[10];
		Object b = new Object[10];
		
		// �ٽ� �迭�� ����ϱ� ���� �ٿ�ĳ����
		System.out.println(((int[])a)[0]);
		System.out.println(((Object[])b)[0]);
		
		
	}
}
