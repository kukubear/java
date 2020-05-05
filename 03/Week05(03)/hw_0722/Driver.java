package hw_0722;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Driver {
	private String name;
	private int licenceNo;
	private HashMap<String, Car> cars = new HashMap<String, Car>();
	private ArrayList accident = new ArrayList();
	private Accident[] history = new Accident[3];
	private int count;

	Driver(String name, int licenceNo) {
		this.name = name;
		this.licenceNo = licenceNo;
	}

	Driver(String name, int licenceNo, Accident[] history) {
		this(name, licenceNo);
		this.history = history;
	}

	Driver(String name, int licenceNo, HashMap<String, Car> cars) {
		this(name, licenceNo);
		this.cars = cars;
	}

	// 소유 자동차 추가
	// carNo를 key로 HashMap에 추가
	// HashMap에는 Key는 String, Value에는 Car class만 추가가능하다
	// 동일한 자동차를 추가할 수 없다
	public void addCar(Car car) {
		car = new Car(car.getCarNo(), car.getCarNo(), car.getVolume());
		cars.put(car.getCarNo(), car);

	}

	// 소유하고 있는 Car를 출력한다
	// carNo/type/volume를 출력한다
	public void printCars() {
		Set set = cars.entrySet();
		Iterator it = set.iterator();

		System.out.println("----------차 목록----------");
		if (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next(); // -> ???? 질문

			System.out.println("차 번호 : " + e.getKey() + "/" + e.getValue());

		}

	}

	// 사고이력 추가 시 Array size를 넘어설 경우 Array size를 2배로 늘려서 추가한다
	// 사고이력 추가 시 Car는 Driver가 소유하고 있는 Car만 추가가능 하다
	public ArrayList<Accident> addAccident(Accident[] history) {
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd"); SimpleDateFormat
		 * sdf1 = new SimpleDateFormat("yyyy-mm-dd");
		 */

		
		// 배열을 ArrayList로 바꿔 배열의 길이를 신경 안쓰도록 변경
		for (int i = 0; i < history.length; i++) {
			if(history[i]==null) {break;}
			
				ArrayList<Accident> accident = new ArrayList<>(Arrays.asList(history));
				accident.add(history[i]);

			}
		return accident;
		}
		
	
	

	// 사고이력출력
	public void printAccident() {
		//ArrayList안의 배열요소 출력하기 완성해야 함x
		System.out.println("=======사고 목록=======");
		for (int i = 0; i < accident.size(); i++) {
			if (accident != null) {break;}
			
				
				System.out.println(accident);
			}
		}
	

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(int licenceNo) {
		this.licenceNo = licenceNo;
	}

	public HashMap getCars() {
		return cars;
	}

	public void setCars(HashMap cars) {
		this.cars = cars;
	}

	public Accident[] getHistory() {
		return history;
	}

	public void setHistory(Accident[] history) {
		this.history = history;
	}

}
