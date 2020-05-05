package day09;
//this: 자기 클래스 객체를 가리킴
public class MamaPapa {
	
		private int f2; int m2;
			public MamaPapa(int m2, int f2) {
				this.m2=m2;
				this.f2=f2;
			}
			protected void sum() {
				int sum = m2+f2;
				System.out.println(sum);
			}
			public int getF2() {
				return f2;
			}
			public void setF2(int f2) {
				this.f2 = f2;
			}
			public int getM2() {
				return m2;
			}
			public void setM2(int m2) {
				this.m2 = m2;
			}
			
		}
