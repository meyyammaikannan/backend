package com.socialmediaproj.entities;

import org.springframework.data.annotation.Id;
import java.util.*;

public class User {
	  @Id
	  private int id;
	  
	  public User(int id, String name, String email, String password, String userName, Date dob, String bio,
			List<String> following, List<String> followers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.dob = dob;
		this.bio = bio;
		this.following = following;
		this.followers = followers;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", userName="
				+ userName + ", dob=" + dob + ", bio=" + bio + ", following=" + following + ", followers=" + followers
				+ "]";
	}
	private String name;
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public List<String> getFollowing() {
		return following;
	}
	public void setFollowing(List<String> following) {
		this.following = following;
	}
	public List<String> getFollowers() {
		return followers;
	}
	public void setFollowers(List<String> followers) {
		this.followers = followers;
	}
	private String email;
	  private String password;
	  private String userName;
	  private Date dob;
	  private String bio;
	  List<String> following = new ArrayList<>();
	  List<String> followers= new ArrayList<>();
	  
	  
}
