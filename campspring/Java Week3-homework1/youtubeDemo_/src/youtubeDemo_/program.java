package youtubeDemo_;

public class program {

	public static void main(String[] args) {
		//Class nedir : Yapacağımız işlemler veya bilgileri tutar...
		
		CreditManager creditManager = new CreditManager(); // Örneğini oluşturmak , instance oluşturmak , instance creatin(heap de bir referan oluşturma)
//     <-----------STACK----------> =<------HEAP---------->
		
		
		//creditManager.calculate();
		//creditManager.save();
		
		//SOLID yazılım geliştirme prensipleri...
		//Katlı Mimari ---> ilgili operasyonların,özelliklerin ve fonksiyonların ayrı ayrı tutulması.. 
		//Customer customer = new Customer();
		//customer.id = 1;
		//customer.city = "Ankara";
		
		//CustomerManager customerManager = new CustomerManager(customer);
		//customerManager.save();
		//customerManager.delete();
		
		//Company company = new Company();
		//company.id = 1000;
		//company.taxNumber = "12510";
		//company.companyName = "Arçelik";
		
		//Person person = new Person();
		//person.firstName = "Temel";
		//person.nationalIdentity = "123566";
		//person.id = 1251;
		//person.city = "Ankara";
		//CustomerManager customerManager2 = new CustomerManager(new Person());	
		
		
		
		//Customer c1 = new Customer();
		//Customer c2 = new Person();
		//Customer c3 = new Company();
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
		
	
	}

}
