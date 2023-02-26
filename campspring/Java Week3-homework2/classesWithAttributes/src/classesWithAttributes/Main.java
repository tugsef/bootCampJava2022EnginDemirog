package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(21566 , "Araba" , "Mazotlu" , 150555 , 150 ,"Beyaz");
		product.setId(21566);
		product.setName("Araba");
		product.setDescription("Mazotlu");
		product.setPrice(150555);
		product.setStockAmount(150);
		product.setRenk("Beyaz");
		

		System.out.println(product.getKod());
	
	}

}
