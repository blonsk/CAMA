package dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Administrator extends User {
	@OneToMany(mappedBy = "administrator")
	
	List<Manager> managers;
	
	public Administrator() {
		super();
	}
	public Administrator(String firstName, String lastName, String username) {
		super(firstName, lastName, username);
		
	}

		
}
