package com.formation.parkout.entities;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Username {

    private String User;

    @NotEmpty
    @Size(min = 6)
    private String internalId;

    @NotEmpty
    @Size(min = 6)
    private String password;

    public Username(String internalId, String password) {
	this.internalId = internalId;
	this.password = password;
    }

    @Override
    public String toString() {
	return "Username [internalId=" + internalId + ", password=" + password
		+ "]";
    }

    public String getUser() {
	return User;
    }

    public void setUser(String user) {
	User = user;
    }

    public String getInternalId() {
	return internalId;
    }

    public void setInternalId(String internalId) {
	this.internalId = internalId;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}
