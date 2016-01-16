package dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.springframework.security.core.userdetails.UserDetails;
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class User implements UserDetails, Serializable {
	@Id
	@GeneratedValue
	int id;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	@OneToMany(mappedBy = "authority")
	private List<Authority> authorities;
	private boolean credentialsNonExpired;
	private boolean enabled;
	private String firstName;
	private String lastName;
	private String password;
	int secretCode;
	String description;
	String email;
	Date regDate;
	Date lastLoginDate;
	private String username; // login(telephone)

	public User() {
		super();
	}

		
	public User(String firstName, String lastName, String username) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.regDate = new Date();
		secretCodeGenerator();
		}


	public void secretCodeGenerator() {
		Random rnd = new Random();
		int code = 10000 + rnd.nextInt(89999);
		this.secretCode = code;
		this.enabled = false;
		//Sending secret code via sender utility
	}

	public boolean checkSecretCode(int secCode){
		if(this.secretCode == secCode){
			this.enabled = true;
			return true;
		}
		else
			return false;
	}
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Collection<Authority> getAuthorities() {
		return authorities;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "MyUserDetails [phone=" + username + ", password=" + password + ", accountNonExpired="
				+ accountNonExpired + ", accountNonLocked=" + accountNonLocked + ", credentialsNonExpired="
				+ credentialsNonExpired + ", enabled=" + enabled + ", authorities=" + authorities + "]";
	}

}
