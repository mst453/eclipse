package gameHomeWork;

public class CustomerManager implements CustomerService{

	private CheckRealPerson checkRealPerson;

	public CustomerManager(CheckRealPerson checkRealPerson) {
		this.checkRealPerson = checkRealPerson;
	}

	@Override
	public void add(Customer customer) {
		if (checkRealPerson.ifRealPerson(customer)) {
			System.out.println("kullan�c� eklendi: "+customer.getNickName());
		}else {
			System.out.println("kullan�c� ge�ersiz");
		}
		
		
	}

	@Override
	public void edit(Customer customer) {
		System.out.println("kullan�c� d�zenlendi: "+customer.getNickName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("kullan�c� silindi: "+customer.getNickName());
		
	}

	

}
