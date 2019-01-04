package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Types {
 @Id
 private int id;
 private String name;
 
 public Types() {}
 
 public Types(int id, String name) {
	
	this.id = id;
	this.name = name;
}
 
public int getId() {
	return id;
 }
 public void setId(int id) {
	this.id = id;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 
 
 
@Override
public String toString() {
	return name;
}
 
 
 
 
}
