package Sampleproject.system;
import javax.sql.DataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
   /*   ApplicationContext Context=new AnnotationConfigApplicationContext("SpringConfiguration.class");
       Product p =(Product)Context.getBean("productDAO");
       
       p.setProductname("casual shoe");
       p.setPrice(2000);
       p.setQuantity(3);
       p.setCategoryid(10);
       p.setSupplierid(101);
       System.out.println(p.getProductname()+" " +p.getPrice()+" "+p.getQuantity()+" "+p.getCategoryid()+" "+p.getSupplierid());
       Category c=(Category)Context.getBean("categoryDAO");
       c.setCategoryname("Shoes");
       System.out.println(c.getCategoryname());
       Supplier s=(Supplier)Context.getBean("supplierDAO");
       s.setSuppliername("Hari");
       s.setSupplierAddress("Thirunelveli");
       System.out.println(s.getSuppliername()+" " +s.getSupplierAddress());*/
    
    try {
    	//	ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringConfiguration.xml");
    	  ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfiguration.class);
    	  ProductDAO a=(ProductDAO)ctx.getBean("productDAO");
    	  Product p=new Product();
    	  p.setProductname("Casual Shoee");
    	  p.setPrice(2499);
    	  p.setProductid(1);
    	  p.setSupplierid(1);
    	  p.setQuantity(22);
    	  a.addProduct(p);
    	  CategoryDAO b=(CategoryDAO)ctx.getBean("categoryDAO");
    	  Category c=new Category();
    	  c.setCategoryname("shoee");
    	  b.addCategory(c);
    	  SupplierDAO x=(SupplierDAO)ctx.getBean("supplierDAO");
    	  Supplier s=new Supplier();
    	  s.setSupplierAddress("Thirunelveli"); 
    	  s.setSuppliername("Hari");	
    	  x.addSupplier(s);
    	  UserDAO xo=(UserDAO)ctx.getBean("userDAO");
    	  User po=new User();
    	  po.setUsername("Vicky");
    	  po.setEmail("vickywaranjan23@gmail.com");
    	  po.setPassword("23vicky");
    	  po.setUser_role("ROLE_USER");
    	  xo.addUser(po);
    	  CartDAO xi=(CartDAO)ctx.getBean("cartDAO");
    	  Cart co=new Cart();
    	  co.setCartid("233");
    	  co.setEmail("vickywaranjan23@gmail.com");
    	  co.setId(233);
    	  co.setPrice(2999);
    	  co.setProductid(1234);
    	  xi.addCart(co);
    	  PaymentDAO io=(PaymentDAO)ctx.getBean("paymentDAO");
    	  Payment pa=new Payment();
    	  pa.setAccountno(233);
    	  pa.setId(23);
    	  pa.setPaymentmethod("card");
    	  pa.setShippingaddress("Madurai");
    	  pa.setCartid("10");
    	  io.addPayment(pa);
          } catch (BeansException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
}}
