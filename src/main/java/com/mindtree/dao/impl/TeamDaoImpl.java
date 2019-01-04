package com.mindtree.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mindtree.dao.TeamDao;
import com.mindtree.entity.Player;
import com.mindtree.entity.Team;
import com.mindtree.exceptions.DaoException;
import com.mindtree.utils.KccUtils;
@Repository
public class TeamDaoImpl implements TeamDao {

HibernateTemplate template = new HibernateTemplate();
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public String addTeam(Team team) throws DaoException {
		Session session = KccUtils.createConnection();
		Transaction txn = session.beginTransaction(); 
		System.out.println(team);
		session.merge(team);
		txn.commit();
		return "Success";
		
	}
	

	@Override
	public List<Team> displayAll() throws DaoException {
		List<Team> team = new ArrayList<Team>();
		Session session = KccUtils.createConnection();
		Transaction txn = session.beginTransaction(); 
		Query query = (Query) session.createQuery("from Team");
		team= query.getResultList();
		txn.commit();
		return team;
	}

}
