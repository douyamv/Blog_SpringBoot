package a;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
// 指定一个表名
public class User {
	// ==============
	// PRIVATE FIELDS
	// ==============
	// An autogenerated id (unique for each user in the db)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	// The user email
	@NotNull
	private String email;
	// The user name
	@NotNull
	private String name;

	// ==============
	// PUBLIC METHODS
	// ==============
	public User() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(long id) {
		this.id = id;
	}
	// Getter and setter methods
	// ...
} // class User