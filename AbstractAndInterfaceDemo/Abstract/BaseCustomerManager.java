
public abstract  class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println(customer.getFirstName()+"Ýsimli müþterinin veri tabanýna kaydý gerçekleþmiþtir.");
		
	}

}
