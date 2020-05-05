package day18_0717;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		new TreeSetTest().go();
	}
	
	public void go() {
		//Comparable �̿�
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");
		
		TreeSet tree = new TreeSet();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		//���ĵǾ� ��ȸ�ȴ�.
		System.out.println("1 : "+tree);
		
		//Comparator �̿�
		Book2 t1 = new Book2("How Cats Work");
		Book2 t2 = new Book2("Remix your Body");
		Book2 t3 = new Book2("Finding Emo");
		
		TreeSet tree2 = new TreeSet(new BookCompare());
		tree.add(t1);
		tree.add(t2);
		tree.add(t3);
		//���ĵǾ� ��ȸ�ȴ�.
		System.out.println("2 : "+tree2);
		//ù��° �� ��ȸ
		System.out.println("3 : "+tree2.first());
		//������ �� ��ȸ
		System.out.println("4 : "+tree2.last());
		//����
		System.out.println("5 : "+tree2.remove(new Book2("Finding Emo")));
		System.out.println("6 : "+tree2);
		tree2.add(t3);
		
		
		//���ں��� ���� ���� �׸���� ����
		SortedSet ss = tree2.headSet(new Book2("Remix your Body"));
		
		
	}
}
