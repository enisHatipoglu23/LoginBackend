package Login.business.abstracts;

import Login.entities.concretes.User;

public interface UserCheckService {

	boolean checkEmail(User user);
	boolean checkPassword(User user);
	boolean checkName(User user);
	boolean checkLastname(User user);
	boolean checkPassword(String password);
	boolean checkName(String name);
	boolean checkLastname(String lastname);
	boolean checkEmail(String email);
	
}
