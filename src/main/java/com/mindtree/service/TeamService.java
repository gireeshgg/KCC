package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Player;
import com.mindtree.entity.Team;
import com.mindtree.exceptions.ServiceException;


public interface TeamService {
	
	public List<Team> displayAll() throws ServiceException;

	public String addTeam(Team team) throws ServiceException;

	public List<Player> displayAvailable() throws ServiceException;



	

}
