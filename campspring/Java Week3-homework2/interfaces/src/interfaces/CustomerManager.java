package interfaces;

public class CustomerManager {
	//iş kodları
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal){
		this.customerDal = customerDal;
		
	}
	
	
	public void add(){
		customerDal.add();
	}
}
