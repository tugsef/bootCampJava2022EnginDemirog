package kodlamaioWithNLayeredApp.business;


import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAcecss.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class CourseManager {
	private Course[] courses;
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao , Logger[] loggers , Course[] courses) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		
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
