package com.mindtree.service;

import java.util.List;


import com.mindtree.entity.Player;
import com.mindtree.exceptions.ServiceException;


public interface PlayerService {
	public String addPlayer(Player player) throws ServiceException;
	
	public List<Player> displayAll() throws ServiceException;

//	public List<Player> displayAvailable()throws ServiceException;

	

}
