package day10;

class PapaGrandPa{
	public static void grandPa() {
		
	
	String grandPa = "�������";
	System.out.println(grandPa);
	
	
	}

	public void papa() {
		// TODO Auto-generated method stub
		String papa = "�ڵ����";
		System.out.println(papa);
		
	}
}
public class Ex02 extends PapaGrandPa{
	//�Ҿƹ����� ���� �� ����Ͻð�
	//�ƹ����� �ڵ��� �ϴµ�
	//���� 2���� �� �����
	public static void main(String[] args) {
		 PapaGrandPa pgp = new PapaGrandPa();
		
		 pgp.grandPa();
		 pgp.papa();
		 

	}

}
