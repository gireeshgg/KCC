package com.mindtree.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mindtree.dao.PlayerDao;
import com.mindtree.dao.impl.PlayerDaoImpl;
import com.mindtree.entity.Player;
import com.mindtree.exceptions.DaoException;
import com.mindtree.exceptions.ServiceException;
import com.mindtree.service.PlayerService;


@Service
public class PlayerServiceImpl implements PlayerService{
	
	
	PlayerDao pd=new PlayerDaoImpl();
	@Override
	public String addPlayer(Player player) throws ServiceException {
		try {				
				player.setAvailable("yes");
			
			return pd.addPlayer(player);
		} catch (DaoException e) {
			throw new ServiceException(e+"Adding Player Service Failed");
		}
	}

	@Override
	public List<Player> displayAll() throws ServiceException {
		try {
			return pd.displayAll();
		} catch (DaoException e) {
			throw new ServiceException(e+"Display Service Failed");
		}
	}

}
