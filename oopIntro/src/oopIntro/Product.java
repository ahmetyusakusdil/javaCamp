package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben Çalýþtým");
	}
	//Constructor
	// this : bu klasdaki demek 
	public Product(int id,String name,double unitPrice,String detail) {
		this();//Buda Ben çalýþtým ý çalýþtýrýr.
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
		
}
