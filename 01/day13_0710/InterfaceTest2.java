package day13_0710;
interface interA2{
	void aaa();
	public abstract void bbb();
	
}

class interB2 implements interA2{
	public void aaa() {
		System.out.println("aaa �޼���");
	}
	
	public void bbb() {
		System.out.println("bbb �޼��� ");
	}
}
public class InterfaceTest2 {
	public static void main(String[] args) {
		interB2 bp = new interB2();
		bp.aaa();
		bp.bbb();
	}
}
