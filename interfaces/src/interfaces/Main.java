package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new SmsLogger() , new DatabaseLogger(), new FileLogger() ,new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer engin = new Customer(1,"Engin","Demiro�");
		
		customerManager.add(engin);
	}

}
