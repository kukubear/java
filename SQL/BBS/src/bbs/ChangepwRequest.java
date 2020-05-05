package bbs;

import java.util.Map;

public class ChangepwRequest {
	private String password;
	private String changepw;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getChangepw() {
		return changepw;
	}
	public void setChangepw(String changepw) {
		this.changepw = changepw;
	}
	
	public boolean isNotDuplicated() {
		
		return password != null && password != changepw;
	}

	public void validate(Map<String, Boolean> errors) {
		
		checkEmpty(errors, password, "password");
		checkEmpty(errors, changepw, "changepw");
		if (!errors.containsKey("changepw")) {
			if (!isNotDuplicated()) {
				errors.put("Match", Boolean.TRUE);
			}
		}
	}

	private void checkEmpty(Map<String, Boolean> errors, 
			String value, String fieldName) {
		if (value == null || value.isEmpty())
			errors.put(fieldName, Boolean.TRUE);
	}
	
}
