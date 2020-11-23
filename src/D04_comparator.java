import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import myobj.Student;
import myobj.comp.StudentComparatorA;

public class D04_comparator {
	public static void main(String[] args) {
		List<String> words = new LinkedList<>();
		
		words.add("airplane");
		words.add("jet");
		words.add("coffee");
		words.add("glasses");
		words.add("oriental");
		
		Collections.sort(words);
		System.out.println(words);
		
		List<Student> group = new LinkedList<>();
		
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		
		Collections.sort(group); // 비교 기준이 Student는 기준이 없다..
	
		
//		Collections.sort(group, new StudentComparatorA());
		Collections.sort(group, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return (int) Math.ceil((o1.getAvg()-o2.getAvg()));
			}
			
		});
		System.out.println(group);

		
	}
}