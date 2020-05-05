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

	// ���� �ڵ��� �߰�
	// carNo�� key�� HashMap�� �߰�
	// HashMap���� Key�� String, Value���� Car class�� �߰������ϴ�
	// ������ �ڵ����� �߰��� �� ����
	public void addCar(Car car) {
		car = new Car(car.getCarNo(), car.getCarNo(), car.getVolume());
		cars.put(car.getCarNo(), car);

	}

	// �����ϰ� �ִ� Car�� ����Ѵ�
	// carNo/type/volume�� ����Ѵ�
	public void printCars() {
		Set set = cars.entrySet();
		Iterator it = set.iterator();

		System.out.println("----------�� ���----------");
		if (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next(); // -> ???? ����

			System.out.println("�� ��ȣ : " + e.getKey() + "/" + e.getValue());

		}

	}

	// ����̷� �߰� �� Array size�� �Ѿ ��� Array size�� 2��� �÷��� �߰��Ѵ�
	// ����̷� �߰� �� Car�� Driver�� �����ϰ� �ִ� Car�� �߰����� �ϴ�
	public ArrayList<Accident> addAccident(Accident[] history) {
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd"); SimpleDateFormat
		 * sdf1 = new SimpleDateFormat("yyyy-mm-dd");
		 */

		
		// �迭�� ArrayList�� �ٲ� �迭�� ���̸� �Ű� �Ⱦ����� ����
		for (int i = 0; i < history.length; i++) {
			if(history[i]==null) {break;}
			
				ArrayList<Accident> accident = new ArrayList<>(Arrays.asList(history));
				accident.add(history[i]);

			}
		return accident;
		}
		
	
	

	// ����̷����
	public void printAccident() {
		//ArrayList���� �迭��� ����ϱ� �ϼ��ؾ� ��x
		System.out.println("=======��� ���=======");
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
