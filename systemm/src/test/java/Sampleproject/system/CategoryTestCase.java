package Sampleproject.system;


import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {

	/*static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	}

	@Test
	public void testAddCategory() {
		Category p=new Category();
		p.setCategoryname("Footwear");
		p.setId(23);
		CategoryDAO dao=(CategoryDAO)context.getBean("CategoryDAO");
		 assertTrue(dao.addCategory(p));	
	}

	@Ignore
	public void testDeleteCategory() {
		CategoryDAO p=(CategoryDAO)context.getBean("CategoryDAO");
		Category co= p.findCategory(15);
		assert (p.deleteCategory(co));
	}

	@Test
	public void testUpdateCategory() {
		CategoryDAO p=(CategoryDAO)context.getBean("CategoryDAO");
		Category co= p.findCategory(11);
		co.setCategoryname("Scandals");
		p.updateCategory(co);
		
	}

	@Test
	public void testFindCategory() {
		CategoryDAO p=(CategoryDAO)context.getBean("CategoryDAO");
		Category co=p.findCategory(11);
		System.out.println(co.getCategoryname());
	}

	@Test
	public void testGetAllCategories() {
		CategoryDAO p=(CategoryDAO)context.getBean("CategoryDAO");
		for(Category po:p.getAllCategories())
		{
			System.out.println(po.getCategoryname());
		}
	}*/

}
