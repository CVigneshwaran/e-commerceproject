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
public class PaymentDAOImpl implements PaymentDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	public boolean addPayment(Payment pa) {
		Session session=sessionFactory.getCurrentSession();
		session.save(pa);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean deletePayment(Payment pa) {
		Session session=sessionFactory.getCurrentSession();
				session.delete(pa);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean updatePayment(Payment pa) {
		Session session=sessionFactory.getCurrentSession();
				session.update(pa);
		// TODO Auto-generated method stub
		return true;
	}

	public Payment findPayment(int id) {
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("from Payment p where p.id="+id);
		session.get(Payment.class, id);
		List<Payment> Paymentlist= query.list();
		return Paymentlist.get(0);
	}

	public List<Payment> getAllPayments(String cartid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Payment pa where pa.cartid='" + cartid+"'  ").list();
	}

}

