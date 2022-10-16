package kodlamaioWithNLayeredApp.business;


import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAcecss.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao , Logger[] loggers ) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		Course[] courses = {new Course(1,"Java", 2500), new Course(2,"Python", 2750)};
		for (Course c:courses) {
			if(course.getCourseName()==c.getCourseName()) {
				throw new Exception("Kurs İsmi Tekrar Edemez...");
			}
		}
		if(course.getCoursePrice()<0) {
			throw new Exception("Kursun Fiyatı 0 dan küçük olamaz..."); 
		}else 
		
		courseDao.add(course);
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}	
	
}
