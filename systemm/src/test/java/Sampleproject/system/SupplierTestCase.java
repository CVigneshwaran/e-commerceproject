package Sampleproject.system;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SupplierTestCase {
	
	/*static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	}

	@Ignore
	public void testAddSupplier() {
		Supplier s=new Supplier();
		s.setId(23);
		s.setSupplierAddress("Thirunelveli");
		s.setSuppliername("Tamil");
		SupplierDAO dao=(SupplierDAO)context.getBean("SupplierDAO");
		 assertTrue(dao.addSupplier(s));
		
	}

	@Ignore
	public void testDeleteSupplier() {
		SupplierDAO p=(SupplierDAO)context.getBean("SupplierDAO");
		Supplier co= p.findSupplier(44);
		assert (p.deleteSupplier(co));
	}

	@Ignore
	public void testUpdateSupplier() {
		SupplierDAO p=(SupplierDAO)context.getBean("SupplierDAO");
		Supplier co= p.findSupplier(51);
		co.setSuppliername("arun");
		p.updateSupplier(co);
	}

	@Test
	public void testFindSupplier() {
		SupplierDAO p=(SupplierDAO)context.getBean("SupplierDAO");
		Supplier co=p.findSupplier(51);
		System.out.println(co.getSuppliername());
	}

	@Ignore
	public void testGetAllSuppliers() {
		SupplierDAO p=(SupplierDAO)context.getBean("SupplierDAO");
		for(Supplier po:p.getAllSuppliers())
		{
			System.out.println(po.getSuppliername());
		}
	}*/

}
