package day10;

class PapaGrandPa{
	public static void grandPa() {
		
	
	String grandPa = "수동기어";
	System.out.println(grandPa);
	
	
	}

	public void papa() {
		// TODO Auto-generated method stub
		String papa = "자동기어";
		System.out.println(papa);
		
	}
}
public class Ex02 extends PapaGrandPa{
	//할아버지는 수동 기어를 사용하시고
	//아버지는 자동기어를 하는데
	//나는 2개다 기어를 사용함
	public static void main(String[] args) {
		 PapaGrandPa pgp = new PapaGrandPa();
		
		 pgp.grandPa();
		 pgp.papa();
		 

	}

}
