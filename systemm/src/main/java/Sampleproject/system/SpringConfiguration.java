package Sampleproject.system;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class SpringConfiguration {
	@Bean("dataSource")
	public DataSource getH2DataSource()
	{
	
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/test");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	}
	@Bean(name="sessionFactory")
	 public SessionFactory getSessionFactory()
    {  
    	Properties prop = new Properties();
    	prop.setProperty("hibernate.hbm2ddl.auto", "update");
    	prop.put("hibernate.show_sql", "true");
    	prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
    
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
    	sessionBuilder.addProperties(prop);
    	sessionBuilder.addAnnotatedClass(Product.class);
    	sessionBuilder.addAnnotatedClass(Category.class);
    	sessionBuilder.addAnnotatedClass(Supplier.class);
    	sessionBuilder.addAnnotatedClass(User.class);
    	sessionBuilder.addAnnotatedClass(Cart.class);
    	sessionBuilder.addAnnotatedClass(Payment.class);
    	
    	SessionFactory sessionFactory = sessionBuilder.buildSessionFactory();
    	return sessionFactory;
    }
	@Bean("txManager")
	public HibernateTransactionManager getTransactionManager()
	{
	HibernateTransactionManager manager=new HibernateTransactionManager(getSessionFactory());	
	return manager;
	}
	@Bean("productDAO")
	public ProductDAO getProductDAO()
	{
		ProductDAOImpl a=new ProductDAOImpl();
		return a;
	}
	@Bean("categoryDAO")
	CategoryDAOImpl getcategoryDAO()
	{
		CategoryDAOImpl b=new CategoryDAOImpl();
		return  b;
	}
	@Bean("supplierDAO")
	SupplierDAOImpl getSupplierDAO()
	{
		SupplierDAOImpl x=new SupplierDAOImpl();
		return x;
	}
	@Bean("userDAO")
	UserDAOImpl getUserDAO()
	{
		UserDAOImpl xo=new UserDAOImpl();
		return xo;
	}
	@Bean("cartDAO")
	CartDAOImpl getCartDAO()
	{
		CartDAOImpl xi=new CartDAOImpl();
		return xi;
	}
	@Bean("paymentDAO")
	PaymentDAOImpl getPaymentDAO()
	{
		PaymentDAOImpl io=new PaymentDAOImpl();
		return io;
	}
}
