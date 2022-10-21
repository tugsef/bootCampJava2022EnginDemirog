package kodlamaioWithNLayeredApp.dataAcecss;


import kodlamaioWithNLayeredApp.entities.Course;

public class JdbsCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("JDBC ile Veritabanına Kurs Adı eklendi");
	}
}
