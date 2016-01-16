package dao;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Manager extends User{

	@ManyToOne
	Administrator administrator;
	@OneToOne
	EducationOrganization eduOrg;
	String position;
	public Manager() {
		super();
	}

	public Manager(String firstName, String lastName, String username, String description, User creator,
			EducationOrganization eduOrg, String position, String email) {
		super(firstName, lastName, username);
		this.administrator = (Administrator) creator;
		this.eduOrg = eduOrg;
		this.position = position;
		this.setEmail(email);
		this.setDescription(description);
	}

	public EducationOrganization getEduOrg() {
		return eduOrg;
	}

	public void setEduOrg(EducationOrganization eduOrg) {
		this.eduOrg = eduOrg;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
