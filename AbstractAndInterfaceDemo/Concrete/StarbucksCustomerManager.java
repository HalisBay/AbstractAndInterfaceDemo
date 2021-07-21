
public class StarbucksCustomerManager extends BaseCustomerManager  {
	 CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		
		if (this.customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("B�yle bir ki�i bulunamad�.");
		}
		
		
		
	}
	
	
}