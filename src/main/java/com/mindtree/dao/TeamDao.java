package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Team;
import com.mindtree.exceptions.DaoException;

public interface TeamDao {
public String  addTeam(Team team) throws  DaoException;
	
	public List<Team> displayAll() throws DaoException;


}
