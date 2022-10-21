package kodlamaioWithNLayeredApp.dataAcecss;

import kodlamaioWithNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("Hibernate ile Veritabanına Kurs  eklendi");
	}
}
