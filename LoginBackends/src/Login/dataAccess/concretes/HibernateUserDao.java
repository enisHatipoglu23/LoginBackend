package Login.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Login.dataAccess.abstracts.UserDao;
import Login.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {
		System.out.println("Registration is successfully. & User has been defined on DataBase. " + user.getName() + " " + user.getLastname());

	}

	@Override
	public void logIn(User user) {
		System.out.println("User has been loged in. & Login has been defined on DataBase. " + user.getName() + " " + user.getLastname());

	}

	@Override
	public boolean logOut(User user) {
		System.out.println("User has been loged out. & Login has been defined on DataBase. " + user.getName() + " " + user.getLastname());
		return false;
	}
	
	
	public List<User> users = new ArrayList<User>();
	@Override
	public User get(int Id) {
		
		for(User user : users) {
			if(user.getId() == Id)
				return user;
		}
		
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		User user1 = new User(1, "Enis", "Hatipoðlu", "enis@gmail.com", "123456789", true);
		users.add(user1);
		User user2 = new User(2, "Yamur", "Hasavcý", "yamur13@gmail.com", "123456789", true);
		users.add(user2);
		
		return users;
	}

}
