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
			//long���� �κ����
			System.out.println(name+"���� �ڵ�����ȣ�� "+"010-"+phNum+"�Դϴ�.");
			System.out.println(name+"���� �ֹι�ȣ�� "+idNum+"�Դϴ�.");
		}
		
		
	}

