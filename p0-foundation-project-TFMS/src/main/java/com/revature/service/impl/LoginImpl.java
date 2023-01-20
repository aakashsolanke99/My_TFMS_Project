package com.revature.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.xdevapi.Statement;
import com.revature.config.DatabaseConnection;
import com.revature.constant.Constant;
import com.revature.dao.impl.AssociateDaoImp;
import com.revature.model.Menu;
import com.revature.model.User;
import com.revature.service.Login;

public  class LoginImpl implements Login {
	
	private static final Logger logger= Logger.getLogger(AssociateDaoImp.class);

	
	
	static Scanner sc = new Scanner(System.in);
	private static Connection con = DatabaseConnection.getConnection();
    Menu m = new Menu();
    
	
	public void associateLogin() throws SQLException {
		int loggoff=0;
		do {
			logger.info(Constant.ENTER_LOGIN_DETAILS);
			System.out.print(Constant.ENTER_YOUR_USERNAME);
			String username = sc.nextLine();
			
			
			logger.info(Constant.ENTER_YOUR_PASSWORD);
			String password = sc.nextLine();
			
			java.sql.Statement stms=con.createStatement();
			ResultSet rs = stms.executeQuery(Constant.SELECT_FROM_ASSOCIATE_LOGIN);
			
			if(rs.next()) {
				if(username.equals(rs.getString(1)) && password.equals(rs.getString(2)) && (rs.getString(3).equals("associate"))) {
					logger.info(Constant.WELCOME);
					m.showMenu();
					
				}
				else {
					logger.info(Constant.WRONG_DETAILS_INSERTED_PLEASE_PROVIDE_CORRECT_DETAILS);
					logger.info(Constant.WANT_TO_ENTER_AGAIN_PRESS_1);
					int again=Integer.parseInt(sc.nextLine());
					loggoff=again;
				}
			}

			}while(loggoff==1);
	}
	
	public void associateRegistrstion() throws SQLException {
		int register=0;
		do {
			
			    logger.info(Constant.NEW_USER_REGISTRATION);
			    logger.info(Constant.ENTER_USERNAME);
			    String username=sc.nextLine();
			    logger.info(Constant.ENTER_PASSWORD);
			    String password=sc.nextLine();
			    logger.info(Constant.ENTER_ROLL_ADMIN_ASSOCIATE_TRAINE);
			    String roll=sc.nextLine();
				CallableStatement stms= (CallableStatement) con.prepareCall("{call Associate_Registrstion_details(?,?,?)}");
				stms.setString(1, username);
				stms.setString(2, password);
				stms.setString(3, roll);

				stms.execute();
				logger.info(Constant.NEW_USER_REGISTRATION_SUCESSFULLLY);
			
		}while(register==1);
		
	}
	
	
	public User getUser(User u) {
		Connection con=null;
		con=DatabaseConnection.getConnection();
		try {
			java.sql.Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("Select * from associate_login");
			while(rs.next())
			{
				if(u.getUsername().equals(rs.getString(1))&& u.getPassword().equals(rs.getString(2))) {
					u.setUsername(rs.getString(1));
					u.setPassword(rs.getString(2));
					u.setPassword(rs.getString(3));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {}
		return u;
	}
		
}

