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
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	SessionFactory sessionFactory;
	public boolean addSupplier(Supplier p) {
		sessionFactory.getCurrentSession().save(p);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean deleteSupplier(Supplier p) {
		sessionFactory.getCurrentSession().delete(p);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean updateSupplier(Supplier p) {
		sessionFactory.getCurrentSession().update(p);
		// TODO Auto-generated method stub
		return true;
	}

	public Supplier findSupplier(int id) {
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("from Supplier p where p.id="+id);
		session.get(Supplier.class, id);
		List<Supplier> Supplierlist= query.list();
		return Supplierlist.get(0);
	}

	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from  Supplier p").list();
	}

}
