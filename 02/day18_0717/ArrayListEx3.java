package day18_0717;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		Book2 b1 = new Book2("CC");
		Book2 b2 = new Book2("AA");
		Book2 b3 = new Book2("BB");
		
		a.add(b1); a.add(b2);a.add(b3);
		
		Collections.sort(a);
		
		System.out.println(a);
		
	}
}

//모든 컬렉션에서 정렬하려먼 comparable을 상속받아 메소드 재정의 해줘야 에러 안남
class Book2 implements Comparable{
	private String title;
	public Book2(String t) {
		title=t;
	}
	public String getTitle() {
		return title;
		
	}
	public String toString() {
		return title;
	}
	@Override
	public int compareTo(Object o) {
		Book2 book = (Book2)o;
		
		return title.compareTo(book.getTitle());
	}
}