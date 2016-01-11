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

	public Administrator(String username, String password, boolean accountNonExpired, boolean accountNonLocked,
			boolean credentialsNonExpired, boolean enabled, List<Authority> authorities, String firstName,
			String lastName) {
		super(username, password, accountNonExpired, accountNonLocked, credentialsNonExpired, enabled, authorities, firstName,
				lastName);
	}
	
}
