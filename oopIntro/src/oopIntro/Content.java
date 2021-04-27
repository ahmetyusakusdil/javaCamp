package oopIntro;

public class Content {

	public Content(){
		System.out.println("Constructor çalýþtý");
	}
	public Content(int id,String image,String title,String description){
		
		this.id=id;
		this.image=image;
		this.title=title;
		this.description=description;
		
	}
	
	
	int id;
	String image;
	String title;
	String description;
}
