
public class Main   {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "kimlikten farksız biçimde, adınız", "soyadınız", 1999, "tc kimlik no"));

	}

}
