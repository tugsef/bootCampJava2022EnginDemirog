package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	Product product = new Product();
	product.id = 115;
	product.name = "Laptop";
	product.price = 12500;
	product.description = "Asus Laptop";
	product.stockAmount = 1536;
	System.out.println(product.id+" = Ürün Numarası\n"
			+product.name+" = Ürün Adı\n"
			+product.description+" = Ürün Açıklaması\n"
			+product.price+" = Ürün Fiyatı\n"
			+product.stockAmount+" = Stok Miktarı");
	System.out.println("-----------------------------------------------------------");
	ProductManager productManager = new ProductManager();
	productManager.Add(product);
	}
	

}
