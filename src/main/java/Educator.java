package camaProject.back.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Educator extends User {
	@ManyToOne
	Manager manager;
	@ManyToMany(mappedBy = "educators")
	List<Child> childs;

	public Educator() {
		super();
	}

	public Educator(String username, String password, boolean accountNonExpired, boolean accountNonLocked,
			boolean credentialsNonExpired, boolean enabled, List<Authority> authorities, String firstName,
			String lastName) {
		super(username, password, accountNonExpired, accountNonLocked, credentialsNonExpired, enabled, authorities,
				firstName, lastName);
	}

}
