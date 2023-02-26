package classesWithAttributes;

public class Product {

	
	public Product(int id , String name , String description , double price , int stockAmount , String renk ) {
		System.out.println(	"Yapıcı Blok Çalıştı...");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
	}
	public Product() {
		
		
	}
		private int id;
		private String name;
		private String description;
		private double price;
		private int stockAmount;
		private String renk;
		private String kod;
		
		//getter
		public int getId() {
			//Bu satırda iş ihtiyaçlarıma göre cod yazabiliriz...
			//Sadece read only getter okunabilir olarak yazılabirlir yada setter da yazılabilir write only yazılabilir.
			return id;
		}
		//setter
		public void setId(int id) {
			// _ kullanmazsak this kullanabiliriz this bu klas demek bulunduğu klasın  id si
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getStockAmount() {
			return stockAmount;
		}
		public void setStockAmount(int stockAmount) {
			this.stockAmount = stockAmount;
		}
		public String getRenk() {
			return renk;
		}
		public void setRenk(String renk) {
			this.renk = renk;
		}
		public String getKod() {
			return this.name.substring(0,1)+id;
		}
		
}