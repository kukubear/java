package day16_0715;

public 
	class Programmer {
		private String name;
		private int age;
		private Project now;
		private Project[] history;
		private int count;

		
		// ���� �������� project ����
		void joinProject(Project p) {

			this.now = p;
		}

		// project��� �߰�
		void addProjectHistory(Project p) {
			int i = 0;

			for (i=0 ; i < 5; i++) {
				p = history[i];
				count++;
				try {

					if (count >= 5);

				} catch (Exception e) {
					System.out.println("Project History�� 5������ �߰������մϴ�.");
				}

			}

			
		}

		Project getNowProject() {
			return now;

		}

		void printProjectHistory() {
			System.out.println(getTotalHistory());
		}

		String getTotalHistory() {
			int sum = 0;
			int year = 0;
			int month = 0;

			for (int i = 0; i < 5; i++) {
				sum += month;
			}
			if (sum >= 12) {
				month = sum % 12;
				year = sum / 12;
			}

			return "�� ����� ����" + year + "�� " + month + "��";

		}

		public static void main(String[] args) {
			Programmer pr = new Programmer();
			Project [] pj = new Project[5];
			pj[0] = new Project("������Ʈ 1", 14, "ȸ��1");
			pj[1] = new Project("������Ʈ 2", 8, "ȸ��2");
			pj[2] = new Project("������Ʈ 3", 30, "ȸ��3");
			pj[3] = new Project("������Ʈ 4", 6, "ȸ��4");
			pj[4] = new Project("������Ʈ 5", 3, "ȸ��5");
			
			Project extraPj = new Project("������Ʈ6", 9,"ȸ��6");
			
			pr.getNowProject();
			pr.getTotalHistory();
			pr.addProjectHistory(extraPj);
			pr.joinProject(pj[pj.length-1]);
			pr.printProjectHistory();
			
		}

	}

