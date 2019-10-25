package Sampleproject.system;

import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;
	public boolean addProduct(Product p) {
		Session session=sessionFactory.getCurrentSession();
		session.save(p);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean deleteProduct(Product p) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(p);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean updateProduct(Product p) {
		Session session=sessionFactory.getCurrentSession();
		session.update(p);
		// TODO Auto-generated method stub
		return true;
	}

	public Product findProduct(int id) {
		 System.out.println("finding product with id "+id);
			Session session=sessionFactory.getCurrentSession();
			Query query= session.createQuery("from Product p where p.productid="+id);
			List<Product> productlist= query.list();
		return productlist.get(0);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return ( sessionFactory.getCurrentSession().createQuery("from  Product p").list());
	}
	
}
