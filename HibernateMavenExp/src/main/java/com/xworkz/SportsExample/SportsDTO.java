package com.xworkz.SportsExample;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sport")
public class SportsDTO implements Serializable{

	@Id
	@GenericGenerator(name="sports",strategy="increment")
	@GeneratedValue(generator="sports")
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="state")
	private String state;
	@Column(name="players")
	private int players;
	
	public SportsDTO() {
		System.out.println("created........."+this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "SportsDTO [id=" + id + ", name=" + name + ", state=" + state + ", players=" + players + "]";
	}
	
	
	
	
	
}
