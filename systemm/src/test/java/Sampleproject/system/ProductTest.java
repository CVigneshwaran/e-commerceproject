package Sampleproject.system;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductTest {
/*	static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	}

	@Ignore
	public void testAddProduct() {
		Product p=new Product();
		p.setProductname("Casual Shoee");
		p.setPrice(2499);
		p.setQuantity(300);
		p.setCategoryid(1);
		p.setSupplierid(1);
		p.setProductid(101);
		ProductDAO dao=(ProductDAO)context.getBean("ProductDAO");
 assertTrue(dao.addProduct(p));	
	}

	@Test
	public void testDeleteProduct() {
		ProductDAO p=(ProductDAO)context.getBean("ProductDAO");
		Product po=p.findProduct(20);
		assert(p.deleteProduct(po));
	}

	@Test
	public void testUpdateProduct() {
		ProductDAO p=(ProductDAO)context.getBean("ProductDAO");
		Product po=p.findProduct(20);
		po.setPrice(4000);
		p.updateProduct(po);
		
	}

	@Test
	public void testFindProduct() {
		ProductDAO p=(ProductDAO)context.getBean("ProductDAO");
		Product po=p.findProduct(20);
		System.out.println(po.getProductname());
	}

	@Ignore
	public void testGetAllProducts() {
		ProductDAO p=(ProductDAO)context.getBean("ProductDAO");
		for(Product po:p.getAllProducts())
		{
			System.out.println(po.getProductname());
		}
	}
*/
}
