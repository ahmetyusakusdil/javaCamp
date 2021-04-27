package oopIntro;

public class CourseManager {

	public void addCourse(Course course) {
		
	System.out.println(course.courseName + " Kursu Eklendi." + " " + course.courseImage + " " + course.courseName + " " + course.courseInstructor +" "
	                   + course.instructorImage+" " + course.completionRate );

		
	System.out.println(" ");
	}
	
	public void deleteCourse(Course course) {
		
		System.out.println(course.courseName + " Kursu Silindi.");
		System.out.println("");
	}
	
	public void updateCourse(Course course) {
		
		System.out.println(course.courseName + " Kursu Güncellendi.");
		System.out.println("");
	}
	
}
