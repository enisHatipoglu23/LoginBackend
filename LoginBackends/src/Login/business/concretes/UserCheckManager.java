package Login.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Login.business.abstracts.UserCheckService;
import Login.entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	public static final String regex = "^[\\\\w-_\\\\.+]*[\\\\w-_\\\\.]\\\\@([\\\\w]+\\\\.)+[\\\\w]+[\\\\w]$";
	

	@Override
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(!matcher.matches()) {
			System.out.println("Your email is not compatiple in regex format.");
		}
		
		return false;
	}
	
	
	@Override
	public boolean checkPassword(String password) {

		if(password.length() < 6) {
			System.out.println("Your password must have at least 6 characters.");
		}
		
		return false;
	}
	
	
	@Override
	public boolean checkName(String name) {

		if(name.length() < 2) {
			System.out.println("Your name must have at least 2 characters");
		}
		
		return false;
	}
	
	
	@Override
	public boolean checkLastname(String lastname) {

		if(lastname.length() < 2) {
			System.out.println();
		}
		
		return false;
	}


	@Override
	public boolean checkEmail(User user) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean checkPassword(User user) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean checkName(User user) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean checkLastname(User user) {
		// TODO Auto-generated method stub
		return false;
	}
}
