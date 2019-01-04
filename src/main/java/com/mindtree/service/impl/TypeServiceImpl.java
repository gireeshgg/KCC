package com.mindtree.service.impl;

import org.springframework.stereotype.Service;

import com.mindtree.dao.TypesDao;
import com.mindtree.dao.impl.TypesDaoImpl;
import com.mindtree.entity.Types;
import com.mindtree.exceptions.DaoException;
import com.mindtree.exceptions.ServiceException;
import com.mindtree.service.TypeService;


@Service
public class TypeServiceImpl implements TypeService{
	
	
	TypesDao t=new TypesDaoImpl();
	@Override
	public Types getType(int id) throws ServiceException{
		// TODO Auto-generated method stub
		try {
			return t.getType(id);
		} catch (DaoException e) {
			
			throw new ServiceException(e+"getting Types service failed");
		}
	}
	@Override
	public String addType(Types types) throws ServiceException {
		
		try {
			System.out.println(types+" service");
			return t.addType(types);
		} catch (DaoException e) {
			throw new ServiceException(e+"adding Type service failed");
		}
	}

}
