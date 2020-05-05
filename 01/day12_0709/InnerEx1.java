package day12_0709;

public class InnerEx1 {
	int m =0;
	class InstanceInner{
		int iv=100;
		int t =m;
		
		final static int CONST=100;
		
	}
	static class StaticInner{
		int iv=200;
		static int cv=200;
		
	}
	void myMethod()
	{
		class LocalInner{
			int iv = 300;
			int t =m;
			final static int CONST=300;
		}
	}
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);  
	}
}
