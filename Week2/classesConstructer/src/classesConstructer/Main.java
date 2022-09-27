package classesConstructer;


public class Main {

	public static void main(String[] args) {
		Product product = new Product(1 , "Laptop" , "Asus Laptop" , 2500 , 10 ,  "Kırmızı" , "L253" );
		product.setId(115);
		product.setName("Laptop");
		product.setPrice(12500);
		product.setDesciription("Asus Laptop");
		product.setStockAmount(1536);
		
		Product product1 = new Product();
		System.out.println(product1.getKod());
	}

}
