package kodlamaioWithNLayeredApp.business;




import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAcecss.InstructorDao;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for(Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}
}
