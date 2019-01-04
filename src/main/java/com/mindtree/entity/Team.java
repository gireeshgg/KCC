package com.mindtree.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Team {
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Player> players;
	private String country;
	
	//constructor
	public Team(int id, String name, List<Player> players, String country) {
		super();
		this.id = id;
		this.name = name;
		this.players = players;
		this.country = country;
	}
	
	public Team() {}
	
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
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", players=" + players + ", country=" + country + "]";
	}
	
	
}
