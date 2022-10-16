package kodlamaioWithNLayeredApp;

import kodlamaioWithNLayeredApp.business.CategoryManager;
import kodlamaioWithNLayeredApp.business.CourseManager;
import kodlamaioWithNLayeredApp.business.InstructorManager;
import kodlamaioWithNLayeredApp.core.logging.DatabaseLogger;
import kodlamaioWithNLayeredApp.core.logging.FileLogger;
import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.core.logging.MailLogger;
import kodlamaioWithNLayeredApp.dataAcecss.HibernateCategoryDao;
import kodlamaioWithNLayeredApp.dataAcecss.JdbsCourseDao;
import kodlamaioWithNLayeredApp.dataAcecss.JdbsInstructorDao;
import kodlamaioWithNLayeredApp.entities.Category;
import kodlamaioWithNLayeredApp.entities.Course;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
    // Course course = new Course(1, "Java", 20000);
    // Course course2 = new Course(1, "C++", -10);
		Category category = new Category(2, "Machine language");
		Course course = new Course(10, "c++", 3500);
		Instructor instructor = new Instructor(22, "Sefa", "Demirtaş");
		
     Logger[] loggers = {new DatabaseLogger(),new FileLogger() , new MailLogger()};
     
    // CourseManager courseManager = new CourseManager(new JdbsCourseDao() , loggers);
     //courseManager.add(course);
     CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
     categoryManager.add(category);
     System.out.println("--------------------------------------------------------------------------");
     CourseManager courseManager = new CourseManager(new JdbsCourseDao(), loggers);
     courseManager.add(course);
     System.out.println("--------------------------------------------------------------------------");
     InstructorManager instructorManager = new InstructorManager(new JdbsInstructorDao(), loggers);
     instructorManager.add(instructor);
     
	}

}
