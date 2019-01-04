package com.mindtree.exceptions;

import org.springframework.stereotype.Component;

@Component
public class DaoException extends Exception {
	String s;

	public DaoException(String s) {
		super();
		this.s = s;
	}
	

}
