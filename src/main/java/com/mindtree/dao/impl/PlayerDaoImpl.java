package com.mindtree.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mindtree.dao.PlayerDao;
import com.mindtree.entity.Player;
import com.mindtree.utils.KccUtils;





public class PlayerDaoImpl implements PlayerDao {

	public String addPlayer(Player player) {
		Session session = KccUtils.createConnection();
		Transaction txn = session.beginTransaction(); 
		System.out.println(player);

		session.merge(player);
		txn.commit();
		return "Success";
	}

	public List<Player> displayAll() {
		List<Player> players = new ArrayList<>();
		Session session = KccUtils.createConnection();
		Transaction txn = session.beginTransaction(); 
		
		Query query = (Query) session.createQuery("from Player");
		players = query.getResultList();
		txn.commit();
		return players;
	}

//	public Player getPlayerById(String id) {
//		Player player = new Player();	
//		Session session = KccUtils.createConnection();
//		Transaction txn = session.beginTransaction(); 
//		
//		Query query = session.createQuery("from Player where id="+id+"");
//		player = (Player) query.getSingleResult();
//		
//		System.out.println(player);
//		return player;
//	}
//	
//	public List<Player> getPlayerByStatus(String status) {
//		List<Player> players = new ArrayList<>();
//		Session session = KccUtils.createConnection();
//		Transaction txn = session.beginTransaction(); 
//		
//		Query query = session.createQuery("from Player where status="+status+"");
//		players = query.getResultList();
//		System.out.println(players);
//		return players;
//	}


	
	

}
