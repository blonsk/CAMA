package dao;

import java.util.List;

import javax.persistence.*;

@Entity

public class StudyGroup {
	String groupName;
	@ManyToOne
	EducationOrganization eduOrg;
	@Id
	@GeneratedValue
	int groupId;
	@OneToMany
	Child[] children;

	@ManyToMany
	List<Educator> educators;

	public StudyGroup(String groupName, EducationOrganization eduOrg) {
		super();
		this.groupName = groupName;
		this.eduOrg = eduOrg;
	}
	
}
