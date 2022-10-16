package inheritance;

public class Main {

	public static void main(String[] args) {
Customer customer = new Customer();
Employee employee = new Employee();
 	
	employee.salary = 1548;
	customer.emaial = "sefa.demşrtas92@gmail.com";
	
	EmploeeManager emploeeManager = new EmploeeManager();
	CustomerManager customerManager =new CustomerManager();
	
	emploeeManager.bestEmploee();
	

	
	}

}
