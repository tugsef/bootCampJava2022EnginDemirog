package interfaces;

import java.awt.geom.CubicCurve2D;

public class Main {
	public static void main(String[] args) {
		//ICustomerDal iCustomerDal = new MySqlCustomerDal();
		 //iCustomerDal.add();
		
		CustomerManager customerManager =new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
		
		CustomerManager customerManager2 = new CustomerManager(new SqlServerCustomerDal());
		customerManager2.add();
		
		
	}
}
