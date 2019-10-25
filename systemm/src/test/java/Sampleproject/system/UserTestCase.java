package Sampleproject.system;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTestCase {
	

	static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	}

	@Test
	public void testAddUser() {
		User u=new User();
		u.setEmail("98vigneshc@gmail.com");
		u.setId(23);
		u.setPassword("321");
		u.setUsername("Tamil");
		u.setUser_role("ROLE_ADMIN");
		UserDAO dao=(UserDAO)context.getBean("userDAO");
		 assertTrue(dao.addUser(u));
	}

	@Ignore
	public void testDeleteUser() {
		UserDAO p=(UserDAO)context.getBean("userDAO");
		User co= p.findUser(17);
		assert (p.deleteUser(co));
	}

	/*@Test
	public void testFindUser() {
		UserDAO p=(UserDAO)context.getBean("UserDAO");
		User co=p.findUser(76);
		System.out.println(co.getEmail());
	}

	@Ignore
	public void testUpdateUser() {
		UserDAO p=(UserDAO)context.getBean("UserDAO");
		User co= p.findUser(76);
		co.setSupplieraddress("Thanjavur");
		p.updateUser(co);	
	}

	/*@Test
	public void testGetAllUsers() {
		UserDAO p=(UserDAO)context.getBean("UserDAO");
		for(User co:p.getAllUsers())
		{
			System.out.println(co.getSupplieraddress());
		}
	}*/

}
