import java.util.Date;

import Abstruct.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager =new NeroCustomerManager();
		BaseCustomerManager customerManager2 =new StarbucksCustomerManager(new CustomerCheckManager());
		BaseCustomerManager customerManager3 =new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer =new Customer();
		customer.setFirstName("Engin");
		customer.setLastName("Demirog");
		customer.setId(1);
		customer.setDateOfBirt(new Date(1985,1,6));
		customer.setNationalityId("12378965");
		customerManager.save(customer);
		customerManager2.save(customer);
		customerManager3.save(customer);
		
		
		

	}

}
