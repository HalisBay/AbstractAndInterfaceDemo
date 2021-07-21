
public class Main   {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "kimlikten farksýz biçimde, adýnýz", "soyadýnýz", 1999, "tc kimlik no"));

	}

}
