package com.mindtree.dao;

import com.mindtree.entity.Types;
import com.mindtree.exceptions.DaoException;

public interface TypesDao {
	public Types getType(int id) throws DaoException;
	public String addType(Types types)throws DaoException;
}
