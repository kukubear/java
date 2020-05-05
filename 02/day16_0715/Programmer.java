package day16_0715;

public 
	class Programmer {
		private String name;
		private int age;
		private Project now;
		private Project[] history;
		private int count;

		
		// 현재 진행중인 project 설정
		void joinProject(Project p) {

			this.now = p;
		}

		// project경력 추가
		void addProjectHistory(Project p) {
			int i = 0;

			for (i=0 ; i < 5; i++) {
				p = history[i];
				count++;
				try {

					if (count >= 5);

				} catch (Exception e) {
					System.out.println("Project History는 5개까지 추가가능합니다.");
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

			return "총 경력의 합은" + year + "년 " + month + "월";

		}

		public static void main(String[] args) {
			Programmer pr = new Programmer();
			Project [] pj = new Project[5];
			pj[0] = new Project("프로젝트 1", 14, "회사1");
			pj[1] = new Project("프로젝트 2", 8, "회사2");
			pj[2] = new Project("프로젝트 3", 30, "회사3");
			pj[3] = new Project("프로젝트 4", 6, "회사4");
			pj[4] = new Project("프로젝트 5", 3, "회사5");
			
			Project extraPj = new Project("프로젝트6", 9,"회사6");
			
			pr.getNowProject();
			pr.getTotalHistory();
			pr.addProjectHistory(extraPj);
			pr.joinProject(pj[pj.length-1]);
			pr.printProjectHistory();
			
		}

	}

