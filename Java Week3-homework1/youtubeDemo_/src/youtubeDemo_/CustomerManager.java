package youtubeDemo_;

public class CustomerManager {

	private Customer _customer;
	private ICreditManager _ICreditManager;
	
	
	
	public CustomerManager(Customer customer , ICreditManager creditManager) {
		_customer = customer;
		_ICreditManager = creditManager;
	
		
	}
	
	public void save() {
		System.out.println("Müşteri Kaydedildi...");
	}
	
	public void delete() {
		System.out.println("Müşteri Silindi...");
	}
	public void GiveCredit() {
		
		_ICreditManager.Calculate();
		System.out.println("Kredi Verildi..");
	}
	
}
