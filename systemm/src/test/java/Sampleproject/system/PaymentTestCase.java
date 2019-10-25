package Sampleproject.system;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PaymentTestCase {

	static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	}

	@Test
	public void testAddPayment() {
		Payment s=new Payment();
		s.setId(23);
		s.setAccountno(34565);
		s.setCartid("10");
		s.setShippingaddress("dxgfgfhgv");
		PaymentDAO dao=(PaymentDAO)context.getBean("paymentDAO");
		 assertTrue(dao.addPayment(s));
	}

	@Ignore
	public void testDeletePayment() {
		PaymentDAO p=(PaymentDAO)context.getBean("PaymentDAO");
		Payment co= p.findPayment(3);
		assert (p.deletePayment(co));
	}

	@Ignore
	public void testUpdatePayment() {
		PaymentDAO p=(PaymentDAO)context.getBean("PaymentDAO");
		Payment co= p.findPayment(5);
	
		p.updatePayment(co);
	}

	@Ignore
	public void testFindPayment() {
		PaymentDAO p=(PaymentDAO)context.getBean("PaymentDAO");
		Payment co=p.findPayment(5);
		System.out.println(co.getAccountno());
	}

	@Test
	public void testGetAllPayments( ) {
		PaymentDAO p=(PaymentDAO)context.getBean("paymentDAO");
		for(Payment co:p.getAllPayments(null))
		{
			System.out.println(co.getAccountno());
		}
	}
}
