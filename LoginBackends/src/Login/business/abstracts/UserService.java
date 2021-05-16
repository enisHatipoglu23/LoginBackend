package Login.business.abstracts;

import Login.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email, String password);
	void verification(User user);
	void googleVerification(String string, String string2);
}
