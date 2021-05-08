package eticaretLogin.business.abstracts;

import eticaretLogin.entities.concretes.LoginDto;
import eticaretLogin.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(LoginDto loginDto);
	void verify(User user);
	void userExists(String email);
	boolean userValidate(User user);
	
	
}
