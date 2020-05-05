package day14_0711;

import java.util.ArrayList;
import java.util.List;
//prototype∆–≈œ : 
public class Users implements Cloneable{
	private List<String> userList;
	public Users() {
		userList = new ArrayList();
	}
	
	public Users(List list) {
		this.userList=list;
	}
	public void loadData() {
		userList.add("1");
		userList.add("2");
		userList.add("3");
	}
	
	public void print() {
		System.out.println(userList);
	}
	
	public List<String> getUserList(){
		return userList;
	}
	
	public Object clone() throws CloneNotSupportedException{
		List<String>temp = new ArrayList();
		
		for(String s:this.getUserList()) {
			temp.add(s);
		}
		return new Users(temp);
	}
	
	public static void main(String[] args) throws Exception {
		Users orginUsers = new Users();
		orginUsers.loadData();
		Users cloneUsers = (Users)orginUsers.clone();
		cloneUsers.print();
		//
	}
}
