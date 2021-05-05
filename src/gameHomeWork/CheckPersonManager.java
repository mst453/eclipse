package gameHomeWork;

public class CheckPersonManager implements CheckRealPerson {

	@Override
	public boolean ifRealPerson(Customer customer) {
		System.out.println("kullanýcý dogrulandý.");
		return true;
	}

}
