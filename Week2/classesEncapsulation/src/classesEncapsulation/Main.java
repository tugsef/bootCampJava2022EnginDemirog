package classesEncapsulation;


public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(115);
		product.setName("Laptop");
		product.setPrice(12500);
		product.setDesciription("Asus Laptop");
		product.setStockAmount(1536);
		
		ProductManager productManager = new ProductManager();
		
		System.out.println(product.getKod());
	}

}
