package day12_0709;

public class ThisSample {
	private int x;
	private static int y;
	//pulbic void aaa(ThisSample this){
	public void aaa() {
		this.x=10;
		ThisSample.y=20;
	}
	
	//public void bbb(ThisSample this){
	public void bbb(int x, int y) {
		this.x=x;
		ThisSample.y=y;
	}
	
	//public static void ccc(){
	public static void ccc() {
		//this.x//Error
		ThisSample.y=10;
	}
	
}
