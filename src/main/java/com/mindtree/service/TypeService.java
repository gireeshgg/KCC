package com.mindtree.service;

import com.mindtree.entity.Types;
import com.mindtree.exceptions.ServiceException;

public interface TypeService {
	public Types getType(int id) throws ServiceException;
	public String addType(Types types)throws ServiceException;
}
