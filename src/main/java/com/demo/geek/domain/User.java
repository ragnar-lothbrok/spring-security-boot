package com.demo.geek.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {

	@Id
	@Column(updatable = false, nullable = false)
	@Size(min = 0, max = 50)
	private String username;

	@JsonIgnore
	@Size(min = 0, max = 500)
	private String password;

	@Email
	@Size(min = 0, max = 50)
	private String email;

	private boolean activated;

	@Size(min = 0, max = 100)
	@Column(name = "activationkey")
	private String activationKey;

	@Size(min = 0, max = 100)
	@Column(name = "resetpasswordkey")
	private String resetPasswordKey;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public String getActivationKey() {
		return activationKey;
	}

	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}

	public String getResetPasswordKey() {
		return resetPasswordKey;
	}

	public void setResetPasswordKey(String resetPasswordKey) {
		this.resetPasswordKey = resetPasswordKey;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		User user = (User) o;

		if (!username.equals(user.username))
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return username.hashCode();
	}

	@Override
	public String toString() {
		return "User{" + "username='" + username + '\'' + ", password='"
				+ password + '\'' + ", email='" + email + '\''
				+ ", activated='" + activated + '\'' + ", activationKey='"
				+ activationKey + '\'' + ", resetPasswordKey='"
				+ resetPasswordKey + '\'' + '}';
	}
}
