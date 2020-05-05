package day14_0711;

 

public class SpecialMember extends Member{
	public SpecialMember(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {
		SpecialMember m = new SpecialMember("ȫ�浿");
		Member s = m;
		s.getName();
	}
}
