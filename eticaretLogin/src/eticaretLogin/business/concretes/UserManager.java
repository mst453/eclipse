package eticaretLogin.business.concretes;

import eticaretLogin.business.abstracts.AuthService;
import eticaretLogin.business.abstracts.UserService;
import eticaretLogin.core.utils.utils;
import eticaretLogin.dataAccess.abstracts.UserDao;
import eticaretLogin.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private AuthService authService;
	

	public UserManager(UserDao userDao,AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService=authService;
	}

	@Override
	public void add(User user) {
		
		if (utils.emailValidate(user.getEmail()) && authService.userValidate(user) ) {
			System.out.println("business katman� add �al�st�");
			userDao.add(user);
		}else {
			System.out.println("hatal� bilgi girdinizs");
		}
		
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
