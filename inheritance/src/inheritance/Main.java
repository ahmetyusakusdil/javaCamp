package inheritance;

public class Main {

	public static void main(String[] args) {
		// Miras 
	
		IndividualCustomer engin = new IndividualCustomer();
		
		engin.CustomerNumber="15610";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.CustomerNumber="168";
		SendikaCustomer abc = new SendikaCustomer();
		abc.CustomerNumber="99";
		
		CustomerManager customerManager = new CustomerManager();
	
		Customer[] customers = {engin,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
		

	}

}
