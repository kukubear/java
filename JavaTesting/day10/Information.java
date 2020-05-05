package day10;

public class Information {
	
		private int idNum;
		private long phNum;
		private String name;
		
		
		public long getPhNum() {
			
			return phNum;
		}
		public void setPhNum(int phNum) {
			
			this.phNum = phNum;
		}
		public int getIdNum() {
			return idNum;
		}
		public void setIdNum(int idNum) {
			this.idNum = idNum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		void out() {
			//long값의 부분출력
			System.out.println(name+"님의 핸드폰번호는 "+"010-"+phNum+"입니다.");
			System.out.println(name+"님의 주민번호는 "+idNum+"입니다.");
		}
		
		
	}

