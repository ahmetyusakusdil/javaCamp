package oopIntro;

public class ContentManager {

	public void add(Content content) {
		
		System.out.println(content.title + " Baþlýklý Ýçerik eklendi");
		System.out.println("");
	}
	
	public void delete(Content content) {
		
		System.out.println(content.title + " Baþlýklý içerik silindi");
		System.out.println("");
	}
	
	public void update(Content content) {
		
	   System.out.println(content.title + " Baþlýklý Ýçerik güncellendi");
	   System.out.println("");
	}
	
	
	
	
}
