package dao;

import java.util.Date;

import javax.persistence.*;

@Entity
@IdClass(User.class)

public class Log {
@Id
@GeneratedValue
long id;
	User creator;
	Date creationTime;
	String text;
	
	
	

}
