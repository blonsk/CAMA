package camaProject.back.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

@SuppressWarnings("serial")
@Entity
public class Authority implements GrantedAuthority, Serializable {
	@Id
	@GeneratedValue
	String authority;
	@ManyToOne
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Authority(String authority) {
		super();
		this.authority = authority;
	}

	public Authority() {
		super();
	}
	
	

}
