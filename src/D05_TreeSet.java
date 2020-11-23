
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.fruit.Mango;

public class D05_TreeSet {

	// # TreeSet
	// - �ߺ����� ������ �� ����. �̰� Set�� Ư¡
	// - �����͸� ������ �� ������������ �����Ѵ�.
	// - ��ҷ� null�� ������� �ʴ´�.
	// - ���� �ӵ��� ���� ��� ������ ����/�˻� �ӵ��� ������.

	// �� �ߺ����� + ���ϴ� �κ� ���� ���� + ����

	public static void main(String[] args) {
		TreeSet<Mango> sugar_mango_tree = new TreeSet<>(new Comparator<Mango>() {

			@Override
			public int compare(Mango o1, Mango o2) {
				// Set�� ���� �����͸� ������� �ʱ� ������,
				// ���� �絵�� ���� ���� ��� ������� �ȴ�.

				// ���� �絵�� ������ ���� ����id �������� �ٽ� �����ϱ�
				int sugar_value = o1.sugar - o2.sugar;

				// id��� hashCode()�� ����ص� �ȴ�.(�ش� ��ü�� �����ϰ� �����ϴ� ��)
				return sugar_value == 0 ? o1.id - o2.id : sugar_value;
			}
		});

		for (int i = 0; i < 500; i++) {
			sugar_mango_tree.add(new Mango());
		}

		System.out.println(sugar_mango_tree);

		// Comparable���� return 0�� ���� ��ü���� �ǹ��Ѵ�.
		Set<Mango> basic_comp_tree = new TreeSet<>();

		for (int i = 0; i < 300; i++) {
			basic_comp_tree.add(new Mango());
		}
		System.out.println("Basic tree�� ����� ���� : " + basic_comp_tree.size());

		// # TreeSet Ȱ��

		// descendingSet : ������������ ���ĵ� Set�� ��ȯ
		System.out.println(sugar_mango_tree.descendingSet());

		// # TreeSet�� ���ϴ� �������� ������ ����ϱ�

		// headSet(toElement) : �� �պ��� ���ϴ� ��ġ������ Set�� ��ȯ
		Set<Mango> hSet = sugar_mango_tree.headSet(new Mango(0, 5, 500));
		System.out.println("hSet : " + hSet);
		System.out.println("hSet�� ���� : " + hSet.size());

		// tailSet(fromElement) : ���ϴ� ���غ��� �� ������������ Set�� ��ȯ
		SortedSet<Mango> tSet = sugar_mango_tree.tailSet(new Mango(0, 5, 500));
		System.out.println("tSet�� ���� : " + tSet.size());

		SortedSet<Mango> h_tSet = tSet.headSet(new Mango(0, 8, 1000));
		System.out.println("h_tSet�� ���� : " + h_tSet.size());

		SortedSet<Mango> t_tSet = tSet.tailSet(new Mango(0, 8, 1000));
		System.out.println("t_tSet�� ���� : " + t_tSet.size());

		// subSet(fromElement, toElement)
		SortedSet<Mango> result = sugar_mango_tree.subSet(new Mango(0, 7, 1000), new Mango(0, 9, 1000));
		System.out.println(result);

		// # TreeSet��Ҹ� �ϳ��� �����ϱ�
		TreeSet<Integer> int_tree = new TreeSet<>();
		int_tree.add(99);
		int_tree.add(1);
		int_tree.add(75);
		int_tree.add(3);
		int_tree.add(40);
		int_tree.add(11);

		// floor(lower) ���� ceil(higher) �ø�

		// floor, ceiling
		// - �ش� �� �������� ���� ����� ����/���� ���� �ϳ� ��ȯ
		// - ������ ���� ���� ���� �ִٸ� �ش� ���� ��ȯ�Ѵ�.

		System.out.println(int_tree.ceiling(11));
		System.out.println(int_tree.floor(12));

		// lower, higher
		// - �ش� �� �������� ���� ����� ���� ���� �ϳ� ��ȯ
		// - ������ ���� ���� ���� �����Ѵ�.
		System.out.println(int_tree.higher(11));
		System.out.println(int_tree.lower(12));

	}

}