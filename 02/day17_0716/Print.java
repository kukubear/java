package day17_0716;

public class Print {
	public static void main(String[] args) {
		
	
	HrProject hrpj = new HrProject("HR������Ʈ", "20170101", "20171201", "����");

	Developer[] dev = new Developer[3];
	dev[0]=new Developer("ȫ�浿",12);
	dev[1]=new Developer("��浿",5);
//	HighDeveloper hidev = new HighDeveloper("����", 20, "java");
	
	dev[2] = new HighDeveloper("����", 20, "java");
	
	hrpj.join(dev);

	
	hrpj.process();
	
	System.out.println("Project�� ������ �������� �� ���� ���� ���� "+hrpj.getMMByDeveloper()+"���� �Դϴ�.");
	

	hrpj.printDeveloper(dev[0]);
	hrpj.printDeveloper(dev[1]);
	hrpj.printDeveloper(dev[2]);
	
		
	}
}

