package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Player {
	@Id
	private int id;
	private String name;
	@OneToOne
	private Types type;
	private int age ;
	private double battingavg;
	private double bowlingavg;
	private String available;
	
	//constructor
	
	
	public Player() {}
	
	public Player(int id, String name, Types type, int age, double battingavg, double bowlingavg, String available) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.age = age;
		this.battingavg = battingavg;
		this.bowlingavg = bowlingavg;
	}



	public String isAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
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
	public Types getType() {
		return type;
	}
	public void setType(Types type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBattingavg() {
		return battingavg;
	}
	public void setBattingavg(double battingavg) {
		this.battingavg = battingavg;
	}
	public double getBowlingavg() {
		return bowlingavg;
	}
	public void setBowlingavg(double bowlingavg) {
		this.bowlingavg = bowlingavg;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", type=" + type + ", age=" + age + ", battingavg=" + battingavg
				+ ", bowlingavg=" + bowlingavg + "]";
	}

	
}
