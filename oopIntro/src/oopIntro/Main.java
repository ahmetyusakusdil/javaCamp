package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"lenovo",1500,"15 GB RAM",10); //�rnek Olu�turma , intance olu�turma , referance olu�turma
		

		Product product2 = new Product(); //�rnek Olu�turma , intance olu�turma , referance olu�turma
		product2.setId(2);
		product2.setName("lenov� v15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		
		System.out.println(category1.getName());
		
	
//		Product product3 = new Product(); //�rnek Olu�turma , intance olu�turma , referance olu�turma
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
//		category2.name="Ev/Bah�e";
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
//	    Content content1 = new Content(1," resim.jpg"," iki ekranda takip etmeye �al���n"," Bu ekranlardan birinde beni izlerken di�erinde kod yaz�p ..");
//	    
//	    Content content2 = new Content(2, " resim1.jpg", " �kinci ekran yoksa", " Bu durumda bilgisayar ekran�n�z� ikiye b�lebilirsiniz."); 
//	    
//	    
//	    Content[] contents = {content1,content2};
//	    System.out.println("  CONTENT  L�STELEME		");
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
//		Course course1 = new Course(1,100," Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR) "," Engin Demiro� "," course1.jpg "," engin.jpg");
//		Course course2 = new Course(2,0,"  Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT) "," Engin Demiro� "," course2.jpg "," engin.jpg");
//		
//		System.out.println( " COURSE  L�STELEME	");
//		Course[] courses = {course1,course2};
//		
//		for (Course course : courses) {
//			System.out.println("Kursun Resmi : " + course.courseImage);
//			System.out.println("Kursun Ad� : " + course.courseName);
//			System.out.println("E�itimci : " + course.courseInstructor);
//			System.out.println("Tamamlanma oran� : " + course.completionRate);
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
