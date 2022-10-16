package youtubeDemo_;

public class Customer {

	
	int id;
	String city;
	// Constraclar classın imi ile yazılır..
	
	public Customer() {
		System.out.println("Müşteri Nesnesi Başlatıldı...");
	}
	
	public Customer(int id, String firstName, String lastName, String nationalIdentity, String city) {
		super();
		this.id = id;
	
	
		this.city = city;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
