package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logger to database : " + message);
	}
	
}
