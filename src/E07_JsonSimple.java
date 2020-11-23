import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class E07_JsonSimple {

	// google 'maven repo' �˻� -> �ڹ� ���̺귯������ ���ִ� ����Ʈ
	
	// # �ܺ� ���̺귯�� �߰� ���
	// Build path -> Configure BuildPath 
	//		-> Lip Tap -> Add External JAR
	
	public static void main(String[] args) {
		
		// mapó�� �����͸� �߰��Ѵ�.
		JSONObject obj = new JSONObject();
		
		// JSON �迭�� ����� ���ؼ��� ArrayList�� ����ؾ� �Ѵ�.
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Programming");
		arr.add("Fishing");
		arr.add("Billiard");
		
		obj.put("car", "BMW");
		obj.put("addr", "�λ�����");
		obj.put("age", 27);
		obj.put("hobbies", arr);
		
		// toString�� �����Ǿ��ִ�.
		System.out.println(obj);
		String jsonStr = obj.toString();
		System.out.println(jsonStr);
		
		JSONParser parser = new JSONParser();
		
		try {
			// File���� �о�� �����͸� JSON������ Map�� �Ľ�
			JSONObject obj2 = (JSONObject) parser.parse(new FileReader("C:\\java_io\\data.json"));
			
			System.out.println(obj2.get("��"));
			System.out.println(obj2.get("��"));
			System.out.println(obj2.get("��"));
			System.out.println(obj2.get("lotto"));
			System.out.println(obj2.get("programming"));
			
			
			System.out.println(obj2);
			// JSONObject ������ �迭 ������ ����ϱ� 
			JSONArray  programs = (JSONArray)(obj2.get("programming"));
			
			for(Object program : programs) {
				System.out.println(program);
			}
			
			// JSONObject ������ JSONObject ����ϱ�
			JSONObject minsu = (JSONObject) obj2.get("�μ�");
			
			System.out.println(minsu.get("���� �����ϴ� �峭��"));
			System.out.println(minsu.get("����"));
			
			// JSON - ������ ������ Map�� ������ �� �ִ� ���ڿ� (�����ϱ� ���� ����)
			
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
