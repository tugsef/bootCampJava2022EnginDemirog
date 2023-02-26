package kodlamaioWithNLayeredApp.dataAcecss;

import kodlamaioWithNLayeredApp.entities.Instructor;

public class JdbsInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println("JDBC ile Veritabanına Eğitici  eklendi");
	}
}
