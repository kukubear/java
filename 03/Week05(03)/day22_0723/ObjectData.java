package day22_0723;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectData implements Serializable{
	String name;
	int age;
	float height;
	public ObjectData() {
		this("Noname",0,0.0f);
	}
	public ObjectData(String name, int age, float height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	private void writeObject(ObjectOutputStream stream)throws IOException{
		stream.defaultWriteObject();
		System.out.print("writeObject : ");
	}
	private void readObject(ObjectInputStream stream) throws IOException,ClassNotFoundException{
		stream.defaultReadObject();
		System.out.print("readObject : ");
		
	}
	public String toString() {
		return("name : "+name+", age : "+age+", height : "+height);
	}
}
