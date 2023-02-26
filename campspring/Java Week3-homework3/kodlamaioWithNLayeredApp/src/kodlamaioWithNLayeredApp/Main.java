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
    
	
		
		Instructor instructor = new Instructor(22, "Sefa", "Demirtaş");
		
     Logger[] loggers = {new DatabaseLogger(),new FileLogger() , new MailLogger()};
     
     Course[] courses = {new Course(5, "Pyton", 5000) , new Course(10, "Java", 0),new Course(6, "Pyton Deep Learning", 5500)};
     Course course1 = new Course(6, "C++", 4500);
     
     Category[] categories = {new Category(1,"Backend programing"), new Category(2,"Frontend programing")};
     Category category1 = new Category(10, "Deep Learning");
     
    
   
     CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
     categoryManager.add(category1);
     
     System.out.println("--------------------------------------------------------------------------");
     
     CourseManager courseManager = new CourseManager(new JdbsCourseDao(), loggers , courses);
     courseManager.add(course1);
     
     System.out.println("--------------------------------------------------------------------------");
     Instructor[] instructors = {new Instructor(5, "Engin", "Demirog")};
     InstructorManager instructorManager = new InstructorManager(new JdbsInstructorDao(), loggers , instructors);
     instructorManager.add(instructor);
     
	}

}
