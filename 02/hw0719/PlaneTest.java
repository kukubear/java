package hw0719;

public class PlaneTest {
	public static void main(String[] args) throws Exception {
		
		Plane pl = new Plane("����777","�����װ�");
		
		FixHis fh1 = new FixHis("��õ��������", "20180725","������ ���� ����");
		FixHis fh2 = new FixHis("��������", "20170124","���� ����");
		FixHis fh3 = new FixHis("�̰�������������", "20180725","�� ����");
		
		pl.addFixHis(fh1);
		pl.addFixHis(fh2);
		pl.addFixHis(fh3);
		
		 pl.printFixHis();
		 
		
	}
}
