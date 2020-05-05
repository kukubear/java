package day_0724;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class PakringLotAdm implements Comparator {
	private Date startDt;
	private Date endDt;
	private final int maxCarsu;
	private HashSet<Car> cars = new HashSet<>(); // �ߺ��ȵ�
	private ArrayList<Car> outCars = new ArrayList<>();// �ߺ��ص� �������?!
	private Queue<Car> waitCars ;// �ߺ��ȵ�

	PakringLotAdm(Date startDt, Date endDt, int maxCarsu) {
		
		this.startDt = startDt;
		this.endDt = endDt;
		this.maxCarsu=maxCarsu;
	}

	// �����ϴ� �� �߰�
	//
	public void addCar(Car car)  {
		
		cars.add(car);

		
		// �������� ��á�� �� ��������� ��⸮��Ʈ�� �����Ѵ�.
		if (cars.size() > maxCarsu) {
			waitCars = new LinkedList<>();
			waitCars.offer(car);
		}
		
	}

	// ������ �� �����ϸ� outCars�� �߰��ϰ� ��������� ����
	// 30�д� 500��
	// ���� ������� ���� ������ ������Ų�� (���� ������� ���� ��� ������ ���� ����)
	public int outCar(Car car) {

		cars.remove(car);
		// car�� �����ð��� LocalDateTime���� ����
		LocalDateTime inTime = LocalDateTime.ofInstant(car.getInDt().toInstant(), ZoneId.systemDefault());
		LocalDateTime outTime = LocalDateTime.now();// �����ð��� ���� ����ð��� �޾Ƽ� ���

		// duration���� �ð����� ��� ->�����߻������ϱ� ������ ���밪ó�� Ȥ�� ��������Ͽ� ��ü ����
		Duration duration = Duration.between(outTime, inTime);

		// �ð����̸� duration���� ����Ѱ��� long type ������ ȯ���ϴ� �޼ҵ� ���
		// ->long type���� ���� �ʿ��ؼ� ���ο� ���� ����
		long minutes = duration.toMinutes();

		int totalfee = 0;
		// 30������ ������ fee���
		totalfee = (int) (minutes / 30 * 500);

		// ���� ������� ���� ������Ű�� -> ��Ȯ�� Test �ʿ�
		// queue�� ����ְ� ���������� ����ִٸ� ��⸮��Ʈ�� ���� ���������� �߰��Ѵ�.
		while (!waitCars.isEmpty() && cars.size() < maxCarsu) {
			cars.add((Car) waitCars);
		}

		/*
		 * Date class �̿��ϴ� �� Date inTime = car.getInDt(); Date outTime = new Date();
		 * 
		 * //�д����� �ð��� ��� long minute = getDateDiff(inTime, outTime, TimeUnit.MINUTES);
		 * System.out.println("�ð��� Ȯ�� : " + minute);
		 * 
		 * int fee =0;
		 * 
		 * for(int i = 0;;i++) {
		 * 
		 * 
		 * if(minute/30 == 0 && minute%30<30) { fee = 0; break;}
		 * 
		 * }
		 */

		return totalfee;

	}

	// �ð�����ϴ� �޼ҵ�
	/*
	 * public static long getDateDiff(Date inTime, Date outTime, TimeUnit minutes) {
	 * long diffInMills = outTime.getTime() - inTime.getTime();
	 * 
	 * return minutes.convert(diffInMills, TimeUnit.MILLISECONDS); }
	 */
	// �Ķ���ͷ� ������ ���ı��ؿ� ���� ���������� Sort�Ѵ�.
	public void carSort(Comparator c) {

	}

	// Compartor ������
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1;
		}
		return -1;
	}

	public Collection selectCheck(int hour) {
		return cars;

	}

	// �Ӽ��� ���� get/set
	public Date getStartDt() {
		return startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public Date getEndDt() {
		return endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public int getMaxCarsu() {
		return maxCarsu;
	}

	public ArrayList<Car> getOutCars() {
		return outCars;
	}

	public void setOutCars(ArrayList<Car> outCars) {
		this.outCars = outCars;
	}

	public Queue<Car> getWaitCars() {
		return waitCars;
	}

	public void setWaitCars(Queue<Car> waitCars) {
		this.waitCars = waitCars;
	}

	public void setCars(HashSet<Car> cars) {
		this.cars = cars;
	}

}
