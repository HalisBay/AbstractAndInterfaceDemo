
public class Main   {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "kimlikten farks�z bi�imde, ad�n�z", "soyad�n�z", 1999, "tc kimlik no"));

	}

}
