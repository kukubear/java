package day18_0717;

import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		
		set1.add("apple");
		set1.add("banana");
		System.out.println(set1.add("apple"));
		System.out.println("set1 : "+set1);
		System.out.println("contains : "+set1.add("apple"));
		
		//�߰� ����
		HashSet set2 = (HashSet)set1.clone();
		set2.add("melon");
		set2.remove("apple");
		System.out.println("set2 : "+set2);
		
		//������, Collections Add, �ߺ����� �ʰ� set2�� ������ result�� add��Ų��.
		HashSet result = (HashSet) set1.clone();
		result.addAll(set2);
		System.out.println("addAll : "+result);
		
		//������
	}
}
