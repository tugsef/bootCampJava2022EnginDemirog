package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product= new Product();
		product.id = 1002;
		product.name = "Mouse";
		product.price = 250;
		
		manager.add(product);
		
		DatabaseHelper.Conection.createConnection();

	}

}
