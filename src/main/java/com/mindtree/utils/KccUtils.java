package com.mindtree.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mindtree.entity.Player;
import com.mindtree.entity.Team;
import com.mindtree.entity.Types;


public class KccUtils {
	public static Session createConnection() {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Team.class).addAnnotatedClass(Player.class).addAnnotatedClass(Types.class);
		
		SessionFactory sf = configuration.buildSessionFactory(); 
		Session session = sf.openSession(); 
		return session;
	}
}
