package com.mindtree.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mindtree.dao.TeamDao;
import com.mindtree.dao.impl.TeamDaoImpl;
import com.mindtree.entity.Player;
import com.mindtree.entity.Team;
import com.mindtree.exceptions.DaoException;
import com.mindtree.exceptions.ServiceException;
import com.mindtree.service.PlayerService;
import com.mindtree.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
	
	
	TeamDao td=new TeamDaoImpl();
	@Override
	public String addTeam(Team team) throws ServiceException {
		try {
			return td.addTeam(team);
		} catch (DaoException e) {
			throw new ServiceException(e+"Adding Team Service Failed");
		}
		
	}

	@Override
	public List<Team> displayAll() throws ServiceException {
		try {
			return td.displayAll();
		} catch (DaoException e) {
			throw new ServiceException(e+"Fetching All team Service Failed");
		}
		
	}

	@Override
	public List<Player> displayAvailable() throws ServiceException {
		PlayerService  playerService=new PlayerServiceImpl();
		return playerService.displayAll().stream()
					.filter(p-> "yes".equals(p.isAvailable())).collect(Collectors.toList());
		
	}
	
}
