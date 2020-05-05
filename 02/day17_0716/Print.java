package day17_0716;

public class Print {
	public static void main(String[] args) {
		
	
	HrProject hrpj = new HrProject("HR프로젝트", "20170101", "20171201", "서울");

	Developer[] dev = new Developer[3];
	dev[0]=new Developer("홍길동",12);
	dev[1]=new Developer("김길동",5);
//	HighDeveloper hidev = new HighDeveloper("김고급", 20, "java");
	
	dev[2] = new HighDeveloper("김고급", 20, "java");
	
	hrpj.join(dev);

	
	hrpj.process();
	
	System.out.println("Project에 참여한 개발자의 총 월간 개월 수는 "+hrpj.getMMByDeveloper()+"개월 입니다.");
	

	hrpj.printDeveloper(dev[0]);
	hrpj.printDeveloper(dev[1]);
	hrpj.printDeveloper(dev[2]);
	
		
	}
}

