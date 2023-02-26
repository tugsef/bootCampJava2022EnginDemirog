package kodlamaioWithNLayeredApp.entities;

public class Category extends BaseEntities {
	
	private String categoryName;

	public Category(int id, String categoryName) {
		super(id);
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
