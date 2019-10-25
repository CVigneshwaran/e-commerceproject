package Sampleproject.system;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	@NotBlank(message="E-mail can't be Blank")
	@Email(message="Enter Valid E-mail")
	private String email;
	@NotBlank(message="Username can't be Blank")
	private String username;
	@NotBlank(message="Password can't be Blank")
	@Min(value=8)
	private String password;
	@NotBlank(message="User_role can't be Blank")
	private String user_role;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
