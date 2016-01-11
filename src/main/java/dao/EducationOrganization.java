package dao;

import java.util.List;

import javax.persistence.*;


@Entity
public class EducationOrganization {
	@Id
	@GeneratedValue
	int eduOrgId;
	String name;
	String type;
	@OneToOne
	Manager manager;
	@ManyToOne
	List<Educator> educators;
	
	@Embedded
	Address address;
	
	@OneToMany
	List<StudyGroup> groups;
	

}
