package hw0718_02;

import java.sql.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Dog {
	private String name;
	private int age;
	private String kind;//품종
	private HashSet Handler;
	private HashMap family;
	
	//Dog 생성자
	Dog(String name, int age, String kind){
		this.name=name;
		this.age=age;
		this.kind=kind;
	}
	
	//예방접종을 하다
	//inoculate 속셍에 이름과 날짜에 해당하는 예방접종 정보 저장
	//동일한 예방접종 하면 안됨
	//품종별 예방접종 가능 기간이 아니면 오류 발상 ->예방 접종 가능기간이 아님 
	public void shotInoculate(String name, Date date) {
		
	}
	
	//예방접종 이력을 날짜별 정렬하여 출력
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//Dog 속성에 관한 getter&setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public HashSet getHandler() {
		return Handler;
	}

	public void setHandler(HashSet handler) {
		Handler = handler;
	}

	public HashMap getFamily() {
		return family;
	}

	public void setFamily(HashMap family) {
		this.family = family;
	}
	
	
	
}
