
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class D03_LinkedList {

	// # ���� ����Ʈ
	// - ArraysList���� ����/������ ������ ����Ʈ
	// - �߰��� ������ �Ͼ�� �� ArrayList�� ��� �����͸� �ڷ� �̵����ѿ� ������ (Shift)
	// LinkedList�� ����� ��常 �ٲٸ� �Ǳ� ������ �ξ� ������.
	// - ArraysList�� ������ ����, �б⿡ �����ϰ�
	// - LinkedList�� ������ �߰� �� ������ �����ϴ�.

	public static void main(String[] args) {

		LinkedList<String> mem = new LinkedList<String>();

		mem.add("ȸ��1");
		mem.add("ȸ��2");
		mem.add("ȸ��3");

		mem.addFirst("�� ��");
		mem.addLast("�� ��");

		System.out.println(mem);

		System.out.println(mem.get(3));
		System.out.println(mem.getFirst());
		System.out.println(mem.getLast());

		// pop() : �� ���� �����͸� �����鼭 ����
		System.out.println("---- pop ����----");
		for (int i = 0, len = mem.size(); i < len; i++) {

			System.out.println("��� ���� �� : " + mem.pop());
			System.out.println("after pop : " + mem);
		}

		// �� LinkedList�� ����Ʈ, ���� LIFO, ť(FIFO)ó�� Ȱ���� �� �ִ�.

		mem.add("ȸ��1");
		mem.add("ȸ��2");
		mem.add("ȸ��3");
		mem.add("ȸ��4");
		mem.add("ȸ��5");

		System.out.println(mem);

		// poll() : ù ��° ��Ҹ� ��ȯ�ϰ� ���� (pop�� �Ȱ���)
		System.out.println(mem.poll());
		System.out.println(mem);

		// pollLast() : ���� �ֱٿ� �߰��� ��Ҹ� ��ȯ�ϰ� ����(LIFO : Last in First out)
		System.out.println(mem.pollLast());
		System.out.println(mem);

		// peek() : ������ ���� �ʰ� �� ó�� ��Ҹ� ��ȯ�Ѵ�.
		System.out.println(mem.peek());
		System.out.println(mem);

		// peekLast() : ������ ���� �ʰ� �� ������ ��Ҹ� ��ȯ�Ѵ�.
		System.out.println(mem.peekLast());
		System.out.println(mem);

		// �ӵ� ���� �׽�Ʈ
		ArrayList<Integer> arr_list = new ArrayList<Integer>(1000000);

		for (int i = 0; i < 10000000; i++) {
			arr_list.add(i);
		}

		LinkedList<Integer> linked_list = new LinkedList<Integer>();

		for (int i = 0; i < 10000000; i++) {
			linked_list.add(i);
		}

		HashSet<Integer> toAdd = new HashSet<Integer>();

		for (int i = 0; i < 5000; i++) {
			toAdd.add(i);
		}

		// ArrayList�� �߰��� �����͸� �߰��ϴ� ���� ������
		long start = System.currentTimeMillis();
		System.out.println("ArryList Insertion Test ����");
		for (int i = 0; i < 200; i++) {
			arr_list.addAll(10, toAdd);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList End " + (end - start) + "�и���");

		System.out.println("LinkedList Insertion Test ����");

		// LinkedList�� �߰��� �����͸� �߰��� �� �����ϴ�
		start = System.currentTimeMillis();
		for (int i = 0; i < 200; i++) {
			linked_list.addAll(10, toAdd);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkdeList End " + (end - start) + "�и���");

		// �� �̻� �߰�/���� �Ͼ�� ���� �����͸� ArryList�� ��ȯ�Ͽ� ����
		List<Integer> to_store = new ArrayList<Integer>(linked_list);

		start = System.currentTimeMillis();
		System.out.println("ArrayList Reading Test...");
		for (int test = 0; test < 10; test++) {
			for (int i : to_store) {
				int a = 1 + 10;
			}
		}
		end = System.currentTimeMillis();
		System.out.println("Test end " + (end - start) + "ms");

		start = System.currentTimeMillis();
		for (int test = 0; test < 10; test++) {
			System.out.println("LinkedList Reading Test...");
			for (int i : linked_list) {
				int a = i + 10;
			}
		}
		end = System.currentTimeMillis();
		System.out.println("Test end " + (end - start) + "ms");

	}
}