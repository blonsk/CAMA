package dao;

import java.util.Date;

import javax.persistence.*;

@Entity
@IdClass(User.class)

public class Log {
@Id
@AttributeOverrides({
	@AttributeOverride(name="creator", column = @Column(name="creator")),
	@AttributeOverride(name="creationTime", column = @Column(name="creationTime"))
})
	User creator;
	Date creationTime;
	String description;
	Child child;
	public Log(User creator, String description) {
		super();
		this.creator = creator;
		this.description = description;
		this.creationTime = new Date();
	}
	
	

}
