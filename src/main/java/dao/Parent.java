package dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
@Entity
public class Parent extends User{
	@ManyToMany
	List<Child> children;

	public Parent() {
		super();
	}

	public Parent(String username, String password, boolean accountNonExpired, boolean accountNonLocked,
			boolean credentialsNonExpired, boolean enabled, List<Authority> authorities, String firstName,
			String lastName) {
		super(username, password, accountNonExpired, accountNonLocked, credentialsNonExpired, enabled, authorities, firstName,
				lastName);
	}
}
