package hw0719;

public class PlaneTest {
	public static void main(String[] args) throws Exception {
		
		Plane pl = new Plane("보잉777","대한항공");
		
		FixHis fh1 = new FixHis("인천국제공항", "20180725","오른쪽 엔진 수리");
		FixHis fh2 = new FixHis("김포공항", "20170124","날개 수리");
		FixHis fh3 = new FixHis("싱가포르국제공항", "20180725","문 수리");
		
		pl.addFixHis(fh1);
		pl.addFixHis(fh2);
		pl.addFixHis(fh3);
		
		 pl.printFixHis();
		 
		
	}
}
