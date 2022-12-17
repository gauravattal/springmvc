package Dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import entity.user;

@Repository
public class userDao {
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
 
	@Autowired
	private HibernateTemplate hibernateTemplate;
    
	@Transactional
	public void save(user user) {
		
		
		 hibernateTemplate.save(user);

		
	}

	
	
	
}
