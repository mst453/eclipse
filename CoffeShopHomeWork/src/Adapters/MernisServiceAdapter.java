package Adapters;

import Abstruct.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{
// try catch istiyooo 
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		 
		try {
			return soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirt().getYear());
			
		} catch (Exception e) {
			System.out.println(" geçersiz kullanýcý");
			return false;
		}
		
	}
	
	

}
