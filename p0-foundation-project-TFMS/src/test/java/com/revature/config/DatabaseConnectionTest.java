package com.revature.config;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

public class DatabaseConnectionTest {
	@Test
	public void testDbCon() {
		Connection connection= DatabaseConnection.getConnection();
		assertNotNull(connection);
	}

}
