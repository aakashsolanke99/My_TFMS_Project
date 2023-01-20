package com.revature.service;

import java.sql.SQLException;

import com.revature.model.User;

public interface Login {
	
	public void associateLogin() throws SQLException;
	public void associateRegistrstion() throws SQLException;
	public User getUser(User u);
}
