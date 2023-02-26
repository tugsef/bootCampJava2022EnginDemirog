package staticDemo;
//Bir ürünü kaydederken kurallara uygun mubl
public class ProductValidator {
	static {
		System.out.println("Static Yapıcı Blok Çalıştı...");
	}
	public ProductValidator() {
		System.out.println(	"Yapıcı Blok çalıştı...");
	}
	public static boolean isValid(Product product) {	
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
	public void bisey() {}
	
	
	
	//public static class BaskaBirClass() {//İnner Class
		//public static void Sil();
	//}
}
