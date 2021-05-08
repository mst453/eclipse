package eticaretLogin.dataAccess.concretes;

import java.util.List;

import eticaretLogin.dataAccess.abstracts.UserDao;
import eticaretLogin.entities.concretes.User;

public class MemoryUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("kullanýc eklenmiþtir"+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
