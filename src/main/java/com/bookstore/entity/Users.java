package com.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	private int user_Id;
	private String email;
	private String full_Name;
	private String password;

 public Users() {
	 
 }

	public Users(String email, String full_Name, String password) {
		super();
		this.email = email;
		this.full_Name = full_Name;
		this.password = password;
	}
	public Users( Integer id, String email, String full_Name, String password) {
		super();
		this.user_Id=id;
		this.email = email;
		this.full_Name = full_Name;
		this.password = password;
	}
	// @Column(name = "user_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Identity Means new at table level
	public int getUser_Id() { // Auto means new at Database level
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "full_name")
	public String getFull_Name() {
		return full_Name;
	}

	public void setFull_Name(String full_Name) {
		this.full_Name = full_Name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
