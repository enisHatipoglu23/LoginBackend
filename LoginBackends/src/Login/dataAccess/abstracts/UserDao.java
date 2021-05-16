package Login.dataAccess.abstracts;

import java.util.List;

import Login.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	
	void logIn(User user);
	
	boolean logOut(User user);
	
	User get(int id);
	
	List<User> getAll();
	
}
