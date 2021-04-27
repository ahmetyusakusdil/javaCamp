package oopIntro;

public class Course {
	
	public Course(int id,int completionRate, String courseName, String courseInstructor, String courseImage, String instructorImage) {
		
		this.id=id;
		this.completionRate=completionRate;
		this.courseImage=courseImage;
		this.courseName=courseName;
		this.courseInstructor=courseInstructor;
		this.instructorImage=instructorImage;
	}
	
	int id;
	int completionRate;
	String courseName;
	String courseInstructor;
	String courseImage;
	String  instructorImage;
	
}
