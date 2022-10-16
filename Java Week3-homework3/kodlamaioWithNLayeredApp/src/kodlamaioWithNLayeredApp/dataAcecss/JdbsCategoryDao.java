package kodlamaioWithNLayeredApp.dataAcecss;

import kodlamaioWithNLayeredApp.entities.Category;

public class JdbsCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("JDBC ile Veritabanına Katagori eklendi");
	}
}
