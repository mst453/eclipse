package Concrete;

import Abstruct.BaseCustomerManager;
import Abstruct.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("save to db: "+customer.getFirstName());
		}
		else {
			System.out.println("kaydetme baþarýsýz : geçersiz kullanýcý");
		}
		

		
		
	}
	
	

}
