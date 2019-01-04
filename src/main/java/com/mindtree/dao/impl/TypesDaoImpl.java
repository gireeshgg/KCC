package com.mindtree.dao.impl;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mindtree.dao.TypesDao;
import com.mindtree.entity.Types;
import com.mindtree.exceptions.DaoException;
import com.mindtree.utils.KccUtils;

@Repository
public class TypesDaoImpl implements TypesDao {

	
	
HibernateTemplate template = new HibernateTemplate();
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	
	@Override
	public Types getType(int id) throws DaoException {
		    Types types = new Types();
			Session session = KccUtils.createConnection();
			Transaction txn = session.beginTransaction(); 
			
			Query query = (Query) session.createQuery("from Types where id="+id+"");
			types = (Types) query.getSingleResult();
			System.out.println(types);
			return types;
		}

	@Override
	public String addType(Types types) throws DaoException {
		
			Session session = KccUtils.createConnection();
			Transaction txn = session.beginTransaction(); 
			System.out.println(types);

			session.merge(types);
			txn.commit();
			return "Success";
		}
}


