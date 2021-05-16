package Login.business.concretes;

import Login.business.abstracts.LoginService;
import Login.dataAccess.abstracts.UserDao;
import Login.entities.concretes.User;

public class LoginManager implements LoginService{
	
	
	private UserDao userDao;
	
	
	
	
	public LoginManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public boolean login(String email, String password) {
		
		for(User userLogin : userDao.getAll()) {
			if(email == userLogin.getEmail() && password == userLogin.getPassword()) {
				if(userLogin.isAccountVerify()) {
					System.out.println("Logined successfully.");
					return true;
				}
			}
				
		}
		System.out.println("There aren't that email of user in our system.");
		
		return false;
		
	}
}
