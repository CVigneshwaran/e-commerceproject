package Sampleproject.system;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public class CartDAOImpl implements CartDAO {
	
	@Autowired 
	SessionFactory sessionFactory;

	public boolean addCart(Cart co) {
		Session session=sessionFactory.getCurrentSession();
				session.save(co);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean deleteCart(Cart co) {
		Session session=sessionFactory.getCurrentSession();
				session.delete(co);
		// TODO Auto-generated method stub
		return true;
	}

	public Cart findCart(int id) {
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("from Cart p where p.id="+id);
		session.get(Cart.class, id);
		List<Cart> Cartlist= query.list();
		return Cartlist.get(0);
	}

	public Cart updateCart(Cart co) {
		sessionFactory.getCurrentSession().update(co);
		// TODO Auto-generated method stub
		return co;
	}

	public List<Cart> getAllCarts(String co) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("select co from Cart co where  co.cartid='"+co+"'").list();
	}

	
	//public List<Cart> getAllProducts(String cartid) {
		// TODO Auto-generated method stub
		//return  sessionFactory.getCurrentSession().createQuery("from Cart co").list();
	//}

	@Override
	public int totalelements(String cartid) {
		Session session=sessionFactory.getCurrentSession();
		System.out.println(cartid);
		Query query=session.createQuery("select co from Cart co where  co.cartid='"+cartid+"'");
		Integer size=query.list().size();
		System.out.println(size);
		return size;
	}

	

}
