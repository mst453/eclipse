package Abstruct;

import Entities.Customer;
//abstruct yaptýk CustomerService implement ettik
public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {

		System.out.println("save to db: "+customer.getFirstName());
		
	}

}
