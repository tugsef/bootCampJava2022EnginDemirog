package polymorphismDemo;

public class ConsoleLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logger to Console : " + message);
	}
}
