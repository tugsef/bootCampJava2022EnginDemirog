package kodlamaioWithNLayeredApp.entities;

public class Course extends BaseEntities{
	
	private String courseName;
	private double coursePrice;
	
	public Course(int id, String courseName, double coursePrice) {
		super(id);
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
}
