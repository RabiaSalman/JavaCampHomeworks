package dataAccsess;

import entities.Category;

public class JdbcCategoryDao  implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile Veritaban�na Eklendi:"+category.getCategoryName());
		
	}



	
	
	
}
