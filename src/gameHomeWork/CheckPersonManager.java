package gameHomeWork;

public class CheckPersonManager implements CheckRealPerson {

	@Override
	public boolean ifRealPerson(Customer customer) {
		System.out.println("kullan�c� dogruland�.");
		return true;
	}

}
