package eticaretLogin.business.abstracts;


import eticaretLogin.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(int id);
	
	
	

}
