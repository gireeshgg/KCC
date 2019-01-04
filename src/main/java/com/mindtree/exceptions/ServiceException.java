package com.mindtree.exceptions;

import org.springframework.stereotype.Component;

@Component
public class ServiceException  extends Exception{
String s;

public ServiceException(String s) {
	super();
	this.s = s;
}


}
