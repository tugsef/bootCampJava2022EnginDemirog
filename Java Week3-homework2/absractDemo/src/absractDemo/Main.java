package absractDemo;

public class Main {
// Bir müştrinin veri tabanına kaydedilmesi...
	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		//customerManager.databaseManager = new OracleDatabaseManager();
		//customerManager.databaseManager = new SqlSeverDatabaseManeger();
		customerManager.databaseManager = new MysqlDatabaseManager();//Yenilik geldi ama mevcut kodları değiştirmedi
		customerManager.getCustomer();
	}

}
