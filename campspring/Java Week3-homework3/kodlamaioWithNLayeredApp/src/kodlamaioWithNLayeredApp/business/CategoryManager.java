package kodlamaioWithNLayeredApp.business;



import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAcecss.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;


public class CategoryManager {
	private Category[] categories;
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers , Category[] categories) {
		this.categories = categories;
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}


	public void add(Category category) throws Exception {
		
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
