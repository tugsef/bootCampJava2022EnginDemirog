package kodlamaioWithNLayeredApp.dataAcecss;

import kodlamaioWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("Hibernate ile Veritabanına Katagori eklendi");
	}

	
}
