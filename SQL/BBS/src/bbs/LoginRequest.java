package bbs;

import java.util.Map;

import model.Bean;

public class LoginRequest {
	private String id;
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;	
	}
	
	public boolean isCorrectPW() {
		boolean correctPw = false;
		Bean bean = new Bean();
		if (password != null && password.equals(bean.getPassword())) 
			correctPw =true;
		
		return correctPw;
	}
	
	public boolean isCorrectID() {
		boolean correctId = false;
		Bean bean = new Bean();
		if (id != null && id.equals(bean.getId())) 
			correctId =true;
		return correctId;
	}

	public void validate(Map<String, Boolean> errors) {
		checkEmpty(errors, id, "id");
		checkEmpty(errors, password, "password");
		
		if (!errors.containsKey("id")) {
			if (!isCorrectID()) {
				errors.put("notMatch", Boolean.TRUE);
			}
		}
	
		if (!errors.containsKey("password")) {
			if (!isCorrectPW()) {
				errors.put("notMatch", Boolean.TRUE);
			}
		}
	}

	private void checkEmpty(Map<String, Boolean> errors, 
			String value, String fieldName) {
		if (value == null || value.isEmpty())
			errors.put(fieldName, Boolean.TRUE);
	}

	
	
}
