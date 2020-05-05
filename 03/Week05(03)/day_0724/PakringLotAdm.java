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
	private HashSet<Car> cars = new HashSet<>(); // 중복안됨
	private ArrayList<Car> outCars = new ArrayList<>();// 중복해도 상관없음?!
	private Queue<Car> waitCars ;// 중복안됨

	PakringLotAdm(Date startDt, Date endDt, int maxCarsu) {
		
		this.startDt = startDt;
		this.endDt = endDt;
		this.maxCarsu=maxCarsu;
	}

	// 주차하는 차 추가
	//
	public void addCar(Car car)  {
		
		cars.add(car);

		
		// 주차장이 꽉찼을 때 대기차량을 대기리스트로 저장한다.
		if (cars.size() > maxCarsu) {
			waitCars = new LinkedList<>();
			waitCars.offer(car);
		}
		
	}

	// 나가는 차 제거하면 outCars에 추가하고 주차비용을 리턴
	// 30분당 500원
	// 주차 대기중인 차가 있으면 주차시킨다 (주차 대기중인 차는 대기 순서에 따라 주차)
	public int outCar(Car car) {

		cars.remove(car);
		// car의 입차시간을 LocalDateTime으로 변경
		LocalDateTime inTime = LocalDateTime.ofInstant(car.getInDt().toInstant(), ZoneId.systemDefault());
		LocalDateTime outTime = LocalDateTime.now();// 출차시간은 지금 현재시간을 받아서 사용

		// duration으로 시간차이 계산 ->음수발생가능하기 때문에 절대값처리 혹은 순서고려하여 객체 대입
		Duration duration = Duration.between(outTime, inTime);

		// 시간차이를 duration으로 계산한것을 long type 분으로 환산하는 메소드 사용
		// ->long type받을 변수 필요해서 새로운 변수 선언
		long minutes = duration.toMinutes();

		int totalfee = 0;
		// 30분으로 나누고 fee계산
		totalfee = (int) (minutes / 30 * 500);

		// 주차 대기중인 차를 주차시키기 -> 불확실 Test 필요
		// queue가 비어있고 주차공간이 비어있다면 대기리스트의 차를 주차공간에 추가한다.
		while (!waitCars.isEmpty() && cars.size() < maxCarsu) {
			cars.add((Car) waitCars);
		}

		/*
		 * Date class 이용하는 식 Date inTime = car.getInDt(); Date outTime = new Date();
		 * 
		 * //분단위로 시간을 계산 long minute = getDateDiff(inTime, outTime, TimeUnit.MINUTES);
		 * System.out.println("시간차 확인 : " + minute);
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

	// 시간계산하는 메소드
	/*
	 * public static long getDateDiff(Date inTime, Date outTime, TimeUnit minutes) {
	 * long diffInMills = outTime.getTime() - inTime.getTime();
	 * 
	 * return minutes.convert(diffInMills, TimeUnit.MILLISECONDS); }
	 */
	// 파라미터로 전달한 정렬기준에 따라 주차차량을 Sort한다.
	public void carSort(Comparator c) {

	}

	// Compartor 재정의
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

	// 속성에 대한 get/set
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
