package day17_0716;

public class Developer {

	// �Ӽ�
	private String name;
	private int period;

	// ������
	Developer(String name, int period) {
		this.name = name;
		this.period = period;
	}

	// �� �Ӽ��� get,set Method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

}
