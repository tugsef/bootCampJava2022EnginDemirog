package kodlamaioWithNLayeredApp.dataAcecss;

import kodlamaioWithNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile Veritabanına Eğitici eklendi");
	}

	 
}
