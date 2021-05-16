package Login;

import Login.business.abstracts.GoogleAccountService;
import Login.business.abstracts.UserService;
import Login.business.concretes.LoginManager;
import Login.business.concretes.UserCheckManager;
import Login.business.concretes.UserManager;
import Login.dataAccess.concretes.HibernateUserDao;
import Login.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user=new User();
		user.setId(1);
		user.setName("enis");
		user.setEmail("enis@gml.co");
		user.setLastname("htpglu");
		user.setPassword("22345678");


		
		UserService userService= new UserManager(new HibernateUserDao(),new UserCheckManager(),
				new LoginManager(new HibernateUserDao()),new GoogleAccountService() 
						{
						

							@Override
							public boolean googleVerification(String email, String password) {
								// TODO Auto-generated method stub
								return false;
							}					
						}
						
				);
		userService.register(user);		
		System.out.println("Login");
		userService.login("enis@gml.co", "22345678");
		System.out.println("Google account");
		userService.googleVerification("enis@gml.co", "22345678");
		
		
	}

}
