package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Player;
import com.mindtree.exceptions.DaoException;

public interface PlayerDao {
	
public String addPlayer(Player player) throws DaoException;
	
	public List<Player> displayAll() throws DaoException;

}
