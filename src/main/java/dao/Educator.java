package dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Educator extends User {
		
	@ManyToOne
	EducationOrganization eduOrg;
	
	@ManyToMany(mappedBy="educators")
	List<StudyGroup> groups;
	String subject;
	
	public Educator() {
		super();
	}

	public Educator(String firstName, String lastName, String username, String description,User creator) {
		super(firstName, lastName, username);
		Manager mngr = (Manager)creator;
		this.eduOrg = mngr.getEduOrg();
		}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public EducationOrganization getEduOrg() {
		return eduOrg;
	}

	public void setEduOrg(EducationOrganization eduOrg) {
		this.eduOrg = eduOrg;
	}

	public List<StudyGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<StudyGroup> groups) {
		this.groups = groups;
	}



}
