package com.revature.dao;

import java.sql.SQLException;

import com.revature.model.Associate;



public interface AssociateDaoMethod {

	
	public int addAssociateDetails(Associate  associate) throws SQLException;

	public void deleteDetails(String associateId) throws SQLException;

	public void showDetails() throws SQLException;
	
	public void showOneDetails(String associateid) throws SQLException;


	public void updateDetails(String associateId) throws SQLException;
	
}

