
public abstract  class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println(customer.getFirstName()+"�simli m��terinin veri taban�na kayd� ger�ekle�mi�tir.");
		
	}

}
