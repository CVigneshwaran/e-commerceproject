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
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;
	public boolean addCategory(Category p) {
		Session session=sessionFactory.getCurrentSession();
				session.save(p);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean deleteCategory(Category p) {
		
		Session session = sessionFactory.getCurrentSession();
				session.delete(p);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean updateCategory(Category p) {
		Session session=sessionFactory.getCurrentSession();
		session.update(p);
		// TODO Auto-generated method stub
		return true;
	}

	public Category findCategory(int id) {
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("from Category p where p.id="+id);
		session.get(Category.class, id);
		List<Category> Categorylist= query.list();
		return Categorylist.get(0);
		
	}

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from  Category p").list();
	}

}
