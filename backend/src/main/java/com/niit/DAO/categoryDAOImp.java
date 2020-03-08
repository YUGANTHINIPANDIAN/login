package com.niit.DAO;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import proj.niit.model.category;

@Repository("categoryDAO")
@Transactional



public class categoryDAOImp implements categoryDAO
{
    @Autowired
    SessionFactory sessionFactory;
    
	public boolean addCategory(category category) {
		try
		{
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	
	}
	

	public boolean deletecategory(category category) {
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
	}
		
	}

	public boolean updatecategory(category category) {
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
	// TODO Auto-generated method stub
		return false;
	}
	}
	

	public List<category> listcategories() {
		
	Session session=sessionFactory.openSession();
	Query query=session.createQuery("from category");
	List<category> listCategories=((org.hibernate.query.Query) query).list();
	session.close();
	return listCategories;
	}
	public category getcategory(int categoryId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		category category=(category)session.get(category.class,categoryId);
		session.close();
		return category;
		
	}


	public boolean deleteCategory(category category) {
		// TODO Auto-generated method stub
		return false;
	}
}
