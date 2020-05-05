package day11_0708;

public class ClassTest extends Object{
	private int[]sub;
	private float avg;
	
	public ClassTest() { //Construct(생성자)
		sub = new int[4];
		avg=0.0f;
	}
	public void calc() {//Method
		int tot=0;
		for(int a =0; a<sub.length; a++) {
			tot+=sub[a];
		}
		avg=tot/sub.length;
	}
	
	public static class ClassTest_inner{//Nested class
		private String[] subname = {"국어", "영어","수학"}; //Field
		
		public String getSubname(int x) {//Method
			return subname[x];
		}
	}

}
