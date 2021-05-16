package Login.business.abstracts;

public interface GoogleAccountService {
	
	boolean googleVerification(String email, String password);
	
}
