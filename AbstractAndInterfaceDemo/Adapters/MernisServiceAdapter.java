import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy clientProxy = new KPSPublicSoapProxy();
		
		boolean result = true;
		try {
			result = clientProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return result;
	}

}
