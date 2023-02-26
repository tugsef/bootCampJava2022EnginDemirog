package oop1;

public class Main {

	/*
	 * Java Nesne Yönelimli bir programdır
	 * OOP gerçek hayatın progama uyarlamasıdır...
	 * tanımlıyor ve tamamlıyor 
	 * 
	 **/
	public static void main(String[] args) {
	Product product1 = new Product(); //Bir klas değişkeni oluşturmanın yolu
	product1.setName("Delonghi Kahve Makinası");
	product1.setUnitPrice(7500);
	product1.setDiscount(7);
	product1.setImageUrl("image1.jpg");
	product1.setUnitsInStock(5);
	Product product2 = new Product(); //Bir klas değişkeni oluşturmanın yolu
	product2.setName("Kitchen  Kahve Makinası");
	product2.setUnitPrice(7500);
	product2.setDiscount(3);
	product2.setImageUrl("image2.jpg");
	product2.setUnitsInStock(5);
	
	Product product3 = new Product(); //Bir klas değişkeni oluşturmanın yolu
	product3.setName("Smeg Kahve Makinası");
	product3.setUnitPrice(7500);
	product3.setDiscount(3);
	product3.setImageUrl("image3.jpg");
	product3.setUnitsInStock(5);
		
	Product[] products = {product1,product2,product3};
	System.out.println("<lu>");
	for (Product product : products) {
		System.out.println("<li>"+product.getName()+"<li>");
	}
	System.out.println("<lu>");
	
	IndividualCustomer induCustomer = new IndividualCustomer();
	induCustomer.setId(1);
	induCustomer.setPhone("2626262");
	induCustomer.setCustomerNumber("1452536523");
	induCustomer.setFirstName("Sefa");
	induCustomer.setLastName("Can");
	
	CorporateCustomar corporateCustomar = new CorporateCustomar();
	corporateCustomar.setId(2);
	corporateCustomar.setCompanyName("Kodlama.io");
	corporateCustomar.setPhone("11111111");
	corporateCustomar.setTaxNumber("2632536");
	corporateCustomar.setCustomerNumber("63629266");
	
	Customer[] customar = {induCustomer,corporateCustomar};
	
	
	}

}
