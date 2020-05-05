package day18_0717;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		new TreeSetTest().go();
	}
	
	public void go() {
		//Comparable 이용
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");
		
		TreeSet tree = new TreeSet();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		//정렬되어 조회된다.
		System.out.println("1 : "+tree);
		
		//Comparator 이용
		Book2 t1 = new Book2("How Cats Work");
		Book2 t2 = new Book2("Remix your Body");
		Book2 t3 = new Book2("Finding Emo");
		
		TreeSet tree2 = new TreeSet(new BookCompare());
		tree.add(t1);
		tree.add(t2);
		tree.add(t3);
		//정렬되어 조회된다.
		System.out.println("2 : "+tree2);
		//첫번째 값 조회
		System.out.println("3 : "+tree2.first());
		//마지막 값 조회
		System.out.println("4 : "+tree2.last());
		//삭제
		System.out.println("5 : "+tree2.remove(new Book2("Finding Emo")));
		System.out.println("6 : "+tree2);
		tree2.add(t3);
		
		
		//인자보다 값이 작은 항목들의 집합
		SortedSet ss = tree2.headSet(new Book2("Remix your Body"));
		
		
	}
}
