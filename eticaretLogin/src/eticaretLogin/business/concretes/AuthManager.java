package eticaretLogin.business.concretes;

import eticaretLogin.business.abstracts.AuthService;
import eticaretLogin.entities.concretes.LoginDto;
import eticaretLogin.entities.concretes.User;

public class AuthManager implements AuthService {

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(LoginDto loginDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verify(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userExists(String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean userValidate(User user) {
		if(user.getFirstName()!=null && (user.getFirstName().length()>2 && user.getLasrName().length()>2)) {
			return true;
		}
		return false;
	}

}
