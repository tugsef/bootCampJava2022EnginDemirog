package kodlamaioWithNLayeredApp.business;


import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAcecss.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;


public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}


	public void add(Category category) throws Exception {
		Category[] categories = {new Category(1,"Backend programing"), new Category(2,"Frontend programing")};
		for (Category c:categories) {
			if(category.getCategoryName()==c.getCategoryName()) {
				throw new Exception("Kurs Katagorisi Tekrar Edemez...");
			}
		}
		 
		
		categoryDao.add(category);
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
	
}
