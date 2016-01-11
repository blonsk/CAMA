package dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Manager extends User{

	@ManyToOne
	Administrator administrator;
	@OneToMany(mappedBy="manager")
	List<Educator> educators;
	@OneToOne
	EducationOrganization eduOrg;
	
	public Manager() {
		super();
	}

	public Manager(String username, String password, boolean accountNonExpired, boolean accountNonLocked,
			boolean credentialsNonExpired, boolean enabled, List<Authority> authorities, String firstName,
			String lastName) {
		super(username, password, accountNonExpired, accountNonLocked, credentialsNonExpired, enabled, authorities, firstName,
				lastName);
	}

}
