package day_0801;

public class Seats {
	private String seatType;
	private int seatNum;
	
		Seats(String seatType, int seatNum){
			this.seatType=seatType;
			this.seatNum=seatNum;
		}
		
		public String getSeatType() {
			return seatType;
		}
		public void setSeatType(String seatType) {
			this.seatType = seatType;
		}
		public int getSeatNum() {
			return seatNum;
		}
		public void setSeatNum(int seatNum) {
			this.seatNum = seatNum;
		}
		
		
}
