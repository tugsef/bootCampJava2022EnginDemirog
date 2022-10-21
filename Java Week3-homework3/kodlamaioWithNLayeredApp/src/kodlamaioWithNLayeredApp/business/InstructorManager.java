package kodlamaioWithNLayeredApp.business;




import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAcecss.InstructorDao;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class InstructorManager {
	private Instructor[] instructors;
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers , Instructor[] instructors) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		this.instructors = instructors;
	}
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for(Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}
}
