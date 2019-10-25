package Sampleproject.system;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CartTestCase {

	/* ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	}
	@Test
	public void testAddCart() {
		Cart ca=new Cart();
		ca.setCartid("de33442");
		ca.setEmail("weerr@gmail.com");
		ca.setId(344);
		ca.setPrice(2499);
		ca.setProductid(455);
		CartDAO dao=(CartDAO)context.getBean("CartDAO");
		 assertTrue(dao.addCart(ca));
	}

	@Ignore
	public void testDeleteCart() {
		CartDAO p=(CartDAO)context.getBean("CartDAO");
		Cart co= p.findCart(18);
		assert (p.deleteCart(co));
	}

	@Test
	public void testFindCart() {
		CartDAO p=(CartDAO)context.getBean("CartDAO");
		Cart co=p.findCart(66);
		System.out.println(co.getPrice());
	}

	@Test
	public void testUpdateCart() {
		CartDAO p=(CartDAO)context.getBean("CartDAO");
		Cart co= p.findCart(66);
		co.setPrice(3444443);
		p.updateCart(co);	}

	@Test
	public void testGetAllCarts() {
		CartDAO p=(CartDAO)context.getBean("CartDAO");
		for(Cart po:p.getAllCarts())
		{
			System.out.println(po.getPrice());
		}
	}*/

}
