package dao;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Parent extends User{
	@ManyToMany
	List<Child> children;
	
	public Parent() {
		super();
	}

	public Parent(String firstName, String lastName, String username) {
		super(firstName, lastName, username);
		}

	}
