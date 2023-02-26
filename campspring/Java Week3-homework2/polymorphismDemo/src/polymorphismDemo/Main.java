package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
// polymorphism-->çok biçimcilik
// referance tiplerin birbirinin referansını turmasıyla olşan durumdur tabii aralarında inheritance varsa birbirine benzemsi üstlerininaynı olmasıgerekşyor
		//EmailLogger logger = new EmailLogger();
		//logger.log("Emaile Log Mesajı");
		//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
		
		//for(BaseLogger logger:loggers) {
			//logger.log("Log Mesajı : ");
		//}
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
	}

}
