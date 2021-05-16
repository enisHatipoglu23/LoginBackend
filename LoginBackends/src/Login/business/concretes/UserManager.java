package Login.business.concretes;

import Login.business.abstracts.GoogleAccountService;
import Login.business.abstracts.LoginService;
import Login.business.abstracts.UserCheckService;
import Login.business.abstracts.UserService;
import Login.dataAccess.abstracts.UserDao;
import Login.dataAccess.concretes.HibernateUserDao;
import Login.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private UserCheckService userCheckService;
	private LoginService loginService;
	private GoogleAccountService googleAccountService;
	
	 
	
	
	public UserManager(HibernateUserDao hibernateUserDao, UserCheckManager userCheckManager, LoginManager loginManager,
			GoogleAccountService googleAccountService2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(User user) {
		if(userDao.getAll() == null) {
			for(User userr : userDao.getAll()) {
				if(user.getEmail() == userr.getEmail()) {
					System.out.println("E-mail that you trying to use is used before. Please choose another e-mail. ");
					return;
				}
			}
		}
		if(userCheckService.checkEmail(user)) {
			System.out.println("E-mail has confirmed. ");
		}
		if(userCheckService.checkPassword(user)) {
			System.out.println("Password is right to the rules. ");

		}
		if(userCheckService.checkName(user)) {
			System.out.println("Name is right to the rules. ");
		}
	}

	@Override
	public void login(String email, String password) {
		loginService.login(email, password);
	}

	@Override
	public void verification(User user) {
		googleAccountService.googleVerification(null, null);
	}

	@Override
	public void googleVerification(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}
