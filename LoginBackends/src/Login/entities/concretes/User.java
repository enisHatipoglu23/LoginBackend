package Login.entities.concretes;

import Login.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String name;
	private String lastname;
	private String email;
	private String password;
	private boolean accountVerify;
	
	
	public User() {
		
	}


	public User(int id, String name, String lastname, String email, String password, boolean accountVerify) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.accountVerify = accountVerify;
	}

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


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


	public boolean isAccountVerify() {
		return accountVerify;
	}


	public void setAccountVerify(boolean accountVerify) {
		this.accountVerify = accountVerify;
	}
	
	
}
