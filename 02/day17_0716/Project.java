package day17_0716;

public class Project {

	// �Ӽ�
	private String name;
	private String startDt;
	private String endDt;
	private String location;
	private int period;
	private Developer[] dev;

	// ������
	Project(String name, String startDt, String endDt, String location) {
		this.name = name;
		this.startDt = startDt;
		this.endDt = endDt;
		this.location = location;
	}

	Project(String name, String startDt, String endDt, String location, Developer[] dev) {
		this(name, startDt, endDt, location);
		this.dev = dev;
	}

	// ��� ������Ʈ�� ������ 4���� ������ ��ģ��.
	public void process() {

		plan();
		design();
		develop();
	}

	// "Project �غ� ���"
	public void plan() {
		System.out.println("Project �غ�");
	}

	// Project�� ������ �߰�
	public void join(Developer[] d) {
		this.dev = d;
	}

	// "�����۾����� ���
	public void design() {
		System.out.println("���� �۾�����");
	}

	// �����۾����� ���
	public void develop() {
		System.out.println("�����۾�����");
	}

	// project�� ������ �������� �� ���� ������
	public int getMMByDeveloper() {
		
		int sum =0;
		for(int i =0; i<dev.length; i++) {
			sum+=dev[i].getPeriod();
		}

		return sum;
	}

	public void printDeveloper(Object obj) {
		//else if�� ������ if�� ���� �������� 
		if (obj instanceof HighDeveloper) {
			System.out.println(
					"��ް����� " + ((HighDeveloper) obj).getName() + " /Ư�� : " + ((HighDeveloper) obj).getSpecialSkill());
		} else {
			System.out.println("�Ϲݰ����� " + ((Developer) obj).getName());
		}
	}

}
