package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"lenovo",1500,"15 GB RAM",10); //Örnek Oluþturma , intance oluþturma , referance oluþturma
		

		Product product2 = new Product(); //Örnek Oluþturma , intance oluþturma , referance oluþturma
		product2.setId(2);
		product2.setName("lenový v15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		
		System.out.println(category1.getName());
		
	
//		Product product3 = new Product(); //Örnek Oluþturma , intance oluþturma , referance oluþturma
//	
//		
//		
//		Product[] products = {product1,product2,product3};
//		for (Product product : products) {
//			System.out.println(product.name);
//		}
//		
//		
//		Category category1 = new Category();
//		category1.id=1;
//		category1.name="Bilgisayar";
//		
//		Category category2 = new Category();
//		category2.id=2;
//		category2.name="Ev/Bahçe";
//		
//		
//		ProductManager productManager = new ProductManager();
//		productManager.addToCart(product1);
//		
//		productManager.addToCart(product2);
//		productManager.addToCart(product3);
//		
//		
//		
//		
//	    Content content1 = new Content(1," resim.jpg"," iki ekranda takip etmeye çalýþýn"," Bu ekranlardan birinde beni izlerken diðerinde kod yazýp ..");
//	    
//	    Content content2 = new Content(2, " resim1.jpg", " Ýkinci ekran yoksa", " Bu durumda bilgisayar ekranýnýzý ikiye bölebilirsiniz."); 
//	    
//	    
//	    Content[] contents = {content1,content2};
//	    System.out.println("  CONTENT  LÝSTELEME		");
//		for (Content content : contents) {
//			System.out.println(content.image +"    "+ content.title+"      "+content.description);
//			System.out.println(" ");
//			System.out.println(" ");
//		}
//		
//		
//		System.out.println(" CONTENT MANAGER ");
//		ContentManager contentManager = new ContentManager();
//		contentManager.add(content1);
//		contentManager.add(content2);
//		
//		contentManager.delete(content1);
//		contentManager.delete(content2);
//		
//		contentManager.update(content1);
//		contentManager.update(content2);
//		
//		
//		Course course1 = new Course(1,100," Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR) "," Engin Demiroð "," course1.jpg "," engin.jpg");
//		Course course2 = new Course(2,0,"  Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT) "," Engin Demiroð "," course2.jpg "," engin.jpg");
//		
//		System.out.println( " COURSE  LÝSTELEME	");
//		Course[] courses = {course1,course2};
//		
//		for (Course course : courses) {
//			System.out.println("Kursun Resmi : " + course.courseImage);
//			System.out.println("Kursun Adý : " + course.courseName);
//			System.out.println("Eðitimci : " + course.courseInstructor);
//			System.out.println("Tamamlanma oraný : " + course.completionRate);
//			System.out.println("");
//		}
//		
//		
//		
//		System.out.println(" COURSE MANAGER ");
//		
//		CourseManager courseManager = new CourseManager();
//		System.out.println(" ADD METHOD ");
//		courseManager.addCourse(course1);
//		courseManager.addCourse(course2);
//		System.out.println(" DELETE METHOD ");
//		courseManager.deleteCourse(course1);
//		courseManager.deleteCourse(course2);
//		System.out.println(" UPDATE METHOD ");
//		courseManager.updateCourse(course1);
//		courseManager.updateCourse(course2);
//		
//		
	}

}
