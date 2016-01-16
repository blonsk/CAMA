package dao;

import java.util.List;

import javax.persistence.*;

@Entity
public class Child {

	@Id
	@GeneratedValue
	int id;
	
	String firstName;
	String lastName;
	
	@Embedded
	Address address;

	EducationOrganization eduOrg;
	
	@ManyToOne
	StudyGroup group;
	List<String> comments;
	@ManyToMany
	List<Parent> parents;
	

	public Child(String firstName, String lastName,String comment, StudyGroup group) {
		this.firstName = firstName;
		this.lastName = lastName;
		comments.add(comment);
		this.group = group;
	}

	public Child() {
		super();
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public EducationOrganization getEduOrg() {
		return eduOrg;
	}

	public void setEduOrg(EducationOrganization eduOrg) {
		this.eduOrg = eduOrg;
	}

	public StudyGroup getGroup() {
		return group;
	}

	public void setGroup(StudyGroup group) {
		this.group = group;
	}

	public List<Parent> getParents() {
		return parents;
	}

	public void setParents(List<Parent> parents) {
		this.parents = parents;
	}
	@OneToMany
	List<FamilyMember> familyMembers;
}   
