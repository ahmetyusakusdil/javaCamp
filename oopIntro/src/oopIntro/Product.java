package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	//Constructor
	// this : bu klasdaki demek 
	public Product(int id,String name,double unitPrice,String detail) {
		this();//Buda Ben �al��t�m � �al��t�r�r.
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
