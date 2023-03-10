package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user {
	
	@Id
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public user(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "user [email=" + email + ", password=" + password + "]";
	}
	

}

