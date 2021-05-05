package gameHomeWork;

public class CustomerManager implements CustomerService{

	private CheckRealPerson checkRealPerson;

	public CustomerManager(CheckRealPerson checkRealPerson) {
		this.checkRealPerson = checkRealPerson;
	}

	@Override
	public void add(Customer customer) {
		if (checkRealPerson.ifRealPerson(customer)) {
			System.out.println("kullanýcý eklendi: "+customer.getNickName());
		}else {
			System.out.println("kullanýcý geçersiz");
		}
		
		
	}

	@Override
	public void edit(Customer customer) {
		System.out.println("kullanýcý düzenlendi: "+customer.getNickName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("kullanýcý silindi: "+customer.getNickName());
		
	}

	

}
