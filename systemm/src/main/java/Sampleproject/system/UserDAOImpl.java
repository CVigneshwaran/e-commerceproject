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
public class UserDAOImpl implements UserDAO {
	@Autowired 
	SessionFactory sessionFactory;
	public boolean addUser(User po) {
		Session session=sessionFactory.getCurrentSession();
		session.save(po);
		return true;
	}

	public boolean deleteUser(User po) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(po);
		// TODO Auto-generated method stub
		return true;
	}

	public User findUser(int id) {

		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("from User p where p.id="+id);
		session.get(User.class, id);
		List<User> Userlist= query.list();
		return Userlist.get(0);
	}

	public User updateUser(User po) {
		 Session session=sessionFactory.getCurrentSession();
		 session.update(po);
		// TODO Auto-generated method stub
		return po;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from User po").list();
	}

}
